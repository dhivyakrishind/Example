package com.numbertowordconverter.util;

public class NameDictionary {
	private static String[] to_19 = { "",  "one",   "two",  "three", "four",   "five",   "six",
	        "seven", "eight", "nine", "ten",   "eleven", "twelve", "thirteen",
	        "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen","" };
		private static String[] tens  = { "","","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		private static String[] denoms  = {"", "", "thousand", "million"};
		public static String getTo_19(int i) {
			return to_19[i];
		}
		public static String getTens(int i) {
			return tens[i];
		}
		public static String getDenoms(int i) {
			return denoms[i];
		}
		
}
