package br.com.exerc1;

import java.awt.*;
import javax.swing.*;

public class ListaPresenca extends JFrame{
	private static final long serialVersionUID = 1L;

	ListaPresenca(){   
		JFrame frame = new JFrame("Lista de presença");
		JButton button,button1, button2, button3,button4;
		button = new JButton("button 1");
		button1 = new JButton("button 2");
		button2 = new JButton("button 3");
		button3 = new JButton("button 4");
		button4 = new JButton("button 5");
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.setLayout(new FlowLayout());
		frame.setSize(300,300);  
		frame.setVisible(true);  


	}

	public static void main(String[] args){
		
		ListaPresenca janela = new ListaPresenca();
		/*
		janela.setSize(270,340);
		janela.setVisible( true );
		*/
		new ListaPresenca();

		}
}
