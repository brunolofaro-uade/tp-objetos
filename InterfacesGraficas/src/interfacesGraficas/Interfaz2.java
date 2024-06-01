package interfacesGraficas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interfaz2 extends JFrame{

	JTextField campoNombre,campoApellido;
	
	public Interfaz2() {
		super("Ejemplo Layout null");
		this.setLayout(new BorderLayout());

		JPanel panel1=new JPanel();
		panel1.setLayout(null);
		
		Container contNombre=new Container();
		contNombre.setBounds(50, 10, 200, 30);
		contNombre.setLayout(new GridLayout(1,2,2,2));
		JLabel labelNombre=new JLabel("Nombre");
		campoNombre=new JTextField();
		contNombre.add(labelNombre);
		contNombre.add(campoNombre);
		panel1.add(contNombre);
		
		Container contApellido=new Container();
		contApellido.setBounds(50, 50, 200, 30);
		contApellido.setLayout(new GridLayout(1,2,2,2));
		JLabel labelApellido=new JLabel("Apellido");
		campoApellido=new JTextField();
		contApellido.add(labelApellido);
		contApellido.add(campoApellido);
		panel1.add(contApellido);
		
		
		Container contBotones=new Container();
		contBotones.setLayout(new GridLayout(1,2,2,2));
		contBotones.setBounds(50,85,200,30);
		
		/*CONSTRUCCION DEL BOTON ACEPTAR*/
		JButton btnAceptar=new JButton("Aceptar");
		
		/*CLASE INTERNA*/
		class HandlerBtnAceptar implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(campoNombre.getText()+" "+campoApellido.getText());
			}
		}
		
		/*INSTANCIACION DEL MANEJADOR*/
		HandlerBtnAceptar handlerBtnAceptar=new HandlerBtnAceptar();
		
		/*ASIGNACION DEL MANEJADOR AL BOTON*/
		btnAceptar.addActionListener(handlerBtnAceptar);
		
		
		/*CONSTRUCCION DEL BOTON BORRAR*/
		JButton btnBorrar=new JButton("Borrar");
		
		/*CLASE ANONIMA*/
		btnBorrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				campoNombre.setText("");
				campoApellido.setText("");
			}
			
		});
		
		contBotones.add(btnAceptar);
		contBotones.add(btnBorrar);
		
		panel1.add(contBotones);
		this.add(panel1,BorderLayout.CENTER);
		
	}
	
}
