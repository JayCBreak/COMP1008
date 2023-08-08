/*********************************************
 * Assignment 2 - Bank.java                  *
 * COMP1008 - Intro to Object Oriented Prog. *
 * July 16th 2023                            *
 * Jacob Chotenovsky                         *
 * 200545482                                 *
 *********************************************/
package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {
	// Instance Variables - set to private making them only accessible from within the class.
	private String bankName = "Default Bank";
	private BranchLocations branchLocation = BranchLocations.BARRIE;
	private List<Account> accounts = new ArrayList<>();

	public static enum BranchLocations {
		BARRIE,
		TORONTO,
		LONDON,
		QUEBEC_CITY,
		VANCOUVER
	};

	public Bank() {}
	// 2 Parameter constructors, ensures the initialization data is not null and valid for use
	public Bank(String bankName, String branchLocation) {
		if(bankName == null || !setBankName(bankName)) {
			setBankName("Default Bank");
		} else {
			setBankName(bankName);
		}
		if(branchLocation == null || !setBranchLocation(branchLocation)) {
			setBranchLocation(BranchLocations.BARRIE);
		} else {
			setBranchLocation(branchLocation);
		}
		accounts = new ArrayList<>();
	}

	public Bank(String bankName, BranchLocations branchLocation) {
		if(bankName == null || !setBankName(bankName)) {
			setBankName("Default Bank");
		} else {
			setBankName(bankName);
		}
		if(branchLocation == null || !setBranchLocation(branchLocation)) {
			setBranchLocation(BranchLocations.BARRIE);
		} else {
			setBranchLocation(branchLocation);
		}
		accounts = new ArrayList<>();
	}

	public String getBankName() {
		return bankName;
	}

	// Sets the bank name to a valid string. else returns false
	public boolean setBankName(String bankName) {
		int numCount = 0;
		int spaceCount = 0;
		if (bankName.length() >= 8) {
			for (char c : bankName.toCharArray()) {
				if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || (c == '&') || (c == ' ')) {
					if (c >= '0' && c <= '9') {
						numCount++;
					}
					if (c == ' ') {
						spaceCount++;
					}
					if (numCount > 3 || spaceCount > 1) {
						return false;
					}
				} else {
					return false;
				}
			}
			this.bankName = bankName;
			return true;
		} else {
			return false;
		}
	}

	public String getBranchLocation() {
		return branchLocation.toString();
	}
	// Sets the branch location using String or BranchLocations, ensuring a valid option is chosen
	public boolean setBranchLocation(String branchLocation) {
		for(BranchLocations branch: BranchLocations.values()) {
			if(Objects.equals(branchLocation, branch.toString())) {
				this.branchLocation = branch;
				return true;
			}
		}
		return false;
	}

	public boolean setBranchLocation(BranchLocations branchLocation) {
		for(BranchLocations branch: BranchLocations.values()) {
			if(branchLocation == branch) {
				this.branchLocation = branch;
				return true;
			}
		}
		return false;
	}
	// Gets the account by the account number, foreach loop through all the accounts until the correct one is found
	// This method of storing data is SLOW and should NEVER be used in a production environment

	/**
	 * Get the account by its accountNumber
	 * @param accountNumber The number of the account you want
	 * @return The account
	 */
	public Account getAccountByNumber(int accountNumber) {
		for (Account account : accounts) {
			if (account.getAccountNumber() == accountNumber) {
				return account;
			}
		}
		return new Account();
	}
	// 2 methods for adding new accounts to the arrayList, accounts are checked against the list to ensure no duplicate
	// data is stored in the arrayList

	/**
	 * Add an account
	 * @param account The account you want to add
	 * @return True if the account is added, false otherwise
	 */
	public boolean addAccount(Account account) {
		if (getAccountByNumber(account.getAccountNumber()).getAccountNumber() == 0) {
			return accounts.add(account);
		} else {
			return false;
		}
	}

	/**
	 * Add an account
	 * @param accountName The name of the account
	 * @param accountNumber The number of the account
	 * @param accountBalance The balance of the account
	 * @return True if the account is added, false otherwise
	 */
	public boolean addAccount(String accountName, int accountNumber, double accountBalance) {
		if (getAccountByNumber(accountNumber).getAccountNumber() == 0) {
			Account account = new Account(accountName, accountNumber, accountBalance);
			return accounts.add(account);
		} else {
			return false;
		}
	}

	public List<Account> getAllAccounts() {
		return accounts;
	}
	// 2 methods to view the accounts, one by account number and the other by index into the arrayList
	// If no account is found then an empty account is returned

	/**
	 * View an account
	 * @param accountNumber Number of the account you want to view
	 * @return The account you want to view, or a new account if none are found
	 */
	public Account viewAccount(int accountNumber) {
		for (Account account : accounts) {
			if (account.getAccountNumber() == accountNumber) {
				return account;
			}
		}
		return new Account();
	}

	/**
	 * View an account
	 * @param index Index into the arrayList of accounts you want to view
	 * @return The account you want to view, or a new account if none are found
	 */
	public Account viewAccount(byte index) {
		if (index >= 0 && index < accounts.size()) {
			return accounts.get(index);
		}
		return new Account();
	}
	// 6 methods to modify the account in various ways. Setters are used to ensure valid data is stored

	/**
	 * Modify the accounts name
	 * @param accountNumber Number of the account you want to modify
	 * @param accountName The new name of the account
	 * @return True if the account is changed, false otherwise
	 */
	public boolean modifyAccount(int accountNumber, String accountName) {
		Account account = getAccountByNumber(accountNumber);
		if (account.getAccountNumber() != 0) {
			account.setAccountName(accountName);
			return true;
		}
		return false;
	}

	/**
	 * Modify the account balance
	 * @param accountNumber Number of the account you want to modify
	 * @param accountBalance The new balance of the account
	 * @return True if the account is changed, false otherwise
	 */
	public boolean modifyAccount(int accountNumber, double accountBalance) {
		Account account = getAccountByNumber(accountNumber);
		if (account.getAccountNumber() != 0) {
			account.setAccountBalance(accountBalance);
			return true;
		}
		return false;
	}

	/**
	 * Modify the account name and balance
	 * @param accountNumber Number of the account you want to modify
	 * @param accountName The new name of the account
	 * @param accountBalance The new balance of the account
	 * @return True if the account is changed, false otherwise
	 */
	public boolean modifyAccount(int accountNumber, String accountName, double accountBalance) {
		Account account = getAccountByNumber(accountNumber);
		if (account.getAccountNumber() != 0) {
			account.setAccountName(accountName);
			account.setAccountBalance(accountBalance);
			return true;
		}
		return false;
	}

	/**
	 * Modify the account name
	 * @param index Index into the arrayList of accounts you want to modify
	 * @param accountName The new name of the account
	 * @return True if the account is changed, false otherwise
	 */
	public boolean modifyAccount(byte index, String accountName) {
		if (index >= 0 && index < accounts.size()) {
			Account account = accounts.get(index);
			account.setAccountName(accountName);
			return true;
		}
		return false;
	}

	/**
	 * Modify the account balance
	 * @param index Index into the arrayList of accounts you want to modify
	 * @param accountBalance The new balance of the account
	 * @return True if the account is changed, false otherwise
	 */
	public boolean modifyAccount(byte index, double accountBalance) {
		if(index >= 0 && index < accounts.size()) {
			Account account = accounts.get(index);
			account.setAccountBalance(accountBalance);
			return true;
		}
		return false;
	}

	/**
	 * Modify the account name and balance
	 * @param index Index into the arrayList of accounts you want to modify
	 * @param accountName The new name of the account
	 * @param accountBalance The new balance of the account
	 * @return True if the account is changed, false otherwise
	 */
	public boolean modifyAccount(byte index, String accountName, double accountBalance) {
		if (index >= 0 && index < accounts.size()) {
			Account account = accounts.get(index);
			account.setAccountName(accountName);
			account.setAccountBalance(accountBalance);
			return true;
		}
		return false;
	}

	/**
	 * Delete an account based on accountNumber
	 * @param accountNumber The account number associated with the account you wish to delete
	 * @return True if an account is deleted, False otherwise
	 */
	public boolean deleteAccount(int accountNumber) {
		Account account = getAccountByNumber(accountNumber);
		if (account.getAccountNumber() != 0) {
			return accounts.remove(account);
		}
		return false;
	}

	/**
	 * Delete an account based on index
	 * @param index The index into the arrayList of accounts
	 * @return True if an account is deleted, false otherwise
	 */
	public boolean deleteAccount(byte index) {
		if (index >= 0 && index < accounts.size()) {
			accounts.remove(index);
			return true;
		}
		return false;
	}

	// IntelliJ is the greatest IDE ever created
	/**
	 * This overrides the toString() method to provide more detailed values
	 * @return String with formatted Bank details
	 */
	@Override
	public String toString() {
		return "Bank{" +
				"bankName='" + bankName + '\'' +
				", branchLocation=" + branchLocation +
				", accounts=" + accounts +
				'}';
	}
}