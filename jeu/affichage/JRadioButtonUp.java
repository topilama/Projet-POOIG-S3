package jeu.affichage;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import jeu.options.Option;

class JRadioButtonUp extends JRadioButton{
	public JRadioButtonUp(String s, boolean selected, Option o, int numero){
		super(s,selected);
		addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				if (isSelected()){
					o.setValue(numero);
				}
			}
		});
	}
}