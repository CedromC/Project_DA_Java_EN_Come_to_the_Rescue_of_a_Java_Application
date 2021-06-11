package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * 
 * @author cedrom
 * 
 * 
 *         receive the list of symptoms to count the occurrences
 * 
 *        
 *
 */
public interface IOccurence {

	/**
	 * 
	 * @param listSymptome receive the list of symptoms to count the occurrences
	 * @return returns the list of symptoms with their occurrences. Contains
	 *         duplicates
	 *
	 */
	public TreeMap<String, Long> count(ReadSymptomDataFromFile listSymptome);

}