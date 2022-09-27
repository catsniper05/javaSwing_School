package unit03.event;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComButton extends JFrame implements ActionListener{
	
	JPanel p = new JPanel();
	JButton btnY = new JButton("�����");
	JButton btnP = new JButton("��ũ��");
	
	ComButton(){
		
		p.add(btnY);
		p.add(btnP);
		
		add(p);
		
		btnY.addActionListener(this);
		btnP.addActionListener(this);
		
		setTitle("���� �ٲٱ�");
		setSize(700, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new ComButton();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnY)
			p.setBackground(Color.yellow);
		else if(e.getSource()==btnP)
			p.setBackground(Color.pink);
		
	}
	
	

}
