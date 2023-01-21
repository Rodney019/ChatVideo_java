package com.videoChatJava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class VideoChat  extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VideoChat() {
		super("Video chat java");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize( 600 , 400 );
		this.setLocationRelativeTo(null);
		
		
		JPanel contentPane = (JPanel) this.getContentPane();
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.blue);
		contentPane.add(panel1, BorderLayout.CENTER);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.red);
		panel2.setPreferredSize(new Dimension(100,0));
		contentPane.add(panel2 , BorderLayout.EAST);
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.green);
		panel3.setPreferredSize(new Dimension(100,0));
		contentPane.add(panel3 , BorderLayout.WEST);
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.black);
		panel4.setPreferredSize(new Dimension(0,100));
		contentPane.add( panel4 , BorderLayout.SOUTH);
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.gray);
		panel5.setPreferredSize(new Dimension(0,100));
		contentPane.add(panel5  , BorderLayout.NORTH);
	}

	public static void main(String[] args) throws Exception {
		
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		VideoChat vidchat = new VideoChat();
		vidchat.setVisible(true);
		
	}

}
