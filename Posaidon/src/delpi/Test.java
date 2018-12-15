package delpi;

import javax.swing.*; 

import java.awt.*; 

import java.awt.event.*; 

public class Test extends JFrame {
	Test(String title) { 
        this.setSize(500,500); 
        setTitle(title); 
    }

    public static void main(String[] args) {
    	Test window = new Test("Hello CodeCall");
       window.setVisible(true);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}