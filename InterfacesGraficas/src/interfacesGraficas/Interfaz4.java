package interfacesGraficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interfaz4 extends JFrame{

	public Interfaz4() {
		this.setLayout(new BorderLayout());
		JPanel panel1=new JPanel();
		panel1.setBackground(Color.blue);
		
		
		class HandlerMouse implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				panel1.setBackground(Color.red);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel1.setBackground(Color.BLUE);
			}
			
		}
		
		panel1.addMouseListener(new HandlerMouse());
		this.add(panel1,BorderLayout.CENTER);
		
	}
	
}
