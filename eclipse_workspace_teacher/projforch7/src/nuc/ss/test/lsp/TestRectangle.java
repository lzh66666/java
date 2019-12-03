package nuc.ss.test.lsp;

class Rectangle {
    double length;
    double width;
    
    public Rectangle() {
	}
    
    public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
    
	public double getLength() { 
        return length; 
    } 
    public void setLength(double length) { 
        this.length = length; 
    } 
    public double getWidth() { 
        return width; 
    } 
    public void setWidth(double width) { 
        this.width = width;
    }

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	} 
    
}

class Square extends Rectangle {
    public Square(double sideLength) {
		setLength(sideLength);
	}
	public void setWidth(double width) { 
        super.setLength(width); 
        super.setWidth(width);
    }
    public void setLength(double length) { 
        super.setLength(length);
        super.setWidth(length);
    }
}

public class TestRectangle { 
	public static void main(String[] args) {
		Rectangle objRect = new Rectangle(12, 6);
		//Square objSqu = new Square(12);
		
		System.out.println(objRect);
		resize(objRect);
		System.out.println(objRect);
	}
    public static void resize(Rectangle obj) { 
        while(obj.getWidth() <= obj.getLength()) { 
            obj.setWidth(obj.getWidth () + 1);
        }
    }
}
