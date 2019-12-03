package nuc.ss.test.cloneable;

class Student implements Cloneable{
    private int num;
    private String name;
    private float score;
    public Student(int num,String name,float score){
      this.num = num;  this.name = name;  this.score = score;
    }
    public String toString(){
      return "ѧ��:" + num + " ; ����:" + name + " ; �ɼ�:" + score;
    }
    public void speakAfterTest(){
      System.out.println("�������ڽ������ҽ�" + name
             + ",ѧ��" + num + ",�����˳��������" + score + "�֣�");
    }
    public Object clone() throws CloneNotSupportedException{
      return super.clone();
    }
}

public class TestStudentCloneable {
    public static void main(String[] args){
       Student stu = new Student(17001,"�Ŵ�",98.0f);
       Student stuByClone = null;
       try{
         stuByClone = (Student)stu.clone();
       } catch(CloneNotSupportedException e){
         e.printStackTrace();
       }
       stu.speakAfterTest();
       stuByClone.speakAfterTest();
       System.out.print("����������");
       if(stu == stuByClone){
          System.out.println("��ͬһ������");
       }else{
          System.out.println("����ͬһ�����󣬺�����ǰ�ߵĿ�¡��");
       }
     }
}