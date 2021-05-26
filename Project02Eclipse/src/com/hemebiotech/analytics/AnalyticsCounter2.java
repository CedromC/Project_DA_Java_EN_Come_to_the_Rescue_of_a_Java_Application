package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

public class AnalyticsCounter2 {
	
	public static void main(String args[]) throws Exception {
		// first get input
		
		ReadSymptomDataFromFile listSymptome= new ReadSymptomDataFromFile ("Project02Eclipse/symptoms.txt");
		List<String> list= new ArrayList<String>();
		list= listSymptome.GetSymptoms();
		List<String> listOccurence= new ArrayList<String>();
		int i=0;
		for (String e:list) {
			System.out.println(e + " " + Collections.frequency(list, e));
			listOccurence.add(i, e + " " + Collections.frequency(list, e)+ "\n");
			i++;
		}
		
		
		
		TreeSet<String> listOccurenceWithoutDoubleTried= new TreeSet<String>(listOccurence);
		
		
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		for (String e:listOccurenceWithoutDoubleTried) {
		writer.write(e);
		}
		writer.close();
	}
}
