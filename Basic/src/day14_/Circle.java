package day14_;

public class Circle {
	class Point{
		int x;
		int y;		
	    public Point(int xp, int yp) {
			x = xp;
			y = yp;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public void circleMove(int xp, int yp) {
			this.x = xp;
			this.y = yp;
		}
		
	}
	int radius;
	Point center;//point 객체이름이 center
	final double PI = 3.14;
	public Circle(int x, int y, int r) {
		center = new Point(x,y);
		radius = r;
		
	}
	public void printCenter() {
		System.out.println("CENTER = ("+ center.getX() + " ," + center.getY() + ")");
	}
	public double calArea() {
		return PI * radius * radius;
	}
	public void circleMove(int x, int y) {
		this.center = new Point (x,y);
	}
}
