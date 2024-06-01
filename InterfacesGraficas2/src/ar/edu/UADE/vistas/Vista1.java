package ar.edu.UADE.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Set;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ar.edu.UADE.controladores.ControladoresGrupo;
import ar.edu.UADE.modelo.ModeloVista1;
import ar.edu.UADE.modelo.Persona;

public class Vista1 extends JFrame{
	
	JComboBox<String> comboGrupos=new JComboBox<String>();
	JTable tablaGrupo=new JTable();
	
	public Vista1(ModeloVista1 modelo) {
		super("Ejemplo de uso de tablas con combos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setBackground(Color.WHITE);
		JPanel panelSuperior=new JPanel();
		panelSuperior.setLayout(new GridLayout(1,2,5,5));
		
		for(String cv:modelo.getClavesGrupo()) {
			comboGrupos.addItem(modelo.getGrupo(cv).getNombre());	
		}
		
		panelSuperior.add(new JLabel("Grupos"));
		panelSuperior.add(comboGrupos);
		this.add(panelSuperior,BorderLayout.NORTH);
		
		JPanel panelCentral=new JPanel();
		panelCentral.setLayout(new BorderLayout());
		
		this.add(panelCentral,BorderLayout.CENTER);
		
		
		DefaultTableModel modeloTablaGrupo=new DefaultTableModel();
		Object[] titulos= {"ID","Nombre","Apellido"};
		modeloTablaGrupo.setColumnIdentifiers(titulos);
		
		Set<String> claves=modelo.getClavesGrupo();
		Object[] arregloClaves=claves.toArray();
		
		for(Persona persona:modelo.getGrupo(arregloClaves[0].toString()).getIntegrantes()) {
			Object[] fila=new Object[3];
			fila[0]=persona.getId();
			fila[1]=persona.getNombre();
			fila[2]=persona.getApellido();
			modeloTablaGrupo.addRow(fila);
		}
		tablaGrupo.setModel(modeloTablaGrupo);
		JScrollPane scrollTabla=new JScrollPane(tablaGrupo);
		
		panelCentral.add(scrollTabla,BorderLayout.CENTER);
		
		/*-------Se crea la clase interna que implementa el Listener-----*/
		class ManejadorCombo implements ItemListener{
			@Override
			public void itemStateChanged(ItemEvent e) {
				ControladoresGrupo.seleccionarGrupo(modelo, comboGrupos, tablaGrupo);
			}       
		}
		
		/*-------Se instancia un objeto de la clase interna-----*/
		ManejadorCombo manejadorCombo=new ManejadorCombo();
		
		/*-------Se agrega el manejador al componente-----*/
		comboGrupos.addItemListener(manejadorCombo);
		
		/*-----Tambien podria haberle agregado el manejador de la siguiente manera--------*/
		//comboGrupos.addItemListener(new ManejadorCombo());
	}

}
