package com.datetime;

import java.time.LocalDate;
import java.time.Period;

public class Datedemo3 {
	public static void main(String[] args) {
		LocalDate ld1=LocalDate.now();
		LocalDate ld2=LocalDate.of(2022, 10, 15);
		// to get the period between two dates
		Period periodbetween = Period.between(ld1, ld2);
		System.out.println(periodbetween.getDays()+" "+periodbetween.getMonths());
	}

}
