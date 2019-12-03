package nuc.ss.test.section7_1_3b;

class Rectangle extends Geometry {
    private double a;
    private double b;
    
    public Rectangle(double a, double b) {
    	this.a = a; 
    	this.b = b; 
    }
    
    public double getArea() { 
    	return (a * b);  
    }
}
