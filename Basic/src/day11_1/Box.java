package day11_1;

class Box {
	   int width;
	   int height;
	   int depth;
	public Box()  { 
	     this(1,1,1);
	   }
	public Box(int w) {
	     this(w,1,1);
	   }  
    public Box(int w, int h) {
		  this(w,h,1);
		}
	public Box(int w, int h, int d) {   
		    width=w;  
		    height=h;
		    depth=d;  
		}
		  
}
class BoxDemo{
	public static void main(String args[]) {
		Box mybox1 = new Box();
		Box mybox2 = new Box(5);
		Box mybox3 = new Box (5,10);
		Box mybox4 = new Box (5,10,15);
		System.out.println("mybox1: "+mybox1.width+" "+mybox1.height+" "+mybox1.depth);
		System.out.println("mybox2: "+mybox2.width+" "+mybox2.height+" "+mybox2.depth);
		System.out.println("mybox3: "+mybox3.width+" "+mybox3.height+" "+mybox3.depth);
		System.out.println("mybox4: "+mybox4.width+" "+mybox4.height+" "+mybox4.depth);
	}
}
	  
