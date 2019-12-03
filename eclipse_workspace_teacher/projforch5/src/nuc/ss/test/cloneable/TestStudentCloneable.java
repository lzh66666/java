package nuc.ss.test.cloneable;

class Student implements Cloneable{
    private int num;
    private String name;
    private float score;
    public Student(int num,String name,float score){
      this.num = num;  this.name = name;  this.score = score;
    }
    public String toString(){
      return "学号:" + num + " ; 姓名:" + name + " ; 成绩:" + score;
    }
    public void speakAfterTest(){
      System.out.println("机考终于结束，我叫" + name
             + ",学号" + num + ",答题很顺利，得了" + score + "分！");
    }
    public Object clone() throws CloneNotSupportedException{
      return super.clone();
    }
}

public class TestStudentCloneable {
    public static void main(String[] args){
       Student stu = new Student(17001,"张大江",98.0f);
       Student stuByClone = null;
       try{
         stuByClone = (Student)stu.clone();
       } catch(CloneNotSupportedException e){
         e.printStackTrace();
       }
       stu.speakAfterTest();
       stuByClone.speakAfterTest();
       System.out.print("这两个对象");
       if(stu == stuByClone){
          System.out.println("是同一个对象！");
       }else{
          System.out.println("不是同一个对象，后者是前者的克隆！");
       }
     }
}