package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Occurence  {
	
	public static List<String> Count (ReadSymptomDataFromFile listSymptome){
	List<String> list= new ArrayList<String>();
	list= listSymptome.GetSymptoms();
	List<String> listOccurence= new ArrayList<String>();
	int i=0;
	for (String e:list) {
		System.out.println(e + " " + Collections.frequency(list, e));
		listOccurence.add(i, e + " " + Collections.frequency(list, e)+ "\n");
		i++;
	}
	return listOccurence;
	}
}
