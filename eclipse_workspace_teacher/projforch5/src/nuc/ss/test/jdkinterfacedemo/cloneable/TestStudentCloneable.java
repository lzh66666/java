package nuc.ss.test.jdkinterfacedemo.cloneable;

public class TestStudentCloneable {
    public static void main(String[] args){
       Student stu = new Student(18001,"张大江",98.0f);
       Student stuByClone = null;
       try{
         stuByClone = (Student)stu.clone();
       } catch(CloneNotSupportedException e){
         e.printStackTrace();
       }
       
       System.out.println(stu);
       System.out.println(stuByClone);
       
       System.out.print("这两个对象");
       if(stu == stuByClone){
          System.out.println("是同一个对象！");
       }else{
          System.out.println("不是同一个对象，后者是前者的克隆！");
       }
     }
}