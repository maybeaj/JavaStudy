package day17_;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ComponentDemo2 extends JFrame { //implements ActionListner 인터페이스는 implements씀 상속할때
	ComponentDemo2() {
		setTitle("원 넓이 구하기");
		setLayout(new BorderLayout(10, 10));
		showNorth();
		showCenter();
		showSouth();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 105);
		setVisible(true);
	}
	void showNorth() {
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel panel = new JPanel(new GridLayout(2, 0));
		JLabel l1 = new JLabel("원의 반지름"); 
		JLabel l2 = new JLabel("원의 넓이"); 
		JTextField t1 = new JTextField(10);
 		JTextField t2 = new JTextField(10); t2.setEnabled(false);
		p1.add(l1); p1.add(t1);	
		p2.add(l2); p2.add(t2);
		panel.add(p1); panel.add(p2);
		add(panel, BorderLayout.NORTH);

	}
	void showCenter() {
		JPanel panel = new JPanel();
		JTextArea area = new JTextArea(30,20);
		area.setText("이 영역에 원의 넓이를\n계산하는 과정이 나타납니다.");
		area.setEditable(false);
		area.setForeground(Color.RED);
		panel.add(area);
		add(panel, BorderLayout.CENTER);

	}
	void showSouth() {
		String[] color = {"red", "blue"};
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		JButton cal = new JButton("계산");
		JButton reset = new JButton("리셋");
		JComboBox cb = new JComboBox(color);
		panel.add(cal); 
		panel.add(cb);
		panel.add(reset);
		add(panel, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new ComponentDemo2();
	}
}
