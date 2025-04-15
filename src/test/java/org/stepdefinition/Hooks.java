package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{
	@Before
	public void before() {
		browserLaunch("chrome");
		urlLaunch("https://www.booking.com/?auth_success=1&account_created=1");
	}
	@After
	public void after(Scenario sc) throws IOException {
	getScreenShot(sc.getName());	
	quit();
	}

}
