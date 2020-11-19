package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	/**
	 *  Province表建表语句
	 */
	public static final String CREATEPROVINCE = "create table Province ("
				+ "id integer primary key autoincrement, " 
				+ "provincename text, "
				+ "provincecode text)";
	/**
	 *  City表建表语句
	 */
	public static final String CREATECITY = "create table City ("
				+ "id integer primary key autoincrement, " 
				+ "cityname text, " 
				+ "citycode text, " 
				+ "provinceid integer)";
	/**
	 *  County表建表语句
	 */
	public static final String CREATECOUNTY = "create table County ("
				+ "id integer primary key autoincrement, " 
				+ "countyname text, " 
				+ "countycode text, " 
				+ "cityid integer)";

	public CoolWeatherOpenHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATEPROVINCE);  // 创建Province表
		db.execSQL(CREATECITY);  // 创建City表
		db.execSQL(CREATECOUNTY);  // 创建Country表
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

}
