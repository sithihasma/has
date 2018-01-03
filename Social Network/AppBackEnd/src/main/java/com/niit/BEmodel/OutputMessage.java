package com.niit.BEmodel;

import java.util.Date;

public class OutputMessage extends Message {
	Date time;

	public OutputMessage(Message msg,Date time)
	{
		super(msg.getId(),msg.getMessage());
		this.time=time;
	}
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	

}
