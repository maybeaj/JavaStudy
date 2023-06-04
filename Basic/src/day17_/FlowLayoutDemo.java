package day17_;

import java.awt.*;
import javax.swing.*;
public class FlowLayoutDemo extends JFrame {
	FlowLayoutDemo() {
		setTitle("플로우 레이아웃!");
		JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		// JPanel p = new JPanel();
		// p.setLayout(new FlowLayout(FlowLayout.RIGHT));				
		JButton b1 = new JButton("B 1");
		JButton b2 = new JButton("버튼 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button Four");
		p.add(b1); p.add(b2); p.add(b3); p.add(b4);
        add(p);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 110);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutDemo();
	}
}
