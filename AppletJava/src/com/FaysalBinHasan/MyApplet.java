package com.FaysalBinHasan;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class MyApplet extends Applet {
	//<applet code='MyApplet.class' width= '200' height ='200'>
	int x, y;
	StringBuffer strBuffer;

	public void init() {
		x = 100;
		y = 200;
	}

	@Override
	public void start() {
		System.out.println("starting the applet ");
	}

	@Override
	public void stop() {
		System.out.println("stopping the applet ");
	}

	@Override
	public void destroy() {
		System.out.println("destroying the applet");
	}

	@Override
	public void paint(Graphics g) {
		g.drawLine(x, y, 200, 200);
		g.drawOval(x, y+50, 200, 200);
		g.drawString("learning applet",200 ,200);

	}
}