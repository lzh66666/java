package nuc.ss.test.jdkinterfacedemo.cloneable;

public class TestStudentCloneable {
    public static void main(String[] args){
       Student stu = new Student(18001,"�Ŵ�",98.0f);
       Student stuByClone = null;
       try{
         stuByClone = (Student)stu.clone();
       } catch(CloneNotSupportedException e){
         e.printStackTrace();
       }
       
       System.out.println(stu);
       System.out.println(stuByClone);
       
       System.out.print("����������");
       if(stu == stuByClone){
          System.out.println("��ͬһ������");
       }else{
          System.out.println("����ͬһ�����󣬺�����ǰ�ߵĿ�¡��");
       }
     }
}