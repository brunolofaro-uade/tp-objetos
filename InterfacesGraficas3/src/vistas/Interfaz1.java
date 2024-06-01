package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.MatteBorder;

import controladores.ControladorConfirmacion;

public class Interfaz1 extends JFrame{

	JRadioButton radio1,radio2;
	JCheckBox checkParcial,checkFinal;
	
	public Interfaz1() {
		super("Interfaz Radio y Check");
		this.setLayout(new BorderLayout());
		
		JPanel panelCentral=new JPanel();
		panelCentral.setLayout(new GridLayout(5,1,2,2));
		panelCentral.setBackground(Color.white);
		panelCentral.setBorder(new MatteBorder(20,20,20,20,Color.white) );
		
		
		Container contRadio1=new Container();
		contRadio1.setLayout(new GridLayout(1,2,2,2));
		
		radio1= new JRadioButton();
		radio1.setBackground(Color.white);
		radio2= new JRadioButton();
		radio2.setBackground(Color.white);
		ButtonGroup grupo1=new ButtonGroup();
		grupo1.add(radio1);
		grupo1.add(radio2);
		
		contRadio1.add(new JLabel("Aprobado"));
		contRadio1.add(radio1);
		
		Container contRadio2=new Container();
		contRadio2.setLayout(new GridLayout(1,2,2,2));
		contRadio2.add(new JLabel("Desaprobado"));
		contRadio2.add(radio2);
		
		Container contCheck1=new Container();
		contCheck1.setLayout(new GridLayout(1,2,2,2));
		contCheck1.add(new JLabel("Rindio parcial"));
		checkParcial=new JCheckBox();
		checkParcial.setBackground(Color.white);
		
		contCheck1.add(checkParcial);
		Container contCheck2=new Container();
		contCheck2.setLayout(new GridLayout(1,2,2,2));
		contCheck2.add(new JLabel("Rindio final"));
		checkFinal=new JCheckBox();
		checkFinal.setBackground(Color.white);
		contCheck2.add(checkFinal);
		
		JButton btnAceptar=new JButton("Aceptar");
		/*Agregado del handler con una clase anonima*/
		btnAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ControladorConfirmacion.evento1(checkFinal.isSelected(),checkParcial.isSelected(),radio1.isSelected());
			}
			
		});
		
		
		
		panelCentral.add(contRadio1);
		panelCentral.add(contRadio2);
		panelCentral.add(contCheck1);
		panelCentral.add(contCheck2);
		panelCentral.add(btnAceptar);
		this.add(panelCentral,BorderLayout.CENTER);
		
		
	}
	
}
