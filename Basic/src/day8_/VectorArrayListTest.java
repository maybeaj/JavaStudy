package day8_;
import java.util.*;
public class VectorArrayListTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
			//LinkedList al = new LinkedList();
			//Vector al = new Vector();
		Integer n = 10;
		al.add("Hello World!");    // 인덱스는 0에서 시작      
						    // 문자열
		al.add(n);                                             // 정수 객체
		al.add(20);                                           // 정수
		System.out.println("size :" + al.size());
		for (int i = 0; i < al.size(); i++) {
			System.out.println("element " + i + " :" + al.get(i));
		}
		String s = (String)al.get(0);                      // 형변환 필요
		Integer n1 = (Integer) al.get(1);
		int n2 = (int) al.get(2);
		System.out.println("s = " + s + " n1 = " + n1 + " n2 = " + n2);
	}
}
