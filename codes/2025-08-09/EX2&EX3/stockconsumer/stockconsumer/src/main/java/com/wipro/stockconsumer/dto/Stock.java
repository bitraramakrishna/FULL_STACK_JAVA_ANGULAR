package com.wipro.stockconsumer.dto;

public class Stock {
	private String subjectCode;
    private String subjectvalue;

    public Stock() {}

    public Stock(String subjectCode, String subjectvalue) {
        this.subjectCode = subjectCode;
        this.subjectvalue = subjectvalue;
    }

    
    @Override
    public String toString() {
        return "Stock{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectvalue='" + subjectvalue + '\'' +
                '}';
    }

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectvalue() {
		return subjectvalue;
	}

	public void setSubjectvalue(String subjectvalue) {
		this.subjectvalue = subjectvalue;
	}
    
}
