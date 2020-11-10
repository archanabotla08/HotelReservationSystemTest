package com.blz.hotelreservationsystemtest;

public class HotelReservationSystem {
	private String hotelName;
	private int regularRates;
	public HotelReservationSystem(String hotelName, int regularRates) {
		super();
		this.hotelName = hotelName;
		this.regularRates = regularRates;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRegularRates() {
		return regularRates;
	}
	public void setRegularRates(int regularRates) {
		this.regularRates = regularRates;
	}
	@Override
	public String toString() {
		return "HotelReservationSystem [hotelName=" + hotelName + ", regularRates=" + regularRates + "]";
	}
	
	

}
