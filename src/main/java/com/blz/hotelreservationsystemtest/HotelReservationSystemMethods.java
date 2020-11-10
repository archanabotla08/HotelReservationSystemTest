package com.blz.hotelreservationsystemtest;

import java.util.HashMap;
import java.util.Map;

public class HotelReservationSystemMethods {
	private static Map<String,Integer> hotelMap = new HashMap<>();
	
	public static void addHotel(String hotelName, int regularRates) {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem(hotelName,regularRates);
		hotelMap.put(hotelReservationSystem.getHotelName(),hotelReservationSystem.getRegularRates());
	}
	
	public static int countHotels() {
		return hotelMap.size();
	}
	
	public static void printHotel() {
		hotelMap.entrySet().stream().forEach(System.out::println);
	}
	public static void main(String[] args) {
		
		//System.out.println("Welcome message");
			}

}
