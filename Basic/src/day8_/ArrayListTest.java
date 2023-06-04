package day8_;

import java.util.*;

public class ArrayListTest {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("MILK");         // 인덱스는 0에서 시작
		list.add("BREAD");
		list.add("BUTTER");

		list.add(1, "APPLE");      // 인덱스 1에 “APPLE"을 삽입

		list.set(2, "GRAPE");      // 인덱스 2의 원소를 “GRAPE"로 대체

		list.remove(3);             // 인덱스 3의 원소를 삭제

		/*for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));*/
		for (String s : list) //for-each 사용
			System.out.println(s);
	}
}
