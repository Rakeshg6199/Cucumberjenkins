package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;
import net.masterthought.cucumber.presentation.PresentationMode;


public class GenerateReport {

	public static void report() {
		File f = new File("target");

		List<String> l  = new ArrayList<String>();
		l.add("src\\test\\resources\\cucumber.json");

		String buildNumber = "1";
		String projectName = "cucumberProject";


		Configuration configuration = new Configuration(f, projectName);


		configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
		configuration.setBuildNumber(buildNumber);

		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Branch", "release/1.0");


		ReportBuilder reportBuilder=new ReportBuilder(l,configuration);
		Reportable result=reportBuilder.generateReports();


	}
}
