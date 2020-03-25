package lucong.cqupt;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Black {
	int x ,y,width,height;
	boolean live =true ;
 Black() {
	x=100;
	y=200;
	width=100;
	height=100;
}
public void draw(Graphics g) {

	if(live = true) g.fillRect(x, y, width, height);//画图，位置是double类型需要强制转型

	
}
public Black(int x,int y,int width,int height) {

	this.x=x;
	this.y=y;
	this.width = 100;
	this.height = 100;
}


}

