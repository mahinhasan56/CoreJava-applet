

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//<applet code='applet2' codebase="." width= '300' height ='300'></applet>
public class applet2 extends Applet {
	int x = 10;
	int y = 20;

	Color color[] = { Color.red, Color.yellow, Color.blue, Color.red, Color.yellow, Color.blue ,Color.red, Color.yellow, Color.blue, Color.yellow };

	@Override
	public void init(){
	//	this.setSize(500,500);
	}
	@Override
	public void paint(Graphics g) {
		for (int i = 0; i < 10; i++) {
			g.setColor(color[i]);
			g.fillOval(x ,y, 100, 120);
			x=x+10;
			y=y+10;
				
		}
	}
}
