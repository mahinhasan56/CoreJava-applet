package com.FaysalBinHasan;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FrameMenu extends JFrame{
	String[] m1={"New","Open","Save","Close"};
	String[] m2={"Cut","Copy","Paste","Delete"};
	String[] m3={"Format","Import","Export","Shift"};
	String[] m4={"Refractor","Rename","Export","Shift"};
		JMenuBar bar;
		JMenu menu1,menu2,menu3;
		
		JMenuItem item1[],item2[],item3[],item4[];
		public FrameMenu(){
			bar=new JMenuBar();
			menu1=new JMenu("File");
			menu2=new JMenu("Edit");
			menu3=new JMenu("Source");
			
			item1=new JMenuItem[4];
			
			for (int i = 0; i <=3; i++) {
				item1[i]=new JMenuItem(m1[i]);
				menu1.add(item1[i]);
				
			}
			
	   item2=new JMenuItem[4];
			
			for (int i = 0; i <=3; i++) {
				item2[i]=new JMenuItem(m2[i]);
				menu2.add(item2[i]);
				
			}
	  item3=new JMenuItem[4];
			
			for (int i = 0; i <=3; i++) {
				item3[i]=new JMenuItem(m3[i]);
				menu3.add(item3[i]);
				
			}
			
			bar.add(menu1);
			bar.add(menu2);
			bar.add(menu3);
			add(bar,"North");
			setVisible(true);
			setSize(300,400);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}
		public  static void main (String[]args){
			new  FrameMenu();
		}
}
