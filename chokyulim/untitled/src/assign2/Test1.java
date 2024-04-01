package assign2;

class Cylinder {
    final double PI = 3.14; // 원주율 3.14를 정적 상수 PI로 선언과 동시에 초기화
    int x; // 정수형 원의 중심 좌표 x, y를 선언
    int y;
    double r; // 실수형 원의 반지름 r을 선언
    int height = 10; // 정수형 원기둥의 높이 height를 10으로 선언과 동시에 초기화

    public Cylinder(int x, int y, double r) { // 생성자1: 정수 인자 x, y 와 실수 인자 r을 전달 받아서 해당 필드 값을 초기화
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public Cylinder(int x, int y, double r, int height) { // 생성자2: 정수 인자 x, y, height 와 실수 인자 r을 전달 받아서 해당 필드 값을 초기화
        this.x = x;
        this.y = y;
        this.height = height;
        this.r = r;
    }
    double circleArea() { // PI를 이용하여 원의 면적 반환
        double area;
        area = r * r * this.PI;
        return area;
    }
    double volume() { // 면적과 높이를 이용하여 부피를 반환
        double vol;
        vol = circleArea() * this.height;
        return vol;
    }
    double surfaceArea() { // PI를 이용하여 원기둥의 겉넓이를 반환
        double sur;
        sur = (r * r * this.PI * 2) + (2 * this.r * this.height * this.PI);
        return sur;
    }
    Cylinder move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
        return this;
    }
    void print() {
        System.out.println("<"+x+","+y+":"+r+">");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(3,5,6);
        c1.move(10,10).print();
        System.out.println(c1.circleArea());
        System.out.println(c1.volume());
        System.out.println(c1.surfaceArea());

        System.out.println();
        Cylinder c2 = new Cylinder(5,8, 10, 5);
        c2.move(12,17).print();
        System.out.println(c2.circleArea());
        System.out.println(c2.volume());
        System.out.println(c2.surfaceArea());
    }
}
