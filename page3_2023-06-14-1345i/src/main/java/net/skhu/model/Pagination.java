package net.skhu.model;

public class Pagination {
	
	int pg = 1;
	int sz = 15;
	int recordCount;
	
	public String getQueryString() {
		return String.format("pg=%d&sz=%d", pg, sz);
	}

}
