package day17_;

import javax.swing.JFrame; // 프레임 생성에 필요한 패키지 임포트

public class HelloSwingDemo {
	public static void main(String[] args) {
		JFrame f = new JFrame();  // 프레임 생성

		f.setTitle("안녕, 스윙!"); // 프레임 타이틀
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 100);      // 프레임 크기
		f.setVisible(true);   // 프레임을 화면에 출력
	}
}
