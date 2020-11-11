package com.blz.hotelreservationsystemtest;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class HotelReservationSystemTest {

	// Test UC:1
	@Test
	public void given3Hotels_WhenAddedToHotelMap_SizeOfMapIs3() {
		HotelReservationSystemMethods.addHotel("LakeWood", 110);
		HotelReservationSystemMethods.addHotel("Bridgewood", 150);
		HotelReservationSystemMethods.addHotel("Ridgewood", 220);
		HotelReservationSystemMethods.printHotel();
		assertEquals(6, HotelReservationSystemMethods.countHotels());
	}

	// Test UC:2
	@Test
	public void given2Dates_GetCheapestHotel() {
		String result = HotelReservationSystemMethods.getCheapestHotel("10Sep2020", "11Sep2020");
		HotelReservationSystemMethods.printHotel("\n"+result+" \n");
		assertEquals("LakeWood 220", result);
	}
	
	// Test UC:3
		@Test
		public void given3Hotels_WhenAddedToHotelWithWeekDayAndWeekEndDayRates_SizeOfMapIs3() {
			HotelReservationSystemMethods.addHotel("LakeWood", 110,90);
			HotelReservationSystemMethods.addHotel("Bridgewood",150,50);
			HotelReservationSystemMethods.addHotel("Ridgewood", 220,150);
			HotelReservationSystemMethods.printHotel();
			assertEquals(3, HotelReservationSystemMethods.countHotels());
		}
	// Test UC:4
		@Test
		public void given2Dates_GetCheapestHotelByWeekAndWeekendDays() {
			String result = HotelReservationSystemMethods.getCheapestHotelForWeekAndWeeend("11Sep2020", "12Sep2020");
			HotelReservationSystemMethods.printHotel("\n"+result+" \n");
			assertEquals("LakeWood 200", result);
		}
}
