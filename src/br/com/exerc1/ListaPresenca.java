package br.com.exerc1;

import java.awt.*;
import javax.swing.*;

public class ListaPresenca<E> extends JFrame{
	private static final long serialVersionUID = 1L;


	ListaPresenca(){   
		JFrame frame = new JFrame("Lista de presença");
		JButton button;
		JCheckBox checkbox;
		button = new JButton("Adiciona texto");
		checkbox = new JCheckBox("Nome");
		
		frame.add(button);
		frame.add(checkbox);
		frame.setLayout(new FlowLayout());
		frame.setSize(300,300);  
		frame.setVisible(true);  
		

	}
	public static void main(String[] args){
				
		new ListaPresenca();

		}
}