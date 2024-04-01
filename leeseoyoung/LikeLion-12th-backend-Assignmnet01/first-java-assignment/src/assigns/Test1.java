package assigns;

class Cylinder {
    public double PI = 3.14;    int centerX;
    int centerY;//
    double R;//
    int height = 10;//
    public Cylinder(int x, int y, double r) {
        centerX = x;
        centerY = y;
        R = r; // 생성자1: 정수 인자 x, y 와 실수 인자 r을 전달 받아서 해당 필드 값을 초기화
    }

    public Cylinder(int x, int y, int height, double r) {
        centerX = x;
        centerY = y;
        this.height = height;
        R = r; // 생성자2: 정수 인자 x, y, height 와 실수 인자 r을 전달 받아서 해당 필드 값을 초기화
    }

    public double circleArea() {
        return PI * R * R; // circleArea 메서드: PI를 이용하여 원의 면적 반환
    }

    public double volume() {
        return PI * R * R * height;// volume 메서드: 면적과 높이를 이용하여 부피를 반환
    }

    public double surfaceArea() {
        return 2 * PI * R * R + 2 * PI * R * height;// surfaceArea 메서드: PI를 이용하여 원기둥의 겉넓이를 반환
    }

    public Cylinder move(int dx, int dy) {
        centerX += dx;
        centerY += dy;
        return this;// move 메서드: 정수 인자 dx, dy를 전달 받아서 원의 중심 좌표를 이동
        // - 예: 필드 x가 1이고 dx가 10이면 x는 11로 변경되어야 함
        // 객체 자신을 반환
    }

    void print() {

        System.out.println("<" + centerX + "," + centerY + ":" + R + ">");

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
        System.out.println(c2.surfaceArea());
    }
}