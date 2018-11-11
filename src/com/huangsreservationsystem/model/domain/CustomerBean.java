package com.huangsreservationsystem.model.domain;

import java.io.Serializable;

public class CustomerBean implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 7661657477853633935L;

	/** Customer last name */
	private String lastName;

	/** Customer first name */
	private String firstName;

	/** Customer password */
	private String password;

	/** Customer birthday */
	private String birthday;

	/** Customer userName */
	private String userName;

	private static final String TAB = "    ";

	/**
	 * Default constructor
	 */
	public CustomerBean() {
	}

	/**
	 * Copy constructor
	 * 
	 * @param customer
	 */
	public CustomerBean(CustomerBean customer) {
		this.lastName = customer.lastName;
		this.firstName = customer.firstName;
		this.userName = customer.userName;
		this.password = customer.password;
		this.birthday = customer.birthday;

	}

	/**
	 * @param lastName
	 * @param firstName
	 * @param birthday
	 * @param userName
	 */
	public CustomerBean(String lastName, String firstName, String userName, String password, String Birthday,
			String birthday) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.userName = userName;
		this.password = password;
		this.birthday = birthday;
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
		if (lastName == null) {
			return false;
		}
		if (firstName == null) {
			return false;
		}
		if (userName == null) {
			return false;
		}
		if (password == null) {
			return false;
		}
		if (birthday == null) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param CustomerBean Validate all the parameter of the customer
	 */
	public boolean equals(CustomerBean customer) {
		if (!lastName.equals(customer.getLastName())) {
			return false;
		}if (!firstName.equals(customer.getFirstName())) {
			return false;
		}if (!userName.equals(customer.getUserName())) {
			return false;
		}if (!password.equals(customer.getPassword())) {
			return false;
		}if(!userName.equals(customer.getUserName())) {
			return false;
		}

		return true;
	}

	/**
	 * change the customer object into a string.
	 * 
	 * @return String
	 */
	public String toString() {

		String returnValue = "";

		returnValue = "Welcome to Huangs Hotel Reservation System!!!!!!!!!!!!!!!!!"
				+ "Customer " + super.toString() + TAB + this.lastName + TAB + this.firstName;

		return returnValue;
	}

	@Override
	public int hashCode() {
		final int prime = 7;
		int result = 1;

		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
