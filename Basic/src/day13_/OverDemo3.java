package day13_;

class Overload{
	void calc() {
		System.out.println("매개 변수가 없음");
	}

	void calc(int width) {
		System.out.println("정사각형의 넓이"+ width * width);
	}
	void calc(int width, int height) {
		System.out.println("직사각형의 넓이"+ width * height);
    }
	void calc(int width, int height, int depth) {
		System.out.println("직육면체의 부피" + width * height * depth);
	}
}
public class OverDemo3 {

	public static void main(String[] args) {
		Overload ol = new Overload();
		
		switch(args.length) {
		case 0:
			ol.calc();
			break;
		case 1:
			ol.calc(Integer.parseInt(args[0]));
			break;
		case 2:
			ol.calc(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
			break;
		case 3:
			ol.calc(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
			break;
			default:
			System.out.println("매개변수가 많음");
		}
	}

}
