package unit03.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener{
	
	JLabel lbId = new JLabel("���̵�", JLabel.CENTER);
	JLabel lbPwd = new JLabel("��й�ȣ", JLabel.CENTER);
	JLabel lbResult = new JLabel("������", JLabel.LEFT);
	
	JButton btnLogin = new JButton("�α���");
	JButton btnCancel = new JButton("���");
	
	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	
	SwingLogin(){
		
		setLayout(new BorderLayout());
	
		
		ImageIcon image = new ImageIcon("images/robot.png");
		JLabel lbImage = new JLabel(image);
		add(lbImage, BorderLayout.NORTH);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(0, 2));
		add(p1, BorderLayout.CENTER);
		
		p1.add(lbId);
		p1.add(tfId);
		p1.add(lbPwd);
		p1.add(tfPwd);
		p1.add(btnLogin);
		p1.add(btnCancel);
		
		add(lbResult, BorderLayout.SOUTH);
		
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
		
		setTitle("�α���");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new SwingLogin();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnLogin) {
			String strId = tfId.getText();
			String strPwd = new String(tfPwd.getPassword());
			if(strId.length() == 0) {
				lbResult.setText("���̵� �Է��ϼ���.");
			}
			else if(strPwd.length() == 0) {
				lbResult.setText("��й�ȣ�� �Է��ϼ���.");
			}
			else
				lbResult.setText(strId+"���� ��й�ȣ�� "+strPwd+"�Դϴ�.");
				
				
				
		}
		else if(e.getSource() == btnCancel) {
			lbResult.setText("����Ͽ����ϴ�.");
			tfId.setText("");
			tfPwd.setText("");
		}
			
		
	}
	

}
