package com.rajasekar.testing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingExample extends JFrame {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingExample example = new SwingExample();
		example.init();
		
		
	}
	
	public void init(){
		setTitle("Simple example");
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setEnabled(false);
        JButton quitButton = new JButton("Quit");
        System.out.println(quitButton.getText());
        panel.add(quitButton);
        Container content = getContentPane();
        content.add(BorderLayout.CENTER, panel);
        pack();
        
        for(Component component : panel.getComponents()){
        	component.setEnabled(false);
        }
        
	}

}
