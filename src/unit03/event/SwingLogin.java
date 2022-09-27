package unit03.event;

import java.awt.BorderLayout;

import javax.swing.*;

public class SwingLogin extends JFrame{
	
	JLabel lbId = new JLabel("아이디", JLabel.CENTER);
	JLabel lbPwd = new JLabel("비밀번호", JLabel.CENTER);
	JLabel lbResult = new JLabel("결과출력", JLabel.LEFT);
	
	JButton btnLogin = new JButton("로그인");
	JButton btnCancel = new JButton("취소");
	
	JTextField tfIb = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	
	SwingLogin(){
		
		setLayout(new BorderLayout());
		
		JPanel p = new JPanel();
		add(p);
		
		ImageIcon img = new ImageIcon("images/robot.jpg");
		JLabel lbImage = new JLabel(img);
		p.add(lbImage);
		
		setTitle("로그인");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new SwingLogin();

	}

}
