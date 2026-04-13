# Debit Card PIN Setter

## Project Functionality
This JavaFX application allows users to create a secure 4-digit PIN.

The program checks:
- PIN must be exactly 4 digits
- PIN cannot be repeated digits (1111)
- PIN cannot be sequential (1234 or 4321)
- PIN must match confirmation field

Valid PINs show green styling.
Invalid PINs show red styling.

## How to Run
1. Open in IntelliJ
2. Run Main.java
3. Enter PIN and confirm
4. Click Set PIN

## Features
- JavaFX UI using VBox
- Regex validation
- Error handling
- Styled feedback (red/green)