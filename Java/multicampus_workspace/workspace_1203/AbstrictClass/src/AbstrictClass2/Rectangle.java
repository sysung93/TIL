package AbstrictClass2;

public class Rectangle extends Shape{
	double width;
	double height;
	
//  기본생성자 일부러 안만들음	
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
