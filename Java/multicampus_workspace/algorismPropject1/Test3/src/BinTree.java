import java.util.Comparator;
// �����˻�Ʈ��

public class BinTree<K,V> {
	// ���
	static class Node<K,V> {
		private K key;					// Ű ��
		private V data;					// ������
		private Node<K,V> left;			// ���� �ڽ� ���
		private Node<K,V> right;		// ������ �ڽ� ���

		// ������
		Node(K key, V data, Node<K,V> left, Node<K,V> right) {
			this.key   = key;
			this.data  = data;
			this.left  = left;
			this.right = right;
		}

		// Ű ���� ��ȯ
		K getKey() {
			return key;
		}

		// �����͸� ��ȯ
		V getValue() {
			return data;
		}

		// �����͸� ���
		void print() {
			System.out.println(data);
		}
	}

	private Node<K,V> root;								// ��Ʈ
	private Comparator<? super K> comparator = null;	// ����

	// ������
	public BinTree() {
		root = null;
	}

	// ������
	public BinTree(Comparator<? super K> c) {
		this();
		comparator = c;
	}

	// �� Ű ���� ��
	private int comp(K key1, K key2) {
		return (comparator == null) ? ((Comparable<K>)key1).compareTo(key2)
											 : comparator.compare(key1, key2);
	}

	// Ű�� ���� �˻�
	public V search(K key)	{
		Node<K,V> p = root;								// ��Ʈ�� �ָ�

		while (true) {
			if (p == null)								// �� �̻� �������� ������
				return null;							// �˻� ����
			int cond = comp(key, p.getKey());			// key�� ��� p�� Ű�� ��
			if (cond == 0)								// ������
				return p.getValue();					// �˻� ����
			else if (cond < 0)							// key ���� ������
				p = p.left;								// ���� ���� Ʈ������ �˻�
			else										// key ���� ũ��
				p = p.right;							// ������ ���� Ʈ������ �˻�
		}
	}

	// node�� ��Ʈ�� �ϴ� ���� Ʈ���� ���<K,V>�� ����
	private void addNode(Node<K,V> node, K key, V data) {
		int cond = comp(key, node.getKey());
		if (cond == 0)
			return;										// key�� �����˻�Ʈ���� �̹� ����
		else if (cond < 0) {
			if (node.left == null)
				node.left = new Node<K,V>(key, data, null, null);
			else
				addNode(node.left, key, data);			// ���� ���� Ʈ���� �ָ�
		} else {
			if (node.right == null)
				node.right = new Node<K,V>(key, data, null, null);
			else
				addNode(node.right, key, data);			// ������ ���� Ʈ���� �ָ�
		}
	}

	// ��带 ����
	public void add(K key, V data) {
		if (root == null)
			root = new Node<K,V>(key, data, null, null);
		else
			addNode(root, key, data);
	}

	// Ű ���� key�� ��带 ����
	public boolean remove(K key) {
		Node<K,V> p = root;								// ��ĵ ����  ���
		Node<K,V> parent = null;						// ��ĵ ����  ����� �θ� ���
		boolean isLeftChild = true;						// p�� parent�� ���� �ڽ� ����ΰ�?

		while (true) {
			if (p == null)								// �� �̻� �������� ������
				return false;							// �� Ű ���� �����ϴ�. 
			int cond = comp(key, p.getKey());			// key�� ��� p�� Ű ���� ��
			if (cond == 0)								// ������
				break;									// �˻� ����
			else {
				parent = p;								// ������ �������� ���� �θ� ����
				if (cond < 0) {							// key ���� ������
					isLeftChild = true;					// ���� �ڽ����� ������
					p = p.left;							// ���� ����Ʈ������ �˻�
				} else {								// key ���� ũ��
					isLeftChild = false;				// ������ �ڽ����� ������
					p = p.right;						// ������ ���� Ʈ������ �˻�
				}
			}
		}

		if (p.left == null) {							// p���� ���� �ڽ��� ����
			if (p == root)					 
				root = p.right;
			else if (isLeftChild)
				parent.left  = p.right;					// �θ��� ���� �����Ͱ� ������ �ڽ��� ����Ŵ
			else
				parent.right = p.right;					// �θ��� ������ �����Ͱ� ������ �ڽ��� ����Ŵ
		} else if (p.right == null) {					// p���¿����� �ڽ��� ����
			if (p == root)
				root = p.left;
			else if (isLeftChild)
				parent.left  = p.left;					// �θ��� ���� �����Ͱ� ���� �ڽ��� ����Ŵ
			else
				parent.right = p.left;					// �θ��� ������ �����Ͱ� ���� �ڽ��� ����Ŵ
		} else {
			parent = p;
			Node<K,V> left = p.left;					// ���� Ʈ�� ��� ���� ū ���
			isLeftChild = true;
			while (left.right != null) {				// ���� ū ��� left�� �˻�
				parent = left;
				left = left.right;
				isLeftChild = false;
			}
			p.key  = left.key;							// left�� Ű ���� p�� �ű�
			p.data = left.data;							// left�� �����͸�  p�� �ű�
			if (isLeftChild)
				parent.left  = left.left;				// left�� ����
			else
				parent.right = left.left;				// left�� ����
		}
		return true;
	}

	// node�� ��Ʈ�� �ϴ� ���� Ʈ���� ��带 Ű ���� ������������ ���
	private void printSubTree(Node node) {
		if (node != null) {
			printSubTree(node.left);								// ���� ���� Ʈ���� Ű ���� ������������ ���
			System.out.println(node.key + " " + node.data);			// node�� ���
			printSubTree(node.right);								// ������ ���� Ʈ���� Ű ���� ������������ ���
		}
	}

	// ��� ��带 Ű ���� ������������ ���
	public void print() {
		printSubTree(root);
	}
}