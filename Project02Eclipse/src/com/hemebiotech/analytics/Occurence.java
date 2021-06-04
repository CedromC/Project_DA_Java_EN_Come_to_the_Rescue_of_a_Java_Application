package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author cedrom
 *
 */
public class Occurence {

	/**
	 * 
	 * @param listSymptome receive the list of symptoms to count the occurrences
	 * @return returns the list of symptoms with their occurrences. Contains
	 *         duplicates
	 */
	public static List<String> Count(ReadSymptomDataFromFile listSymptome) {
		
		//create list from symptom file
		List<String> list = new ArrayList<String>();
		list = listSymptome.getSymptoms();
		
		List<String> listOccurence = new ArrayList<String>();
		
		//scan each element of the list and calculate the number of occurrences
		int i = 0;
		for (String e : list) {
			System.out.println(e + " " + Collections.frequency(list, e));
			listOccurence.add(i, e + " " + Collections.frequency(list, e) + "\n");
			i++;
		}
		
		return listOccurence;
	}
}
