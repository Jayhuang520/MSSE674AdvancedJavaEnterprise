package com.huangsreservationsystem.business;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.huangsreservationsystem.model.domain.CustomerBean;
import com.huangsreservationsystem.model.domain.LoginBean;

class LoginManagerTest {

	@Test
	void testLogin() {
		LoginBean login = new LoginBean("jayhuang","123456");
		CustomerBean customer = LoginManager.authenticateLogin(login);
		assertNotNull("Failed to authenticate",customer);
	}

}
