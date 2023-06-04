package day17_;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class JFrame4Demo extends JFrame {
	JFrame4Demo() {
		setTitle("안녕, 스윙!");

		JPanel p = new JPanel();		
                JLabel l = new JLabel("안녕, 스윙!");
                JButton b = new JButton("버튼");
                p.add(l);
                p.add(b);//패널에추가
                add(p);//프레임에추가

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		// pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new JFrame4Demo();
	}
}

