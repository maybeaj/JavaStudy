package day10_;

class Box1 {
	  int width;
	  int height;
	  int depth;  
	  public void volume() {   // 메소드
	    int vol;
	    vol = width * height * depth;
	    System.out.println("Volume is "+vol);
	  }
	} 
	class TwoBox1 {
	  public static void main(String args[]) {
	    Box1 mybox1 = new Box1();
	    Box1 mybox2 = new Box1();
	    int vol1, vol2;
	    mybox1.width = 20;
	    mybox1.height = 40;
	    mybox1.depth = 15;
	    mybox2.width = 10;
	    mybox2.height = 20 ;
	    mybox2.depth = 30;
	    mybox1.volume();
	    mybox2.volume();  
	}}
