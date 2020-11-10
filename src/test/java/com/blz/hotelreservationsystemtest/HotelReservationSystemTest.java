package com.blz.hotelreservationsystemtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class HotelReservationSystemTest {

	@Test
	public void given3Hotels_WhenAddedToHotelMap_SizeOfMapIs3(){
		HotelReservationSystemMethods.addHotel("LakeWood", 110);
		HotelReservationSystemMethods.addHotel("Bridgewood",160);
		HotelReservationSystemMethods.addHotel("Ridgewood",220);
		HotelReservationSystemMethods.printHotel();
		assertEquals(3, HotelReservationSystemMethods.countHotels());
	}

}
