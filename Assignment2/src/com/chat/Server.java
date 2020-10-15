package com.chat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Server extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel p1;
	
	public Server() {
		JLabel lbl1 = new JLabel();
		setSize(350, 500);
		setLocation(400,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Server().setVisible(true);;
	}

}
