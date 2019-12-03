package nuc.ss.test.section7_1_3b;

class Pillar {
   private Geometry bottom;
   private double height;
   
   public Pillar(Geometry bottom, double height) {
       this.bottom = bottom;  
       this.height = height; 
   }
   
   public double getVolume() {
       return( bottom.getArea() * height);   }
}
