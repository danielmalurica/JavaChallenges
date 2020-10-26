package danielm.wallarea;

public class Wall {
	public double width, height;
	
	public Wall() {
		width=0;
		height=0;
	}
	
	public Wall(double width, double height) {
		if(width<0) {
			width=0;
		}
		if(height<0) {
			height=0;
		}
		
		else {
			this.width=width;
			this.height=height;
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return this.height*this.width;
	}
	
}
