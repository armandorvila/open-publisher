package com.armandorv.publisher.client;

import javax.naming.NamingException;

import com.armandorv.publisher.client.view.MainFrame;

public class Runner implements Runnable {

	@Override
	public void run() {
		try {
			MainFrame frame = new MainFrame();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws NamingException {
			new Runner().run();
	}

}
