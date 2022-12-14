package unit03.event;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComButton extends JFrame implements ActionListener{
	
	JPanel p = new JPanel();
	JButton btnY = new JButton("노란색");
	JButton btnP = new JButton("핑크색");
	
	ComButton(){
		
		p.add(btnY);
		p.add(btnP);
		
		add(p);
		
		btnY.addActionListener(this);
		btnP.addActionListener(this);
		
		setTitle("배경색 바꾸기");
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
