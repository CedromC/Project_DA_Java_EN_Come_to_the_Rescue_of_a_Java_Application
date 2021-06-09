package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

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
	@Override
	public  void writeResult(TreeMap<String,Long> listOccurenceWithoutDoubleTried) throws IOException  {
		
		/*FileWriter writer = new FileWriter("result.out");
		
		//scan each element of the ordered symptom list and their occurrence to write them to the output file
		for (String e : listOccurenceWithoutDoubleTried) {
			writer.write(e);
		}
		writer.close();*/
		
		List<String> result = listOccurenceWithoutDoubleTried
								.entrySet()
								.stream()
								.map(entry -> entry.getKey() + ": " + entry.getValue())
								.collect(Collectors.toList());
		Files.write(Paths.get("result.out"), result);
		
	}
}