package net.skhu.dto;

public class Bus {
	int id;
	String busNo;
	String firstStop;
	String lastStop;
	int categoryId;
	String firstBus;
	String lastBus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getFirstStop() {
		return firstStop;
	}

	public void setFirstStop(String firstStop) {
		this.firstStop = firstStop;
	}

	public String getLastStop() {
		return lastStop;
	}

	public void setLastStop(String lastStop) {
		this.lastStop = lastStop;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getFirstBus() {
		return firstBus;
	}

	public void setFirstBus(String firstBus) {
		this.firstBus = firstBus;
	}

	public String getLastBus() {
		return lastBus;
	}

	public void setLastBus(String lastBus) {
		this.lastBus = lastBus;
	}

}
