package nuc.ss.test.cal;

import java.util.Scanner;
public class Cal {
	private double num1;
	private double num2;
	private char op;
	//�ò�����ʼ����Ա����
	void init(double num1,char op,double num2){
		this.num1=num1;
		this.op=op;
		this.num2=num2;
	}
	//�Ӽ��̽������ݳ�ʼ��
	void init(){
		System.out.println("������һ�����ʽ����ʽΪ��23 + 45");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextDouble();
		op=sc.next().charAt(0);
		num2=sc.nextDouble();
		
	}
	//��ȡ������1
	double getNum1(){
		return num1;
	}
	//��ȡ������2
	double getNum2(){
		return num2;
	}
	//��ȡ�����
	char getOp(){
		return op;
	}
	//����
	double cal(){
		double result=0;
		switch(op){
		   case '+':result=num1+num2;break;
		   case '-':result=num1-num2;break;
		   case '*':result=num1*num2;break;
		   case '/':result=num1/num2;break;
		   default:System.out.println("����������������");
		}
		return result;
	}
	
}

