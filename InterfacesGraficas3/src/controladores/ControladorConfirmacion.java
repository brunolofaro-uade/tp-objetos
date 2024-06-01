package controladores;

import javax.swing.JOptionPane;

public class ControladorConfirmacion {
	
	public static void evento1(boolean examenFinal,boolean examenParcial, boolean radio) {
		String examenes="";
		if(examenFinal) {
			examenes=examenes+" Final ";
		}
		if(examenParcial) {
			examenes=examenes+" Parcial ";
		}
		if(radio) {
			JOptionPane.showMessageDialog(null, "Aprobo "+examenes,"Seleccion Radio",JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Desaprobo "+examenes,"Seleccion Radio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
}
