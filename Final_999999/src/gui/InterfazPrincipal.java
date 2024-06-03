package gui;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.Sistema;
import excepciones.AnimalNoExisteException;
import excepciones.ClienteNotFoundException;
import view.ClienteView;
import view.ClienteViewModel;

public class InterfazPrincipal extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InterfazPrincipal(ClienteViewModel model){
		super("Interfaz Radio y Check");
		JPanel panelSuperior=new JPanel();
		panelSuperior.setLayout(new GridLayout(2,1,5,5));
		JComboBox<String> comboClientes = new JComboBox<String>();
		JLabel label = new JLabel();
		List<ClienteView> clientes = model.GetClientes();
		for(ClienteView c : clientes) {
			comboClientes.addItem(c.getNombre());	
		}
		panelSuperior.add(comboClientes);
		panelSuperior.add(label);
		this.add(panelSuperior,BorderLayout.NORTH);
		
		class ManejadorCombo implements ItemListener {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				int index = comboClientes.getSelectedIndex();
				ClienteView cv = clientes.get(index);
				try {
					label.setText(Integer.toString(Sistema.getInstance().obtenerCabezasPorCliente(cv.getCuit(), 13)));
				} catch (ClienteNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (AnimalNoExisteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
		comboClientes.addItemListener(new ManejadorCombo());
	}
}
