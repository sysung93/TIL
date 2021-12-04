package AbstrictClass2;

public class Triangle extends Shape{
	double side;
	double height;
	
	

	public Triangle(int side, int height) {
		super();
		this.side = side;
		this.height = height;
	}

	@Override
	public void setSurface() {
		this.surface = (side * height) / 2; 
		
	}

	@Override
	public void setLength() {
		this.length = side + side + side;
		// TODO Auto-generated method stub
		
	}
	

}
