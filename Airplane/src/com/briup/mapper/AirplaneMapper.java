package com.briup.mapper;

import java.util.List;

import com.briup.pojo.Airplane;

public interface AirplaneMapper {
	List<Airplane> selByTakeidLandid(int takeid,int landid);
}
