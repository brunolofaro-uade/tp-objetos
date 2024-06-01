package interfacesGraficas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interfaz5 extends JFrame{
	
	public Interfaz5() {
		super("Interfaz 5");
		this.setLayout(new BorderLayout());
		JPanel panel1=new JPanel();
		panel1.setLayout(new GridLayout(8,1,2,2));
		this.add(panel1,BorderLayout.CENTER);
		
		Container cont1=new Container();
		cont1.setLayout(new GridLayout(1,2,2,2));
		JLabel label1=new JLabel("Texto1");
		JTextField txt1=new JTextField();
		cont1.add(label1);
		cont1.add(txt1);
		panel1.add(cont1);
		
		Container cont2=new Container();
		cont2.setLayout(new GridLayout(1,2,2,2));
		JLabel label2=new JLabel("Texto2");
		JTextField txt2=new JTextField();
		cont2.add(label2);
		cont2.add(txt2);
		panel1.add(cont2);
		
		
		class ManejadorEvento implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==txt1) {
					JOptionPane.showMessageDialog(null, "Origen txt1");
				}
				if(e.getSource()==txt2) {
					JOptionPane.showMessageDialog(null, "Origen txt2");
				}
				
			}
			
		}
		
		class ManejadorTeclado implements KeyListener{

			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Se presiono la tecla "+e.getKeyChar());
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}
		
		ManejadorEvento manejador=new ManejadorEvento();
		txt1.addActionListener(manejador);
		txt2.addActionListener(manejador);
		txt1.addKeyListener(new ManejadorTeclado());
		
		
	}

}
