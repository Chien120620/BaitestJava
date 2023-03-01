package Bai1;

public class circle {
	private double radius=1;
	
	public circle() {}
	
	public circle(double radius) {
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getCircumference() {
		return radius*2*Math.PI;
	}
	public String toString() {
        return "Circle[" + super.toString()+
                ",radius=" + radius + ",Area=" + getArea() + ",Circumfrence="+ getCircumference()+
                ']';
    }
	 

}
