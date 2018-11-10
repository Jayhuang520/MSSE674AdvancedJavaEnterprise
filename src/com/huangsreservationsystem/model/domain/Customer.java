package com.huangsreservationsystem.model.domain;

import java.io.Serializable;

public class Customer implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 7661657477853633935L;

	/** Customer last name */
	private String lastName;

	/** Customer first name */
	private String firstName;

	/** Customer userName */
	private String userName;

	/** Customer password */
	private String password;

	private static final String TAB = "    ";

	/**
	 * Default constructor
	 */
	public Customer() {
	}

	/**
	 * Copy constructor
	 * 
	 * @param customer
	 */
	public Customer(Customer customer) {
		this.lastName = customer.lastName;
		this.firstName = customer.firstName;
		this.userName = customer.userName;
		this.password = customer.password;
	
	}

	/**
	 * @param lastName
	 * @param firstName
	 * @param emailAddress
	 */
	public Customer(String lastName, String firstName, String userName, String password, String dayTimePhone,
			String eveningTimePhone) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.userName = userName;
		this.password = password;

	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return userName;
	}

	/**
	 *  Set the email address.
	 */
	public void setEmailAddress(String emailAddress) {
		this.userName = emailAddress;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * 
	 * @return true if non of those are null
	 */
	public boolean validate() {
		if (lastName == null)
			return false;
		if (firstName == null)
			return false;
		if (userName == null)
			return false;
		if (password == null)
			return false;
		return true;
	}

	/**
	 * 
	 * @param Customer
	 * @return
	 */
	public boolean equals(Customer customer) {
		if (!lastName.equals(customer.getLastName()))
			return false;
		if (!firstName.equals(customer.getFirstName()))
			return false;
		if (!userName.equals(customer.getEmailAddress()))
			return false;
		if (!password.equals(customer.getPassword()))
			return false;
		return true;
	}

	/**
	 * change the customer object into a string.
	 * @return String
	 */
	public String toString() {

		String returnValue = "";

		returnValue = "Customer ( " + super.toString() + TAB + "lastName = " + this.lastName + TAB + "firstName = "
				+ this.firstName + TAB + "emailAddress = " + this.userName + TAB + "password = " + this.password
				+ TAB + "dayTimePhone = " +  TAB + "eveningTimePhone = " + TAB + " )";

		return returnValue;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		return result;
	}
}
