import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		// Mostrar un cuadro de diálogo con opciones para el usuario
		Object[] options = { "Convertir Monedas", "Conversor de Temperatura", "Salir" };
		int choice = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Convertir",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		// Si elige "Salir", mostrar un mensaje y salir del programa.
		if (choice == 2) {
			JOptionPane.showMessageDialog(null, "Programa Cerrado");
			System.exit(0);
		}

		// Si elige "Convertir Monedas"
		if (choice == 0) {
			CurrencyConverter.convert();
		}

		// Si elige "Conversor de Temperatura"
		if (choice == 1) {
			TemperatureConverter.convert();
		}
	}
}