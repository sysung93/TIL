package AbstrictClass2;

public abstract class Shape {
	double surface; //면적
	double length; //길이
	
	public double getSurface() {
		return surface;
	}
	
	public double getLength() {
		return length;
	}
	
	public abstract void setSurface();
	public abstract void setLength();
}
