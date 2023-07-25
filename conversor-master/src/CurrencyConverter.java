import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CurrencyConverter {
  private static final DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
  private static final String ERROR_MESSAGE = "Valor no válido.";
  private static final String PROGRAM_MESSAGE = "Programa Finalizado";
  private static final String CONTINUE_MESSAGE = "¿Desea continuar usando el programa?";

  public static void convert() {
    Currency[] currencies = Currency.getCurrencies();

    boolean continueProgram = true;

    while (continueProgram) {
      // Mostrar cuadro de diálogo para que el usuario elija la primera opción de
      // conversión.
      Currency change1 = (Currency) JOptionPane.showInputDialog(
          null,
          "Elija una opción:",
          "Conversor de Moneda",
          JOptionPane.QUESTION_MESSAGE,
          null,
          currencies,
          currencies[0]);

      // Mostrar cuadro de diálogo para que el usuario elija la segunda opción de
      // conversión.
      Currency change2 = (Currency) JOptionPane.showInputDialog(
          null,
          "Elija otra opción diferente:",
          "Conversor de Moneda",
          JOptionPane.QUESTION_MESSAGE,
          null,
          currencies,
          currencies[0]);

      // Verificar que se haya elegido una moneda diferente para la segunda opción.
      while (change1 == change2) {
        JOptionPane.showMessageDialog(null, "Debe elegir una moneda diferente para la segunda opción.");
        change2 = (Currency) JOptionPane.showInputDialog(
            null,
            "Elija otra opción diferente:",
            "Conversor de Moneda",
            JOptionPane.QUESTION_MESSAGE,
            null,
            currencies,
            currencies[0]);
      }

      // Solicitar al usuario que ingrese la cantidad en la primera moneda.
      double amount = getDoubleInput("Ingrese la cantidad en " + change1.getName() + ":");

      // Realizar la conversión de la primera moneda a USD (main currency).
      double usd = amount / change1.getConversionFactor();

      // Realizar la conversión de USD (main currency) a la segunda moneda.
      double result = usd * change2.getConversionFactor();

      // Formatear el resultado antes de mostrarlo
      String formattedResult = decimalFormat.format(result);

      JOptionPane.showMessageDialog(
          null,
          amount + " " + change1.getName() + " son " + formattedResult + " en " + change2.getName());

      // Preguntar al usuario si desea continuar convirtiendo monedas.
      int confirm = JOptionPane.showConfirmDialog(
          null,
          CONTINUE_MESSAGE,
          "Confirmar",
          JOptionPane.YES_NO_OPTION);
      continueProgram = (confirm == JOptionPane.YES_OPTION);
    }

    JOptionPane.showMessageDialog(null, PROGRAM_MESSAGE);
  }

  private static double getDoubleInput(String message) {
    while (true) {
      try {
        String input = JOptionPane.showInputDialog(message);
        if (input == null) {
          // Si el usuario cancela la entrada, finalizar el programa.
          JOptionPane.showMessageDialog(null, PROGRAM_MESSAGE);
          System.exit(0);
        }
        return Double.parseDouble(input.replace(",", "."));
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, ERROR_MESSAGE);
      }
    }
  }

  public static void main(String[] args) {
    convert();
  }
}