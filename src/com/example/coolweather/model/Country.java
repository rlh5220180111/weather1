package com.example.coolweather.model;

public class Country {
	private int id;
	private String CountryName;
	private String CountryCode;
	private int cityId;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getCountryName(){
		return CountryName;
	}
	public void setCountryName(String CountryName){
		this.CountryName=CountryName;
	}
	public String getCountryCode(){
		return CountryCode;
	}
	public void setCountryCode(String CountryCode){
		this.CountryCode=CountryCode;
	}
	public int getcityId(){
		return cityId;
	}
	public void setcityId(int cityId){
		this.cityId=cityId;
	}
	
}


