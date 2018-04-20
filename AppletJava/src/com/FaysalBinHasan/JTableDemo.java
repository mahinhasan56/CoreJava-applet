package com.FaysalBinHasan;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo extends JFrame{
	
	JTable table;
	JScrollPane jscrollpane;
	Object data[][]={{1001,"tarik ahmed",12000},

			{1001,"tarik ahmed",12000},
			{1002,"sarik ahmed",15000},
			{1003,"tdhrik ahmed",17000},
			{1004,"karik ahmed",19000},
			{1005,"parek ahmed",22000},
			{1006,"tarik ahmed",12000},
			{1007,"adtik ahmed",15000},
			{1008,"jdrik ahmed",17000},
			{1009,"opytdrik ahmed",19000},
			{10010,"agehrek ahmed",22000},{1001,"tarik ahmed",12000},
			{1002,"sarik ahmed",15000},
			{1003,"tdhrik ahmed",17000},
			{1004,"karik ahmed",19000},
			{1005,"parek ahmed",22000},
			{1006,"tarik ahmed",12000},
			{1007,"adtik ahmed",15000},
			{1008,"jdrik ahmed",17000},
			{1009,"opytdrik ahmed",19000},
			{10010,"agehrek ahmed",22000},{1001,"tarik ahmed",12000},
			{1002,"sarik ahmed",15000},
			{1003,"tdhrik ahmed",17000},
			{1004,"karik ahmed",19000},
			{1005,"parek ahmed",22000},
			{1006,"tarik ahmed",12000},
			{1007,"adtik ahmed",15000},
			{1008,"jdrik ahmed",17000},
			{1009,"opytdrik ahmed",19000},
			{10010,"agehrek ahmed",22000},{1001,"tarik ahmed",12000},
			{1002,"sarik ahmed",15000},
			{1003,"tdhrik ahmed",17000},
			{1004,"karik ahmed",19000},
			{1005,"parek ahmed",22000},
			{1006,"tarik ahmed",12000},
			{1007,"adtik ahmed",15000},
			{1008,"jdrik ahmed",17000},
			{1009,"opytdrik ahmed",19000},
			{10010,"agehrek ahmed",22000}
			};
	Object column[]={"id","name","salary"};

	public JTableDemo(){
		//table=new JTable(10,20);
	
		table=new JTable(data,column);
		jscrollpane=new JScrollPane(table);
		table.setBackground(Color.yellow);
		table.setBackground(Color.green);
		Font font=new Font("Dialog",Font.BOLD+Font.ITALIC, 20);
		table.setFont(font);
	
		add(jscrollpane,"North");
		//add(table,"North");
		setVisible(true);
		//setSize(300,400);
		pack();
		//setLocation(333, 333);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public  static void main (String[]args){
		new  JTableDemo();
	}

}

