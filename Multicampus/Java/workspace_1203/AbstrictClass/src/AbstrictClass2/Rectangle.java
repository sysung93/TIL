package AbstrictClass2;

public class Rectangle extends Shape{
	double width;
	double height;
	
//  �⺻������ �Ϻη� �ȸ�����	
	public Rectangle(double height, double width) {
		this.width = width;
		this.height = height;
	}
	

	@Override
	public void setSurface() {
		this.surface = this.width * this.height;
		
	}
	@Override
	public void setLength() {
		this.length = (this.width + this.height) * 2;
		
	}
	
	

}
