package com.blz.hotelreservationsystemtest;

public class HotelReservationSystem {
	private String hotelName;
	private int regularRates;
	private int weekDayRates;
	private int weekEndDayRates;
	private int ratings;
	
	public HotelReservationSystem() {
		
	}
	public HotelReservationSystem(String hotelName, int regularRates) {
		super();
		this.hotelName = hotelName;
		this.regularRates = regularRates;
	}
	public HotelReservationSystem(String hotelName, int weekDayRates ,int weekEndDayRates) {
		this.hotelName = hotelName;
		this.weekDayRates = weekDayRates;
		this.weekEndDayRates = weekEndDayRates;
	}
	public HotelReservationSystem(String hotelName, int weekDayRates ,int weekEndDayRates, int ratings) {
		this.hotelName = hotelName;
		this.weekDayRates = weekDayRates;
		this.weekEndDayRates = weekEndDayRates;
		this.ratings = ratings;
	}
	public int getWeekDayRates() {
		return weekDayRates;
	}
	public void setWeekDayRates(int weekDayRates) {
		this.weekDayRates = weekDayRates;
	}
	public int getWeekEndDayRates() {
		return weekEndDayRates;
	}
	public void setWeekEndDayRates(int weekEndDayRates) {
		this.weekEndDayRates = weekEndDayRates;
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
		return "HotelReservationSystem [hotelName=" + hotelName + ", weekDayRates=" + weekDayRates
				+ ", weekEndDayRates=" + weekEndDayRates + "]";
	}
	
	
	

}
