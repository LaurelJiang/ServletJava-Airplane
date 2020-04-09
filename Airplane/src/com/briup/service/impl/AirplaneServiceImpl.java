package com.briup.service.impl;

import java.util.List;

import com.briup.mapper.AirplaneMapper;
import com.briup.pojo.Airplane;
import com.briup.service.AirplaneService;
import com.briup.util.BriupUtil;

public class AirplaneServiceImpl implements AirplaneService{

	@Override
	public List<Airplane> show(int takeid, int landid) {
		return BriupUtil.getSession().getMapper(AirplaneMapper.class).selByTakeidLandid(takeid, landid);
	}

}
