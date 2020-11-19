package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	/**
	 *  Province���������
	 */
	public static final String CREATEPROVINCE = "create table Province ("
				+ "id integer primary key autoincrement, " 
				+ "provincename text, "
				+ "provincecode text)";
	/**
	 *  City���������
	 */
	public static final String CREATECITY = "create table City ("
				+ "id integer primary key autoincrement, " 
				+ "cityname text, " 
				+ "citycode text, " 
				+ "provinceid integer)";
	/**
	 *  County���������
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
		db.execSQL(CREATEPROVINCE);  // ����Province��
		db.execSQL(CREATECITY);  // ����City��
		db.execSQL(CREATECOUNTY);  // ����Country��
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

}