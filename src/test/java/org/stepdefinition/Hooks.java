package org.stepdefinition;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	@Before
	public void before() {
		browserLaunch("chrome");
		urlLaunch("https://www.booking.com/?auth_success=1&account_created=1");
	}
	@After
	public void after() {
	quit();
	}

}
