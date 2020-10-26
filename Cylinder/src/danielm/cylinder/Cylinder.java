package danielm.cylinder;

public class Cylinder extends Circle{

	public double height;
	
	public Cylinder(double radius, double height) {
		super(radius);
		if(height<0) {
			height=0;
		}
		else
		this.height=height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
	 return	this.getArea()*this.height;
	}
	
}
