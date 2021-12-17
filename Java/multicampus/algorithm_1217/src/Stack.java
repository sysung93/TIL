
//객체지향프로그래밍에서 설명하는 클래스만들에 적합함
public class Stack<T> {//////////////////////////////
    private T stack[];//////////////////////////////
    private int top; //배열의 인덱스 - 스택의 최상위를 가르켜야 한다.

    @SuppressWarnings("unchecked")
    public Stack()
    {
        stack = (T[])new Object[10];//////////////////////////////
        top=-1;  //스택이 비어있는 상황
    }

    @SuppressWarnings("unchecked")
    public Stack(int size)
    {
        if( size<10)
            size=10;
        stack = (T[])new Object[size];//////////////////////////////
        top=-1;  //스택이 비어있는 상황
    }

    public void push(T a)  //////////////////////////////
    {
        if(isFull())// 에러처리를 위쪽에서
        {
            System.out.println("Stack Overflow");
            return; //함수를 종료한다. void 일때는 return;
        }

        top++;
        stack[top]=a;
    }

    public T pop() //////////////////////////////
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return null; //힘수가  return 을 해야하는데 보낼값을 없을때는 -1을 보내는게 관습이다
            //////////////////////////////
        }

        T temp = stack[top]; //최상위데이터를 가져옴
        top--;//하나 지우는 동작
        return temp;
    }

    boolean isFull()
    {
        if (top==stack.length-1)
            return true;
        else
            return false;
    }

    boolean isEmpty()
    {
        if (top==-1)
            return true;
        else
            return false;
    }

    //스택 쓰다가 스택의 정보를 초기화
    public void init()
    {
        top=-1;
    }


    public T peek()//////////////////////////////
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return null; //힘수가  return 을 해야하는데 보낼값을 없을때는 -1을 보내는게 관습이다
//////////////////////////////s
        }

        T temp = stack[top]; //최상위데이터를 가져옴 - 삭제전의 최상위 데이터 확인만
//////////////////////////////
        return temp;
    }

}

