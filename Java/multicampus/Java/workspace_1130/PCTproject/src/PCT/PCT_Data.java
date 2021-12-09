package PCT;

public class PCT_Data {
	//변수선언
	private String name = "";
	private int write = 0;
	private int word = 0;
	private int ppt = 0;
	private int spread = 0;
	private int total = 0;
	private String grade ="";
	
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWrite() {
		return write;
	}
	public void setWrite(int write) {
		this.write = write;
	}
	public int getWord() {
		return word;
	}
	public void setWord(int word) {
		this.word = word;
	}
	public int getPpt() {
		return ppt;
	}
	public void setPpt(int ppt) {
		this.ppt = ppt;
	}
	public int getSpread() {
		return spread;
	}
	public void setSpread(int spread) {
		this.spread = spread;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	//생성자
	public PCT_Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//메소드
	public PCT_Data(String name, int write, int word, int ppt, int spread) {
		super();
		this.name = name;
		this.write = write;
		this.word = word;
		this.ppt = ppt;
		this.spread = spread;
	}

	public void calculate() {
		total = write + word + ppt + spread;
		switch(total / 200) {
		case 5:
		case 4: grade = "A"; break;
		case 3: grade = "B"; break;
		case 2: grade = "C"; break;
		default : grade = "D";
		} 

	}	
}
	
