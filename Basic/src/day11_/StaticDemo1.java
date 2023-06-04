package day11_;

class Instance{
	  static int count = 0;
	  Instance(){
	    count++;
	  }
	}
public class StaticDemo1 {
	  public static void main(String args[]) {
	    int objectcount = Integer.parseInt(args[0]);
	    Instance objectArray[] = new Instance[objectcount];
	                                       // Instance 클래스의 배열객체 objectArray[]  생성)
	    for(int i=0; i<objectcount; i++){
	      objectArray[i] = new Instance();                                        // 객체 생성
	      System.out.println( Instance.count + "번째 객체 생성");
	    }
	    System.out.println("생성된 객체의 수는 " + Instance.count + "개");
	  }
	}
