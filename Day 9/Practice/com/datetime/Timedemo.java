package com.datetime;

import java.time.Duration;
import java.time.LocalTime;

public class Timedemo {
	public static void main(String[] args) {
	LocalTime t1=LocalTime.of(18, 30);
	LocalTime t2=LocalTime.of(22, 30);
	
	Duration d1=Duration.between(t1, t2);
	System.out.println(d1.getSeconds());
	}

}
