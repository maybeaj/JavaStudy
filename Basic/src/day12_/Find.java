package day12_;
class Box{
	  private int a;
	  private int b;
	  private int c;
	  private int mul;
	  Box(int width, int height, int depth) {
	     a = width ;
	     b = height ;
	     c = depth ;
	     this.count();
	   
	 }
	  private void count() {
		  mul = a * b * c;
	  }
	  public int getTotal() {  
	       return mul;
	  } 
	  public int getWidth() {  
	       return a;           
	  }
	  public int getHeight() {
	     return b;
	  }
	  public int getDepth() {
	     return c;
	  }
	  public void setWidth(int width) {
		  a = width;
	  }
	  public void setHeight(int height) {
		  b = height;
	  }
	  public void setDepth(int depth) {
		  c = depth;
	  }
	
	}

public class Find {

	public static void main(String[] args) {
		int mul;
		Box mybox1 = new Box(10,20,30);
		mul = mybox1.getTotal();
		System.out.println("mybox1의 부피: " + mul);
		System.out.println("mybox1의 높이: "+ mybox1.getHeight());
		mybox1.setHeight(100);
		System.out.println("mybox1의 높이: "+ mybox1.getHeight());
		
	}

}
