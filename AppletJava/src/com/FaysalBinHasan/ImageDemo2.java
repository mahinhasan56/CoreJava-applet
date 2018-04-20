package com.FaysalBinHasan;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageDemo2 extends JFrame {
	ImageIcon icon;

	public ImageDemo2() {
		icon=new ImageIcon("Image1.jpg");
		add(new JLabel(icon),"North");
		
		icon=new ImageIcon("Image2.jpg");
		add(new JLabel(icon),"South");
		//setLayout(new GridLayout(5,4));
		/*icon=new ImageIcon("Image2.jpg");
		for (int i = 0; i <=19; i++) {
			add(new JLabel(icon));
		}*/
		setVisible(true);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public  static void main (String[]args){
		new  ImageDemo2();
	}
}
