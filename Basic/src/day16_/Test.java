package day16_;

//Point 클래스 설계
class Point {
 private double x;
 private double y;
 
 public Point(double x, double y) {
     this.x = x;
     this.y = y;
 }
 
 public double getX() {
     return x;
 }
 
 public double getY() {
     return y;
 }
}

//Circle 클래스 설계
class Circles extends Point {
 private double radius;
 
 public Circles(double x, double y, double radius) {
     super(x, y);
     this.radius = radius;
 }
 
 public double getRadius() {
     return radius;
 }
 
 public double getArea() {
     return Math.PI * radius * radius;
 }
}

//Test 클래스 설계
public class Test {
 public static void main(String[] args) {
     Circles circle = new Circles(0, 0, 5);
     
     // 원의 중심 출력
     System.out.println("원의 중심: (" + circle.getX() + ", " + circle.getY() + ")");
     
     // 반지름 출력
     System.out.println("반지름: " + circle.getRadius());
     
     // 원의 면적 출력
     System.out.println("원의 면적: " + circle.getArea());
 }
}