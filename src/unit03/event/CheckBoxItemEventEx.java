package unit03.event;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener{
	
	JCheckBox fruit1 = new JCheckBox("���");
	JCheckBox fruit2 = new JCheckBox("��");
	JCheckBox fruit3 = new JCheckBox("ü��");
	
	int num=0;
	int a = 100, b=500, c=2000;
	
	JLabel lb = new JLabel("���100��, ��500��, ä��2000��");
	JLabel lb_reult = new JLabel("���� "+ num +"���Դϴ�.");
	
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
		
		setTitle("üũ�ڽ��̺�Ʈ����");
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
		lb_reult.setText("���� "+ num +"���Դϴ�.");
		
		
	}

}
