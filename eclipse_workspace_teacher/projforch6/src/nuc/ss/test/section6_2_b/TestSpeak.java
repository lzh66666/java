package nuc.ss.test.section6_2_b;
abstract class Speak {
   public abstract void speakHello();
}
class Student {
   void f(Speak sp) {
     sp.speakHello();   
   } 
}
public class TestSpeak {
   public static void main(String args[]) {
      Speak speak=new Speak() {  
                      public void  speakHello() { 
                         System.out.println("��Һã�ף����˳����");
                      }
                  };
       speak.speakHello(); 
       Student st=new Student();
       st.f(new Speak() {         
                 public void  speakHello() { 
                    System.out.println("I am a student,how are you");
                 }
            });
   } 
}



