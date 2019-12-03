package nuc.ss.test.section6_3;

public class TestPrintStackTrace {
    public static void f() throws Exception{
        throw new Exception("≥ˆŒ Ã‚¿≤£°");
    }
    
    public static void g() throws Exception{
        f();
    }
    
    public static void main(String[] args) {
        try {
            g();
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("------------------------------");
            for(StackTraceElement elem : e.getStackTrace()) {
                System.out.println(elem);
            }
        }
    }
}