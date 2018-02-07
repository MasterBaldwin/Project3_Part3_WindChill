import javax.swing.*;

public class WindChill {
// Written by: Mike Baldwin
// Prompts the user to enter a temperature and a wind speed, and then displays the
// wind chill temperature.

public static void main(String[] args) {
    JPanel panel = new JPanel();
    JTextField tempVar = new JTextField(5);
    JTextField wSpeedVar = new JTextField(5);
    double temp;
    int windSpeed, chillIndex, confirmCode;

    panel.add(new JLabel("Temperature"));
    panel.add(tempVar);
    panel.add(new JLabel("Wind Speed"));
    panel.add(wSpeedVar);

    confirmCode = JOptionPane.showConfirmDialog(
            null,
            panel,
            "Wind Chill Calculator",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null);

    if (confirmCode == JOptionPane.OK_OPTION) {
        temp = Double.parseDouble(tempVar.getText());
        windSpeed = Integer.parseInt(wSpeedVar.getText());
        chillIndex = (int) (35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow(windSpeed, 0.16));
        JOptionPane.showMessageDialog(null, "The wind chill index is " + chillIndex);
    }
}
}
