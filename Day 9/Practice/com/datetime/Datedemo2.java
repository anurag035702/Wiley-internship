package com.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datedemo2 {
	public static void main(String[] args) {
		// to print date 
		LocalDate today=LocalDate.now();
		// to format according to our need DAte and time
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(df.format(today));
		System.out.println(today);
		//to parse given string to date
		System.out.println(LocalDate.parse("2001-03-01"));
		// to set the date
		LocalDate d1=LocalDate.of(2001, 03, 01);
		System.out.println(d1);
	}

}
