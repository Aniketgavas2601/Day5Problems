package com.bridgelabz.day5problems;

public class WindChill {

	public static void main(String[] args) {
		double windChillTemp;

		double t = Double.parseDouble(args[0]); // temperature Fahrenheit
		double v = Double.parseDouble(args[1]); // wind speed (in miles per hour)

		if (t < 50 && v < 120 || v > 3) {
			windChillTemp = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("WindChill:- " + windChillTemp);

		} else {
			System.out.println("invalid Input...");
		}
	}

}
