/*********************************************
 * Assignment 2 - Account.java               *
 * COMP1008 - Intro to Object Oriented Prog. *
 * July 16th 2023                            *
 * Jacob Chotenovsky                         *
 * 200545482                                 *
 *********************************************/
package assignment2;

import java.util.regex.*;

public class Account {
	// Instance Variables - private to make it only accessible in the class.
	// accountNumber is default set to 0 so that it is obvious when the default constructor is used and an error has occured
	private String accountName = "TEMP_NAME";
	private int accountNumber = 0;
	private double accountBalance = 0.0;

	// Default constructor creates a terrible horrible no good very bad account.
	public Account() {}
	// This constructor ensures that the guidelines are followed and if not then sets the instance variables to default values.
	public Account(String accountName, int accountNumber, double accountBalance) {
		if (accountName == null || !setAccountName(accountName)) {
			setAccountName("Default Account");
		} else {
			setAccountName(accountName);
		}
		if (!setAccountNumber(accountNumber)) {
			setAccountNumber(1234567);
		} else {
			setAccountNumber(accountNumber);
		}
		if (!setAccountBalance(accountBalance)) {
			setAccountBalance(420.69);
		} else {
			setAccountBalance(accountBalance);
		}
	}
	public String getAccountName() {
		return accountName;
	}

	// I tried to use Regex here, but it hurt my head too much so classic array loop it is!
	// This counts the number of apostrophes and spaces in the string and ensures no invalid chars are used
	public boolean setAccountName(String accountName) {
		int apostropheCount = 0;
		int spaceCount = 0;

		if (accountName.length() >= 4) {
			for (char c : accountName.toCharArray()) {
				if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == '-') || (c == '\'') || (c == ' ')) {
					if (c == '\'') {
						apostropheCount++;
					}
					if (c == ' ') {
						spaceCount++;
					}
					if (apostropheCount > 1 || spaceCount > 1) {
						return false;
					}
				} else {
					return false;
				}
			}
			this.accountName = accountName;
			return true;
		} else {
			return false;
		}
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	// Regex seems overkill here, I just check to ensure the account number is between 5 and 9 digits long
	public boolean setAccountNumber(int accountNumber) {
		if(accountNumber > 9999 && accountNumber < 1000000000) {
			this.accountNumber = accountNumber;
			return true;
		} else {
			return false;
		}
	}
	public double getAccountBalance() {
		return accountBalance;
	}

	/* This sets the account balance for the current object
	 * The regex statement only lets numbers that are positive or negative (with or without a - sign to start)
	 * Then it checks for any number of digits before an optional decimal point
	 * Finally it checks for the optional (required if there is a decimal point) 1 or 2 decimal places.
	 */
	public boolean setAccountBalance(double value) {
		String stringValue = String.valueOf(value);
		String regex = "^-?\\d*([.]\\d{1,2})?$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(stringValue);

		if (matcher.matches()) {
			this.accountBalance = value;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Compares two objects, if they are both accounts then the comparison is by value
	 * @param obj Takes any object but only compares them if they are both account objects
	 * @return True if the accounts are equal in value
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj.getClass() != Account.class) {
			return false;
		}
		Account other = (Account) obj;
		if (accountNumber == other.accountNumber && accountBalance == other.accountBalance && accountName.equals(other.accountName)) {
			return true;
		} else {
			return false;
		}
	}

	// I LOVE INTELLIJ!!!!!!
	/**
	 * This overrides the toString() method to provide more detailed values
	 * @return String with formatted Account details
	 */
	@Override
	public String toString() {
		return "Account{" +
				"accountName='" + accountName + '\'' +
				", accountNumber=" + accountNumber +
				", accountBalance=" + accountBalance +
				'}';
	}
}
