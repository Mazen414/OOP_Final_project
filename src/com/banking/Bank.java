package com.banking;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the collection of accounts in the banking system.
 * Handles adding, finding, deleting, and reporting on accounts.
 */
public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    /**
     * Adds a new account to the bank's database.
     * @param account The Account object (Savings or Checking) to add.
     */
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account created successfully: " + account.getAccountNumber());
    }

    /**
     * Searches for an account by its ID.
     * @param accountNumber The String ID to search for.
     * @return The Account object if found, or null if not found.
     */
    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        System.out.println("Error: Account " + accountNumber + " not found.");
        return null;
    }

    /**
     * Deletes an account from the system.
     * @param accountNumber The ID of the account to remove.
     * @return true if deleted, false if not found.
     */
    public boolean deleteAccount(String accountNumber) {
        Account accountToDelete = findAccount(accountNumber);
        
        if (accountToDelete != null) {
            accounts.remove(accountToDelete);
            return true; 
        }
        return false; 
    }

    /**
     * Calculates and prints the total assets held by the bank.
     */
    public void printTotalAssets() {
        double totalAssets = 0;
        
        for (Account acc : accounts) {
            totalAssets += acc.getBalance(); 
        }
        
        System.out.println("---------------------------");
        System.out.println("TOTAL BANK ASSETS: $" + totalAssets);
        System.out.println("Total Accounts: " + accounts.size());
        System.out.println("---------------------------");
    }

    /**
     * Simulates the end of the month processing.
     * Applies interest to all SavingsAccounts.
     */
    public void simulateMonthEnd() {
        System.out.println("\n--- RUNNING MONTH-END SIMULATION ---");
        int savingsAccountsProcessed = 0;
        
        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount) {
                SavingsAccount sAcc = (SavingsAccount) acc;
                sAcc.applyInterest(); 
                savingsAccountsProcessed++;
            }
        }
        
        System.out.println("--------------------------------------");
        System.out.println("Month-End Complete.");
        System.out.println("Interest applied to " + savingsAccountsProcessed + " accounts.");
        System.out.println("--------------------------------------");
    }
}