package nuc.ss.test.cal;

import java.util.Scanner;
public class Cal {
	private double num1;
	private double num2;
	private char op;
	//用参数初始化成员变量
	void init(double num1,char op,double num2){
		this.num1=num1;
		this.op=op;
		this.num2=num2;
	}
	//从键盘接收数据初始化
	void init(){
		System.out.println("请输入一个表达式，格式为：23 + 45");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextDouble();
		op=sc.next().charAt(0);
		num2=sc.nextDouble();
		
	}
	//获取操作数1
	double getNum1(){
		return num1;
	}
	//获取操作数2
	double getNum2(){
		return num2;
	}
	//获取运算符
	char getOp(){
		return op;
	}
	//计算
	double cal(){
		double result=0;
		switch(op){
		   case '+':result=num1+num2;break;
		   case '-':result=num1-num2;break;
		   case '*':result=num1*num2;break;
		   case '/':result=num1/num2;break;
		   default:System.out.println("您输入的运算符有误！");
		}
		return result;
	}
	
}

