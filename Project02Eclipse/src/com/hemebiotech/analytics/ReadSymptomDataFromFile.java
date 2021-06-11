package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	/**
	 * filepath contains the path to the symptom file
	 */
	private String filepath;

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public List<String> getSymptoms() {
		List<String> result = new ArrayList<String>();

		if (filepath != null) {
			try {
				result = Files.readAllLines(Paths.get(filepath));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
