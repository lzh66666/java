package ��һ�¸���;
/**
 * HelloWorld����2
 * @author ¬��
 *
 */
public class HelloWorld2 {
	public static void main(String[] args) {
		Student s = new Student();
		s.speak("Hello World!");
	}
}

class Student{
	public void speak(String sentence) {
		System.out.println(sentence);
	}
}
