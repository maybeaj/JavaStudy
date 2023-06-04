package day10_1;

class Box {
	  int width;       
	  int height;      
	  int depth;      
	  int vol;
	  public Box(int a, int b, int c)  {       
	    width = a;                                  
	    height = b;
	    depth = c;
	  }
	  public int volume() {
	    vol =  width * height * depth;
	    System.out.println("Volume is "+vol);
	    return vol;
	 }}
class BoxTestDemo {
	  public static void main(String args[]) {
	    Box mybox1 = new Box(20, 40, 15);
	    Box mybox2 = new Box(10, 20, 30);
	    mybox1.volume();
	    mybox2.volume();
	  }}

