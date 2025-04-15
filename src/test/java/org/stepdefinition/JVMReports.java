package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	public static void generateJVMReports(String json) {
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReports");
		
		Configuration con = new Configuration(f,"Booking");
		con.addClassifications("Tester", "Manikandan");
		con.addClassifications("OS","Windows");
		con.addClassifications("Sprint","5th");
		
		List<String>li = new ArrayList<String>();
		li.add(json);
		
	    ReportBuilder rb = new ReportBuilder(li, con);
	    rb.generateReports();

	}

}
