package com.FaysalBinHasan;


import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EmpInfo extends JFrame{
	JLabel l1,l2,l3,l4;
	public EmpInfo(String id,String name){
		setLayout(new GridLayout(2, 2));
		l1=new JLabel("Id");
		l2=new JLabel(id);
		l3=new JLabel("name is");
		l4=new JLabel(name);
		setVisible(true);
		setLocation(300,200);
		pack();
		setDefaultCloseOperation(	EXIT_ON_CLOSE);
	}

}