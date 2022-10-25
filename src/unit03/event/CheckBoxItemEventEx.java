package unit03.event;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener{
	
	JCheckBox fruit1 = new JCheckBox("사과");
	JCheckBox fruit2 = new JCheckBox("배");
	JCheckBox fruit3 = new JCheckBox("체리");
	
	int num=0;
	int a = 100, b=500, c=2000;
	
	JLabel lb = new JLabel("사과100원, 배500원, 채리2000원");
	JLabel lb_reult = new JLabel("현재 "+ num +"원입니다.");
	
	CheckBoxItemEventEx(){
		
		JPanel p = new JPanel();
		add(p);
		
		p.add(lb);
		p.add(fruit1);
		p.add(fruit2);
		p.add(fruit3);
		p.add(lb_reult);
		
		fruit1.addItemListener(this);
		fruit2.addItemListener(this);
		fruit3.addItemListener(this);
		
		setTitle("체크박스이벤트예제");
		setSize(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new CheckBoxItemEventEx();

	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getItem() == fruit1)
				num = num + a;
			if(e.getItem() == fruit2)
				num = num + b;
			if(e.getItem() == fruit3)
				num = num + c;
			
		}
		else if(e.getStateChange() == ItemEvent.DESELECTED){
			if(e.getItem() ==  fruit1)
				num = num - a;
			if(e.getItem() ==  fruit2)
				num = num - b;
			if(e.getItem() ==  fruit3)
				num = num - c;
			
		}
		lb_reult.setText("현재 "+ num +"원입니다.");
		
		
	}

}
