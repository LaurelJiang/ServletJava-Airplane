package com.briup.pojo;

import lombok.Data;

@Data
public class Airplane {
	private int id;
	private String airNo;
	private int  time;
	private double price;
	private Airport takePort;
	private Airport landPort;
	
}
