package com.spb.cc.spbccCore.entity;

public class Channel {
	
	private String channel;
	private String merCode;
	private String stt;
	
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getMerCode() {
		return merCode;
	}
	public void setMerCode(String merCode) {
		this.merCode = merCode;
	}
	public String getStt() {
		return stt;
	}
	public void setStt(String stt) {
		this.stt = stt;
	}
	
	@Override
	public String toString() {
		return "Channel [channel=" + channel + ", merCode=" + merCode + ", stt=" + stt + "]";
	}
}
