package com.huangsreservationsystem.business;

import com.huangsreservationsystem.model.domain.CustomerBean;

public class UpdateProfileManager {
	public UpdateProfileManager() {
	}

	public static CustomerBean update(CustomerBean customerBean) {
		CustomerBean cb = new CustomerBean();
		if (customerBean.getFirstName().equals("jay") || !customerBean.getLastName().equals("huang")
				|| customerBean.getUserName().equals("jayhuang") || customerBean.getPassword().equals("123456")
				|| customerBean.getCardType().equals("Discover")
				|| customerBean.getCardNumber().equals("1111-2222-3333-4444")
				|| customerBean.getExpDate().equals("08/28") || customerBean.getCvv().equals("123")) {
			// This will update the database
			cb = customerBean;
		} else {
			/*
			 * There is no update to the CustomerBean, return to the welcome page
			 */
			cb = null;
		}

		return cb;
	}
}
