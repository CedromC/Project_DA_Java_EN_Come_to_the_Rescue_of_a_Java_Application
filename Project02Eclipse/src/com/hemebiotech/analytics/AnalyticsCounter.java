package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Alex
 *
 */
public class AnalyticsCounter {
	
	/**
	 *  counter for the number of headache symptom
	 */
	private static int headacheCount = 0;	
	/**
	 * counter for the number of rash symptom
	 */
	private static int rashCount = 0;
	/**
	 * counter for the number of pupils symptom
	 */
	private static int pupilCount = 0;		
	
	/**
	 * 
	 * @param args Not used
	 * @throws Exception management of the exception, if the file does not exist or on a read error
	 */
	public static void main(String args[]) throws Exception {
		// first get input
		try {
		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse/symptoms.txt"));
		String line = reader.readLine();

		
			while (line != null) {
				
				System.out.println("symptom from file: " + line);
				if (line.equals("headache")) {
					headacheCount++;
					System.out.println("number of headaches: " + headacheCount);
				}
				else if (line.equals("rash")) {
					rashCount++;
				}
				else if (line.contains("dialated pupils")) {
					pupilCount++;
				}
	
				line = reader.readLine();	// get another symptom
			}
		
			reader.close();
		}
		catch (IOException e) {
			System.out.println("File not found !!");
		}
		
		// next generate output
		try {
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
		}
		catch (IOException e) {
			System.out.println("Writing error !!");
		}
	}
}
