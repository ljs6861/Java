package com.bit.classes;

public class GradeVO {
	
	private int intNum;
	private String strName;
	
//	private int intKor;
//	private int intEng;
//	private int intMath;
//	
//	private int intTotal;
//	
	
	// 나를 상속한 하위 class에서만 직접 접근 할 수 있도록 허용
	protected int intKor;
	protected int intEng;
	protected int intMath;
	
	protected int intTotal;
	
	private int intAvg;
	private int intRank;
	
	
	public int getIntNum() {
		return intNum;
	}
	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	public int getIntAvg() {
		return intAvg;
	}
	public void setIntAvg(int intAvg) {
		this.intAvg = intAvg;
	}
	public int getIntRank() {
		return intRank;
	}
	public void setIntRank(int intRank) {
		this.intRank = intRank;
	}
	
	
	
	
	
}
