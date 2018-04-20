package com.FaysalBinHasan;

import javax.swing.*;
public class ChkDemo extends JFrame{
	public ChkDemo(){
			JRadioButton  r1=new JRadioButton("Male");
			JRadioButton r2= new  JRadioButton("Female");
			ButtonGroup buttonGroup=new  ButtonGroup();
			 buttonGroup.add(r1);
			 buttonGroup.add(r2);
			add(r1,"East");
			add(r2,"West");
			setVisible(true);
			pack();
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
	}
	public static void main(String[]args){
		new ChkDemo();
	}

}
