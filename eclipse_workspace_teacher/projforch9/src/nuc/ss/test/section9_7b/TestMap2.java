package nuc.ss.test.section9_7b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import nuc.ss.test.section9_4.Student;

public class TestMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Student> map=new HashMap<Integer,Student>();
		Student s1=new Student(1003,"li",20);
		map.put(new Integer(1003),s1);
		map.put(new Integer(1002),new Student(1002,"li",20));
		map.put(1004,new Student(1004,"��",18));
		map.put(1001,new Student(1001,"wang",18));
		Student s2=new Student(1005,"Ѧ",22);
		map.put(1005,s2);// �Զ�װ��
		//map.put(new Integer(1002),new Student(1002,"������",20));
		
		System.out.println("����keyֵȡ��ѧ����Ϣ:key=1002,"+map.get(1002));		
		System.out.println("************************************");
		System.out.println("�������е�keyֵ��");
		Iterator iterkey=map.keySet().iterator();
		while(iterkey.hasNext()){
			System.out.println(iterkey.next());
		}
		System.out.println("************************************");
		System.out.println("�������е�valueֵ��");
		Iterator itervalue=map.values().iterator();
		while(itervalue.hasNext()){
			System.out.println(itervalue.next());
		}
		System.out.println("************************************");
		System.out.println("ͬʱ�������е�key��valueֵ��");
		Iterator iterentry=map.entrySet().iterator();
		while(iterentry.hasNext()){
			Map.Entry entry = (Map.Entry)iterentry.next();
			System.out.println("key="+entry.getKey()+":"+"value="+entry.getValue());
		}
		//����Keyֵɾ��ѧ����Ϣ	
		map.remove(1004);		
		System.out.println("************************************");
		System.out.println("ɾ��key=1004��ѧ�������,�õ���������map������Ԫ��:");
		Iterator iterentrydel=map.entrySet().iterator();
		while(iterentrydel.hasNext()){
			Map.Entry entry = (Map.Entry)iterentrydel.next();
			System.out.println("key="+entry.getKey()+":"+"value="+entry.getValue());
		}
	}

}
