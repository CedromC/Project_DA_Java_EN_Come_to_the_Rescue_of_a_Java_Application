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
	 * Methode for creating an object of the symptom's file
	 * @param file contain the file's path of symptoms.txt
	 * @return ReadSymptomDataFromFile's object
	 */
	public ReadSymptomDataFromFile reading(String file) {
		// create an instance to read the file
		ReadSymptomDataFromFile listSymptome = new ReadSymptomDataFromFile(file);
		return (listSymptome);
	}
	/**
	 * Method for sort and count occurrences of input's file
	 * @param listSymptome a ReadSymptomFromDataFile that contains symptoms file
	 * @return TreeMap with String for symptoms and Long for occurrences
	 */
	public TreeMap<String,Long> sorting(ReadSymptomDataFromFile listSymptome) {	
		// count the occurrences of each symptom
		Occurence occurence = new Occurence();
		TreeMap<String,Long> listOccurence = occurence.count(listSymptome);
		return (listOccurence);
	}

	/**
	 * Method for save list of symptoms with their occurrences in a file
	 * @param listOccurence receive a TreeMap with String for symptoms and Long for occurrences
	 * @throws IOException management of a write error
	 */
	public void saving(TreeMap<String,Long> listOccurence) throws IOException {	
		// generates a symptom file with their occurrence
		WriteResult writeResult= new WriteResult();
		writeResult.writeResult(listOccurence);
	}
}
