package com.topology.TIETO.entity;

import java.util.List;

public class Router {
	
	private String ipAddress;
	private int links;
	private String name;
	private List<String> connectedTo;
	private List<String> localPc;
	
	
	
	
	
	public List<String> getLocalPc() {
		return localPc;
	}
	public void setLocalPc(List<String> localPc) {
		this.localPc = localPc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getConnectedTo() {
		return connectedTo;
	}
	public void setConnectedTo(List<String> connectedTo) {
		this.connectedTo = connectedTo;
	}
	public int getLinks() {
		return links;
	}
	public void setLinks(int links) {
		this.links = links;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	
	
}
