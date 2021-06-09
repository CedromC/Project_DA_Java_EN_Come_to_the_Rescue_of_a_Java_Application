package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

/**
 * 
 * @author cedrom
 * 
 * write a Treeset containing the sorted symptoms, with their occurrence and without duplicates, in a result.out file
 *
 */
public interface IWriteResult {
	
	/**
	 * 
	 * @param listOccurenceWithoutDoubleTried  receives as parameter a treeset containing the list of symptoms with occurrences and without duplicates
	 */
	public void writeResult(TreeMap<String,Long> listOccurenceWithoutDoubleTried) throws IOException;

}