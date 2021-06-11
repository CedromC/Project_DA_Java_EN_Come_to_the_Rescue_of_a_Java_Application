package com.hemebiotech.analytics;

import java.io.IOException;

/**
 * 
 * @author cedrom
 *
 */
public class Analytics {
	/**
	 * 
	 * @param args not used
	 * @throws IOException to deal with write errors
	 */
	public static void main(String[] args) throws IOException {

		AnalyticsCounter2 symptoms = new AnalyticsCounter2();

		symptoms.saving(symptoms.sorting(symptoms.reading("Project02Eclipse/symptoms.txt")));

	}

}
