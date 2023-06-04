package day12_;
class Fruit {
	  private int a;
	  private int s;
	  private int g;
	  private int sum;
	  Fruit(int apple, int straw, int grapes) {
	     a = apple ;
	     s = straw ;
	     g = grapes ;
	     this.count();
	 }
	  private void count() {  
	     sum = a + s + g;
	  }
	  public int getTotal() {  
	       return sum;
	  } 
	  public int getApple() {  
	       return a;           
	  }
	  public int getStraw() {
	     return s;
	  }
	  public int getGrapes() {
	     return g;
	  }
	 public void setApple(int ap) {  
		 if(ap < 150)
	       a = ap;           
	  }
	}

public class MethodDemo2 {
	  public static void main(String[] args) {
		    int total;
		    Fruit f1 = new Fruit(30, 30, 30);
		    total = f1.getTotal();   
		    System.out.println("객체 f1의 총 개수 = " + total);
		    System.out.println("객체 f1의 apple 개수 = " + f1.getApple());
		    System.out.println("객체 f1의 straw 개수 = " + f1.getStraw());
		    System.out.println("객체 f1의 grapes 개수 = "+ f1.getGrapes());
		    f1.setApple(100);
		    System.out.println("객체 f1의 수정 apple 개수 = " + f1.getApple());
		    f1.setApple(200);
		    System.out.println("객체 f1의 수정 apple 개수 = " + f1.getApple());
		  }

}
