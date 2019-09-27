package br.com.exerc1;

import java.awt.*;
import javax.swing.*;

public class ListaPresenca extends JFrame{
	private static final long serialVersionUID = 1L;


	ListaPresenca(){   
		JFrame frame = new JFrame("Lista de presença");
		frame.setLayout(new GridLayout(2, 2));
		
		JButton button;
		JCheckBox checkbox;
		JPanel painel;
		JTextField caixaTexto;
		
		button = new JButton("Adiciona texto");
		checkbox = new JCheckBox("Nome");
		caixaTexto = new JTextField();
		painel = new JPanel();
        painel.setLayout(new GridLayout(1, 0));
        

		
		frame.add(button);
		frame.add(checkbox);
		frame.add(painel);
		frame.add(caixaTexto);
		
		frame.setLayout(new FlowLayout());
		frame.setSize(300,300);  
		frame.setVisible(true);  
		

	}
	
	public static void main(String[] args){
				
		new ListaPresenca();

	}
}