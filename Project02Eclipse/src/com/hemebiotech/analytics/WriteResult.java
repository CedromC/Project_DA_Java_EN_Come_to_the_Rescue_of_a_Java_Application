package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

/**
 * 
 * @author cedrom
 *
 */
public class WriteResult implements IWriteResult {
	
	/**
	 * 
	 * @param listOccurenceWithoutDoubleTried  receives as parameter a treeset containing the list of symptoms with occurrences and without duplicates


	 * @throws IOException management of a write error
	 */
	public static void writeResult(TreeSet<String> listOccurenceWithoutDoubleTried) throws IOException {
		
		FileWriter writer = new FileWriter("result.out");
		
		//scan each element of the ordered symptom list and their occurrence to write them to the output file
		for (String e : listOccurenceWithoutDoubleTried) {
			writer.write(e);
		}
		writer.close();
	}
}