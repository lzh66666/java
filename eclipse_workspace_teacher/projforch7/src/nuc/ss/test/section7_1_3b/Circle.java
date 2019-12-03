package nuc.ss.test.section7_1_3b;

class Circle extends Geometry {
    private double r;
    
    public Circle(double r) { 
    	this.r = r;  
    }
    
    public double getArea() { 
    	return (3.14 * r * r);  
    }
}
