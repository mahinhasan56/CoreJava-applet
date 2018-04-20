package com.FaysalBinHasan;

import java.applet.Applet;
import java.awt.*;

public class applet3 extends Applet {
 Label l1,l2;
 TextField t1,t2;
 Button b1,b2;
 @Override
	public void init(){
		l1=new Label("Enter id");
		l2=new Label("Enter name");
		t1=new  TextField("12");
		t2=new  TextField("12");
		b1=new Button("ok");
		b2=new Button("Cancel");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
	}
 
}
