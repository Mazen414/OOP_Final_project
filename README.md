# Java Banking System (OOP Final Project)

A console-based banking application built using Java. This project demonstrates core Object-Oriented Programming (OOP) principles such as Inheritance, Polymorphism, Encapsulation, and Interfaces.

##  Features
* **Account Management:** Create Savings and Checking accounts.
* **Transactions:** Deposit, Withdraw, and Transfer funds between accounts.
* **Safety Features:** * Input validation (prevents negative numbers).
    * Error handling (prevents crashes on invalid inputs).
    * Overdraft protection for Checking Accounts.
* **Reporting:** * View transaction history.
    * Calculate total bank assets.
    * Apply interest rates (Savings only).

##  Tech Stack
* **Language:** Java
* **IDE:** Eclipse
* **Version Control:** Git & GitHub

##  OOP Concepts Implemented
1.  **Inheritance:** `SavingsAccount` and `CheckingAccount` inherit from the abstract `Account` class.
2.  **Polymorphism:** The `withdraw()` method behaves differently for Savings (balance check) vs. Checking (overdraft check).
3.  **Encapsulation:** All account fields (`balance`, `accountNumber`) are private and accessed via methods.
4.  **Interfaces:** The `Transferable` interface enforces the logic for transferring funds.
5.  **Exception Handling:** `try-catch` blocks ensure the menu doesn't crash on invalid user input.

##  Project Structure
```text
src/com/banking/
├── Main.java             # Entry point (Menu System)
├── Bank.java             # Manages the list of accounts
├── Account.java          # Abstract parent class
├── SavingsAccount.java   # Child class with interest logic
├── CheckingAccount.java  # Child class with overdraft logic
├── Transaction.java      # Records transaction details
└── Transferable.java     # Interface for transfers