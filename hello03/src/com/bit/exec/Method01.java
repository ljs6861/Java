package com.bit.exec;

public class Method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pa();
		sum();
		pa();
		sum();
		pa();
		sum();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// ���丮����
	static void pa(){
		int pa = 0 ;
		for(int i = 1 ; i < 10 ; i++ ){
			pa *= i ;
		}
		System.out.println(pa);
	}
	
	// ����
	static void sum(){
		int intSum = 0;
		for(int i = 0 ; i < 11 ; i++){
			intSum += i;
		}
		System.out.println("�հ�:" + intSum);
	}

}
