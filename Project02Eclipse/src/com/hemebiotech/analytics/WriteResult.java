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
	 * @param listOccurenceWithoutDoubleTried receives as parameter a TreeMap
	 *                                        containing the list of symptoms with
	 *                                        occurrences and without duplicates
	 * 
	 * 
	 * @throws IOException management of a write error
	 */
	@Override
	public void writeResult(TreeMap<String, Long> listOccurenceWithoutDoubleTried) throws IOException {

		// collect in a list through a stream and the function map to scan a TreeMap
		List<String> result = listOccurenceWithoutDoubleTried.entrySet().stream()
				.map(entry -> entry.getKey() + ": " + entry.getValue()).collect(Collectors.toList());
		// writing the list in a file
		Files.write(Paths.get("result.out"), result);

	}
}