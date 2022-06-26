package chapter08;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	private static final long serialVersionUID = 2L;

	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(300,300);
		this.setVisible(true);
	}

	//JFrame 제공하는 hook메서드 인데 써도 되고 안써도 됨 (MFC같네..)
	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "내가 최고!!";
		graphics.drawString(msg, 100, 100);
	}

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("Head First Design Patterns");
	}
}
