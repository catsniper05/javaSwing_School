package unit03.event;

import java.awt.BorderLayout;

import javax.swing.*;

public class SwingLogin extends JFrame{
	
	JLabel lbId = new JLabel("���̵�", JLabel.CENTER);
	JLabel lbPwd = new JLabel("��й�ȣ", JLabel.CENTER);
	JLabel lbResult = new JLabel("������", JLabel.LEFT);
	
	JButton btnLogin = new JButton("�α���");
	JButton btnCancel = new JButton("���");
	
	JTextField tfIb = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	
	SwingLogin(){
		
		setLayout(new BorderLayout());
		
		JPanel p = new JPanel();
		add(p);
		
		ImageIcon img = new ImageIcon("images/robot.jpg");
		JLabel lbImage = new JLabel(img);
		p.add(lbImage);
		
		setTitle("�α���");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new SwingLogin();

	}

}
