package com.biz.jdbc.medel;

public class iolistVO {

	private Long IO_SEQ; //	NUMBER
	private String IO_DATE; //	VARCHAR2(10 BYTE)
	private String IO_INOUT; //	NVARCHAR2(10 CHAR)
	private int IO_AMT; //	NUMBER
	private int IO_PRICE; //	NUMBER
	private int IO_TOTAL; //	NUMBER
	private String IO_PCODE; //	VARCHAR2(7 BYTE)
	private String IO_CCODE; //	VARCHAR2(5 BYTE)
	public Long getIO_SEQ() {
		return IO_SEQ;
	}
	public void setIO_SEQ(Long iO_SEQ) {
		IO_SEQ = iO_SEQ;
	}
	public String getIO_DATE() {
		return IO_DATE;
	}
	public void setIO_DATE(String iO_DATE) {
		IO_DATE = iO_DATE;
	}
	public String getIO_INOUT() {
		return IO_INOUT;
	}
	public void setIO_INOUT(String iO_INOUT) {
		IO_INOUT = iO_INOUT;
	}
	public int getIO_AMT() {
		return IO_AMT;
	}
	public void setIO_AMT(int iO_AMT) {
		IO_AMT = iO_AMT;
	}
	public int getIO_PRICE() {
		return IO_PRICE;
	}
	public void setIO_PRICE(int iO_PRICE) {
		IO_PRICE = iO_PRICE;
	}
	public int getIO_TOTAL() {
		return IO_TOTAL;
	}
	public void setIO_TOTAL(int iO_TOTAL) {
		IO_TOTAL = iO_TOTAL;
	}
	public String getIO_PCODE() {
		return IO_PCODE;
	}
	public void setIO_PCODE(String iO_PCODE) {
		IO_PCODE = iO_PCODE;
	}
	public String getIO_CCODE() {
		return IO_CCODE;
	}
	public void setIO_CCODE(String iO_CCODE) {
		IO_CCODE = iO_CCODE;
	}
	@Override
	public String toString() {
		return "iolistVO [IO_SEQ=" + IO_SEQ + ", IO_DATE=" + IO_DATE + ", IO_INOUT=" + IO_INOUT + ", IO_AMT=" + IO_AMT
				+ ", IO_PRICE=" + IO_PRICE + ", IO_TOTAL=" + IO_TOTAL + ", IO_PCODE=" + IO_PCODE + ", IO_CCODE="
				+ IO_CCODE + "]";
	}
	
	
	
	
	
	
}
