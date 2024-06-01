package ar.edu.UADE.controladores;

import java.util.List;
import java.util.Set;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ar.edu.UADE.modelo.ModeloVista1;
import ar.edu.UADE.modelo.Persona;

public class ControladoresGrupo {
	
	public static void seleccionarGrupo(ModeloVista1 modelo, JComboBox<String> comboGrupos, JTable tablaGrupo) {
		DefaultTableModel modeloTablaGrupo=new DefaultTableModel();
		Object[] titulos= {"ID","Nombre","Apellido"};
		modeloTablaGrupo.setColumnIdentifiers(titulos);
		int indiceCombo=comboGrupos.getSelectedIndex();
		List<Persona> grupoSeleccionado;
		
		Set<String> claves=modelo.getClavesGrupo();
		Object[] arregloClaves=claves.toArray();
		
		if(indiceCombo==0) {
			grupoSeleccionado=modelo.getGrupo(arregloClaves[0].toString()).getIntegrantes();
		}else {
			String seleccion=comboGrupos.getSelectedItem().toString();
			grupoSeleccionado=modelo.getGrupo(seleccion).getIntegrantes();
		}
		for(Persona persona:grupoSeleccionado) {
			Object[] fila=new Object[3];
			fila[0]=persona.getId();
			fila[1]=persona.getNombre();
			fila[2]=persona.getApellido();
			modeloTablaGrupo.addRow(fila);
		}
		tablaGrupo.setModel(modeloTablaGrupo);
		tablaGrupo.validate();
	}

}
