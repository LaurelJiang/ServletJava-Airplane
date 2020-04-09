package com.briup.service;

import java.util.List;

import com.briup.pojo.Airport;

public interface AirportService {
	/*
	 * 显示所有起飞机场
	 */
	List<Airport> showTakePort();
	
	/*
	 * 显示所有的降落机场
	 */
	List<Airport> showLandPort();
}
