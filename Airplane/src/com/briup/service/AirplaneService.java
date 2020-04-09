package com.briup.service;

import java.util.List;

import com.briup.pojo.Airplane;

public interface  AirplaneService {
	List<Airplane> show(int takeid,int landid);
}
