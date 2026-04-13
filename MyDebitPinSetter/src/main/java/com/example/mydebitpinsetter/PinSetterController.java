package com.example.mydebitpinsetter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

// JavaFX controller for setting and validating a debit card PIN
public class PinSetterController {

    @FXML
    private PasswordField pinField;

    @FXML
    private PasswordField confirmPinField;

    @FXML
    private Label messageLabel;

    // Handles the Set PIN button click
    @FXML
    private void handleSetPin() {
        String pin = pinField.getText();
        String confirmPin = confirmPinField.getText();

        resetStyles();

        // Check if both fields are filled
        if (pin.isEmpty() || confirmPin.isEmpty()) {
            showError("Please fill in both PIN fields.");
            return;
        }

        // Check if PIN is exactly 4 digits using regex
        if (!pin.matches("\\d{4}")) {
            showError("PIN must be exactly 4 digits.");
            return;
        }

        // Prevent repeated digits like 1111 or 2222
        if (pin.matches("(\\d)\\1{3}")) {
            showError("PIN cannot have all repeated digits.");
            return;
        }

        // Prevent simple sequential PINs
        if (pin.equals("1234") || pin.equals("4321")) {
            showError("Sequential PINs like 1234 or 4321 are not allowed.");
            return;
        }

        // Check if both PIN fields match
        if (!pin.equals(confirmPin)) {
            showError("PINs do not match! Please try again.");
            return;
        }

        // Success
        showSuccess("PIN set successfully!");
    }

    // Shows an error message and red borders
    private void showError(String message) {
        messageLabel.setText(message);
        messageLabel.setStyle("-fx-text-fill: red;");

        pinField.setStyle("-fx-border-color: red; -fx-border-width: 2;");
        confirmPinField.setStyle("-fx-border-color: red; -fx-border-width: 2;");
    }

    // Shows a success message and green borders
    private void showSuccess(String message) {
        messageLabel.setText(message);
        messageLabel.setStyle("-fx-text-fill: green;");

        pinField.setStyle("-fx-border-color: green; -fx-border-width: 2;");
        confirmPinField.setStyle("-fx-border-color: green; -fx-border-width: 2;");
    }

    // Resets styles before validating again
    private void resetStyles() {
        pinField.setStyle("");
        confirmPinField.setStyle("");
        messageLabel.setStyle("");
    }
}