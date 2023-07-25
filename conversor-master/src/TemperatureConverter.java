import javax.swing.JOptionPane;

enum TemperatureScale {
    CELSIUS("Celsius"),
    FAHRENHEIT("Fahrenheit"),
    KELVIN("Kelvin");

    private final String displayName;

    TemperatureScale(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

public class TemperatureConverter {
    private static final double CELSIUS_TO_FAHRENHEIT_FACTOR = 9.0 / 5.0;
    private static final double FAHRENHEIT_TO_CELSIUS_FACTOR = 5.0 / 9.0;

    public static void convert() {
        boolean continueProgram = true;

        while (continueProgram) {
            TemperatureScale fromScale = showScaleSelection("Elige una escala de temperatura para convertir:");
            if (fromScale == null) {
                break; // El usuario ha cerrado la ventana de diálogo o ha presionado 'Cancelar'.
            }

            String valueStr = JOptionPane.showInputDialog("Ingresa el valor a convertir:");
            if (valueStr == null) {
                break; // El usuario ha cerrado la ventana de diálogo o ha presionado 'Cancelar'.
            }

            double value;
            try {
                value = Double.parseDouble(valueStr);
            } catch (NumberFormatException e) {
                showErrorMessage("Valor no válido");
                continue;
            }

            TemperatureScale toScale = showScaleSelection("Elige la escala de temperatura de destino:");
            if (toScale == null) {
                break; // El usuario ha cerrado la ventana de diálogo o ha presionado 'Cancelar'.
            }

            double result = convertTemperature(value, fromScale, toScale);
            showResultMessage(value, fromScale, result, toScale);

            int continueOption = showConfirmationMessage("¿Deseas continuar usando el programa?");
            if (continueOption != JOptionPane.YES_OPTION) {
                continueProgram = false;
                showInformationMessage("Programa Finalizado");
            }
        }
    }

    private static TemperatureScale showScaleSelection(String message) {
        Object[] options = TemperatureScale.values();
        int option = JOptionPane.showOptionDialog(null, message,
                "Convertidor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
        return (option != JOptionPane.CLOSED_OPTION && option >= 0 && option < options.length) ? (TemperatureScale) options[option] : null;
    }

    private static double convertTemperature(double value, TemperatureScale fromScale, TemperatureScale toScale) {
        if (fromScale == toScale) {
            return value; // La misma escala, no es necesario hacer cálculos.
        }

        if (fromScale == TemperatureScale.CELSIUS && toScale == TemperatureScale.FAHRENHEIT) {
            return value * CELSIUS_TO_FAHRENHEIT_FACTOR + 32;
        }

        if (fromScale == TemperatureScale.FAHRENHEIT && toScale == TemperatureScale.CELSIUS) {
            return (value - 32) * FAHRENHEIT_TO_CELSIUS_FACTOR;
        }

        if (fromScale == TemperatureScale.CELSIUS && toScale == TemperatureScale.KELVIN) {
            return value + 273.15;
        }

        if (fromScale == TemperatureScale.KELVIN && toScale == TemperatureScale.CELSIUS) {
            return value - 273.15;
        }

        // Añadir aquí otras conversiones necesarias (por ejemplo, Fahrenheit a Kelvin).
        return Double.NaN; // Indicar que no se pudo realizar la conversión.
    }

    private static void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private static void showInformationMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private static int showConfirmationMessage(String message) {
        return JOptionPane.showConfirmDialog(null, message, "Confirmación", JOptionPane.YES_NO_OPTION);
    }

    private static void showResultMessage(double value, TemperatureScale fromScale, double result, TemperatureScale toScale) {
        String conversionMessage = String.format("%.2f grados %s son %.2f grados %s", value, fromScale.getDisplayName(), result, toScale.getDisplayName());
        showInformationMessage(conversionMessage);
    }
}
