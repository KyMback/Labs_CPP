import javax.swing.*;
import java.awt.*;

public class Main {
    private final static double NumberOfInchesInOneMeter = 39.37007874;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridBagLayout());

        JLabel metersLabel = new JLabel("Метры");
        JTextField metersTextField = new JTextField();
        JButton metersButton = new JButton("Метры в дюймы");


        JLabel inchesLabel = new JLabel("Дюймы");
        JTextField inchesTextField = new JTextField();
        JButton inchesButton = new JButton("Дюймы в метры");

        metersButton.addActionListener((e) -> {
            String textToParsing = metersTextField.getText();
            if (tryParseDouble(textToParsing)) {
                inchesTextField.setText(Double.toString(metersToInches(Double.parseDouble(metersTextField.getText()))));
            }
        });
        inchesButton.addActionListener((e) -> {
            String textToParsing = inchesTextField.getText();
            if (tryParseDouble(textToParsing)) {
                metersTextField.setText(Double.toString(inchesToMeters(Double.parseDouble(inchesTextField.getText()))));
            }
        });

        panel.add(metersLabel, getDefaultConstraints(0, 0));
        panel.add(metersTextField, getDefaultConstraints(0, 1));
        panel.add(metersButton, getDefaultConstraints(0, 2));
        panel.add(inchesLabel, getDefaultConstraints(1, 0));
        panel.add(inchesTextField, getDefaultConstraints(1, 1));
        panel.add(inchesButton, getDefaultConstraints(1, 2));
        panel.add(new JLabel("Бгуир знания и стиль жизни"), getDefaultConstraints(1, 3));

        frame.setVisible(true);
    }

    private static GridBagConstraints getDefaultConstraints(int gridX, int gridY){
        return new GridBagConstraints(gridX, gridY,1,1,
                0,0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 0, 0);
    }

    private static boolean tryParseDouble(final String textToParsing){
        try {
            Double.parseDouble(textToParsing);
        }
        catch (NumberFormatException ex){
            return false;
        }
        return true;
    }

    private static double inchesToMeters(double inches){
        return inches / NumberOfInchesInOneMeter;
    }

    private static double metersToInches(double meters){
        return meters * NumberOfInchesInOneMeter;
    }
}
