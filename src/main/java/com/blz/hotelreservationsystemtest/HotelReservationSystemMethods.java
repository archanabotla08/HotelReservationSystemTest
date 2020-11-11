package com.blz.hotelreservationsystemtest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HotelReservationSystemMethods {
	private static ArrayList<HotelReservationSystem> hotelMap = new ArrayList<>();
	private static ArrayList<HotelReservationSystem> hotelDetailsList = new ArrayList<>();
	public static ArrayList<String> strDays = new ArrayList<String>(
			Arrays.asList("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"));

	// UseCase: 1
	public static void addHotel(String hotelName, int regularRates) {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem(hotelName, regularRates);
		hotelMap.add(hotelReservationSystem);
	}

	public static int countHotels() {
		return hotelMap.size();
	}

	// UseCase: 2
	public static LocalDate convertStringToDate(String dateString) {
		LocalDate date = null;
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("ddMMMyyyy");
		date = LocalDate.parse(dateString, dateTimeFormat);
		return date;
	}

	public static DayOfWeek getDays(LocalDate date) {
		DayOfWeek day = null;
		day = DayOfWeek.from(date);
		return day;
	}

	public static String getCheapestHotel(String input_1, String input_2) {
		LocalDate dateInput_1 = convertStringToDate(input_1);
		LocalDate dateInput_2 = convertStringToDate(input_2);
		DayOfWeek dayOfWeek_1 = getDays(dateInput_1);
		DayOfWeek dayOfWeek_2 = getDays(dateInput_2);
		System.out.println(dayOfWeek_1);
		int bookingDays = 0;
		bookingDays = (int) ChronoUnit.DAYS.between(dateInput_1, dateInput_2) + 1;
		hotelMap.add(new HotelReservationSystem("LakeWood", 110));
		hotelMap.add(new HotelReservationSystem("BridgeWood", 150));
		hotelMap.add(new HotelReservationSystem("RidgeWood", 220));
		for (int i = 0; i < hotelMap.size(); i++) {
			int value = hotelMap.get(i).getRegularRates() * (bookingDays);
			hotelMap.get(i).setRegularRates(value);
		}
		String hotelName = hotelMap.stream().min(Comparator.comparing(HotelReservationSystem::getRegularRates)).get()
				.getHotelName();
		int cheapestRate = hotelMap.stream().min(Comparator.comparing(HotelReservationSystem::getRegularRates)).get()
				.getRegularRates();

		return hotelName + " " + cheapestRate;
	}

	
	//UseCase : 3
	
	public static void addHotel(String hotelName, int weekDayRates,int weekEndDayRates) {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem(hotelName,weekDayRates,weekEndDayRates);
		hotelDetailsList.add(hotelReservationSystem);
	}
	
	//UseCase: 4
	public static String getCheapestHotelForWeekAndWeeend(String input_1, String input_2) {
		LocalDate dateInput_1 = convertStringToDate(input_1);
		LocalDate dateInput_2 = convertStringToDate(input_2);
		DayOfWeek dayOfWeek_1 = getDays(dateInput_1);
		DayOfWeek dayOfWeek_2 = getDays(dateInput_2);
		
		hotelDetailsList.add(new HotelReservationSystem("LakeWood", 110,90));
		hotelDetailsList.add(new HotelReservationSystem("BridgeWood", 150,50));
		hotelDetailsList.add(new HotelReservationSystem("RidgeWood", 220,150));
		int rent = 0; 
		for (int i = 0; i < hotelDetailsList.size(); i++) {
			if(strDays.contains(dayOfWeek_1) || strDays.contains(dayOfWeek_2)) {
				rent = rent + hotelDetailsList.get(i).getWeekEndDayRates();
				System.out.println(rent);
				hotelDetailsList.get(i).setWeekEndDayRates(rent);
				
			}else {
				rent = rent + hotelDetailsList.get(i).getWeekDayRates();
				System.out.println(rent);
				hotelDetailsList.get(i).setWeekDayRates(rent);
			}
			
		}
		for(int i=0 ; i < hotelDetailsList.size(); i++) {
			int temp = hotelDetailsList.get(i).getWeekDayRates() + hotelDetailsList.get(i).getWeekEndDayRates();
			hotelMap.get(i).setRegularRates(temp);	
		}
		String hotelName = hotelMap.stream().min(Comparator.comparing(HotelReservationSystem::getRegularRates)).get()
				.getHotelName();
		int cheapestRate = hotelMap.stream().min(Comparator.comparing(HotelReservationSystem::getRegularRates)).get()
				.getRegularRates();
		
		

		return hotelName + " " + cheapestRate;
	}

	
	
	public static void printHotel() {
		hotelMap.stream().forEach(System.out::println);
		hotelDetailsList.stream().forEach(System.out::println);
	}

	public static void printHotel(String result) {
		System.out.print(result);
	}

	public static void main(String[] args) {

		// System.out.println("Welcome message");
	}

}
