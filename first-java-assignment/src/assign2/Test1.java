package assign2;

class Cylinder{
	final static double PI = 3.14;
	int x; int y;
	double r;

	int height = 10;

	Cylinder(int x, int y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}

	Cylinder(int x, int y, int height){
		this.x = x;
		this.y = y;
		this.height = height;
	}

	public double circleArea(){
		return PI * this.r * this.r;
	}
	public double volume(){
		return this.circleArea() * this.height;
	}
	public double surfaceArea(){
		return (PI * 2 * this.r)*(this.r+this.height);
	}

	public Cylinder move(int dx, int dy){
		this.x += dx;
		this.y += dy;
		return this;
	}
}

public class Test1 {

}
