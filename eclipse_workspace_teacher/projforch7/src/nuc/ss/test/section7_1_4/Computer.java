package nuc.ss.test.section7_1_4;

class Computer {
	private Com com;  
	
	public void setCom(Com com){ 
		this.com = com;
	}
	
	public Com getCom() {
		return com;
	}
	
	public int f(int a, int b){
		return com.computer(a, b);
	}
}

