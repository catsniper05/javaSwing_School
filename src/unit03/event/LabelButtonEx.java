package unit03.event;

import javax.swing.*;

public class LabelButtonEx extends JFrame{
	
	LabelButtonEx() {
		
		JPanel p = new JPanel();
		add(p);
		
		JLabel lb = new JLabel("제임스 고슬링 입니더!");
		p.add(lb);
		
		ImageIcon img = new ImageIcon("images/gosling.jpg");
		JLabel lbImage = new JLabel(img);
		p.add(lbImage);
		
		ImageIcon normalImg = new ImageIcon("images/normalIcon.gif");
		ImageIcon pressedImg = new ImageIcon("images/pressedIcon.gif");
		ImageIcon rolloverImg = new ImageIcon("images/rolloverIcon.gif");
		
		JButton btn = new JButton("call~", normalImg);
		btn.setPressedIcon(pressedImg);
		btn.setRolloverIcon(rolloverImg);
		p.add(btn);
		
		setTitle("라벨과 버튼예제");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new LabelButtonEx();

	}

}
