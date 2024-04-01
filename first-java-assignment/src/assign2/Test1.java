package assign2;

import bj_2439.Main;

class Cylinder{
	private final static double PI = 3.14;
	private int x, y;
	private double r;

	private int height = 10;

	Cylinder(int x, int y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}

	Cylinder(int x, int y, double r, int height){
		this.x = x;
		this.y = y;
		this.r = r;
		this.height = height;
	}

	public double circleArea(){
		return PI * Math.pow(this.r,2);
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
	void print() {
		System.out.println("<"+this.x+","+this.y+":"+this.r+">");
	}

}
// 메인메서드 수행시 이렇게 출력되도록
//<13,15:6.0>
//113.04
//1130.4
//602.88
//<17,25:10.0>
//314.0
//1570.0
//942.0
public class Test1 {
	public static void main(String[] args) {
			Cylinder c1 = new Cylinder(3,5, 6);

			c1.move(10,10).print();
			System.out.println(c1.circleArea());
			System.out.println(c1.volume());
			System.out.println(c1.surfaceArea());

			Cylinder c2 = new Cylinder(5,8, 10, 5);
			c2.move(12,17).print();
			System.out.println(c2.circleArea());
			System.out.println(c2.volume());
			System.out.println((float) c2.surfaceArea());

	}

}
