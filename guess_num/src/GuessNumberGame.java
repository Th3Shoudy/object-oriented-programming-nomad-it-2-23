import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNumberGame extends JFrame {

    int secretNumber;

    int attempts = 0;

    JLabel messageLabel;
    JTextField inputField;
    JButton checkButton;

    public GuessNumberGame() {

        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;

        setTitle("Отгадай число");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        messageLabel = new JLabel("Введи число от 1 до 100");

        inputField = new JTextField(10);

        checkButton = new JButton("Проверь");

        add(messageLabel);
        add(inputField);
        add(checkButton);

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int userNumber = Integer.parseInt(inputField.getText());

                attempts++;

                if (userNumber < secretNumber) {
                    messageLabel.setText("Больше!" + attempts);

                } else if (userNumber > secretNumber) {
                    messageLabel.setText("Меньше!" + attempts);

                } else {
                    messageLabel.setText("Отгадал за " + attempts + " попыток!");
                    checkButton.setEnabled(false);
                }

                inputField.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new GuessNumberGame();
    }
}