import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Clase que implementa el listener de los botones del Buscaminas. De alguna
 * manera tendr√° que poder acceder a la ventana principal. Se puede lograr
 * pasando en el constructor la referencia a la ventana. Recuerda que desde la
 * ventana, se puede acceder a la variable de tipo ControlJuego
 * 
 * @author jesusredondogarcia
 **
 */
public class ActionBoton implements ActionListener {
	VentanaPrincipal ventana;
	int i;
	int j;

	public ActionBoton() {
		// TODO
	}

	public ActionBoton(VentanaPrincipal ventana, int i, int j) {
		this.ventana = ventana;
		this.i = i;
		this.j = j;
	}

	/**
	 * Acci√≥n que ocurrir√° cuando pulsamos uno de los botones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if (ventana.getJuego().abrirCasilla(i, j)) { // Si la casilla no es una mina, accedes al valor de la casilla
			
			ventana.mostrarNumMinasAlrededor(i, j); // Quita el botÛn y aÒade la etiqueta de la mina.
			
			
			if (ventana.getJuego().esFinJuego()) {
				ventana.mostrarFinJuego(false);
				
			}
			}else {
				ventana.mostrarFinJuego(true);
			}
		} 
	

}
