package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.io.IOException;

/**
 * 
 * @author cedrom
 *
 */
public class AnalyticsCounter2 {

	/**
	 * 
	 * @param args Not used
	 * @throws IOException management of the exception, if the file does not exist or on a read error
	 */
	public static void main(String args[]) throws IOException {

		// create an instance to read the file
		ReadSymptomDataFromFile listSymptome = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");

		// count the occurrences of each symptom
		Occurence occurence = new Occurence();
		TreeMap<String,Long> listOccurence = occurence.count(listSymptome);

		// remove duplicates and classify in alphabetical order
		//TreeSet<String> listOccurenceWithoutDoubleTried = new TreeSet<String>(listOccurence);

		// generates a symptom file with their occurrence
		//WriteResult.writeResult(listOccurenceWithoutDoubleTried);
		WriteResult writeResult= new WriteResult();
		writeResult.writeResult(listOccurence);
	}

}
