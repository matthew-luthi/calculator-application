package eventlisteners.eventlisteners.operations;

import applicationlogic.Calculator;
import eventlisteners.ButtonListener;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddListener extends ButtonListener {

    public AddListener(Calculator calculator, JTextField numberField) {
        super(calculator, numberField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getCalculator().add(getLastEnteredNumericValue());
        getNumberField().setText(getNumberField().getText() + e.getActionCommand());

        System.out.println(getCalculator().getValue());
    }
}
