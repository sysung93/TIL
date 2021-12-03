package AbstrictClass2;

public class Circle extends Shape{
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void setSurface() {
		this.surface = radius * radius * Math.PI;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLength() {
		this.length = radius * 2 * Math.PI;
		// TODO Auto-generated method stub
		
	}

	
}
