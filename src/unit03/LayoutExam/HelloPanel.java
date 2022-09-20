package unit03.LayoutExam;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloPanel extends JFrame{
	
	HelloPanel(){
		
		JPanel p = new JPanel();
		p.setBackground(Color.orange);
		add(p);
		
		JButton btm1 = new JButton("��ư1");
		JButton btm2 = new JButton("��ư2");
		
		btm1.setBackground(Color.yellow);
		btm2.setBackground(Color.pink);
		
		p.add(btm1);
		p.add(btm2);
		
		setTitle("�ȳ� �г�");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new HelloPanel();

	}

}
