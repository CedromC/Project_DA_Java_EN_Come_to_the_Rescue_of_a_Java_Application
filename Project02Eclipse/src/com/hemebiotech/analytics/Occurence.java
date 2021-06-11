package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 * @author cedrom
 *
 */
public class Occurence implements IOccurence {

	/**
	 * 
	 * @param listSymptome receive the list of symptoms to count the occurrences
	 * @return returns the list of symptoms with their occurrences.
	 * 
	 */
	@Override
	public TreeMap<String, Long> count(ReadSymptomDataFromFile listSymptome) {

		// Create list from symptom file
		List<String> list = new ArrayList<String>();
		list = listSymptome.getSymptoms();

		// Create a stream for collect symptoms in a Map with occurences and without
		// duplicates
		Map<String, Long> listOccurence = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Create TreeMap to sort listOccurence
		TreeMap<String, Long> listOccurenceTried = new TreeMap<String, Long>();
		listOccurenceTried.putAll(listOccurence);

		return listOccurenceTried;
	}
}
