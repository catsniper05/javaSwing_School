package unit03.event;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class RadioButtonltemEventEx extends JFrame implements ItemListener{
	
	JTextField src = new JTextField(8);
	JTextField des = new JTextField(8);
	JLabel lb = new JLabel("->");
	
	JRadioButton rbtn1 = new JRadioButton("decimal");
	JRadioButton rbtn2 = new JRadioButton("binary");
	JRadioButton rbtn3 = new JRadioButton("octal");
	JRadioButton rbtn4 = new JRadioButton("hex");
	
	ButtonGroup bg = new ButtonGroup();
	
	public RadioButtonltemEventEx() {
		
		JPanel p = new JPanel();
		add(p);
		
		p.add(src);
		p.add(lb);
		p.add(des);
		
		bg.add(rbtn1);
		bg.add(rbtn2);
		bg.add(rbtn3);
		bg.add(rbtn4);
		
		p.add(rbtn1);
		p.add(rbtn2);
		p.add(rbtn3);
		p.add(rbtn4);
		
		rbtn1.addItemListener(this);
		rbtn2.addItemListener(this);
		rbtn3.addItemListener(this);
		rbtn4.addItemListener(this);
		
		setTitle("진수변환예제");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new RadioButtonltemEventEx();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			
			String srcStr = src.getText().trim();
			int num = Integer.parseInt(srcStr);
			
			if(e.getItem() == rbtn1) {
				des.setText(srcStr);
			}
			else if(e.getItem() == rbtn2) {
				String temp = Integer.toBinaryString(num);
				des.setText(temp);
			}
			else if(e.getItem() == rbtn3) {
				String temp = Integer.toOctalString(num);
				des.setText(temp);
			}
			else if(e.getItem() == rbtn4) {
				String temp = Integer.toHexString(num);
				des.setText(temp);
			}
		}
		
	}

}
