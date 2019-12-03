package nuc.ss.p113lzh.t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QueueCaller {
	private List<String> queue;

	public QueueCaller() {
		queue= new ArrayList<String>();
	}
	
	public int size() {
		return queue.size();
	}
	
	/**
	 * ȡ��
	 * @param patient
	 */
	public void fetchNumber(String patient) {
		queue.add(patient);
		System.out.println(patient+ "����" + (size()-1) + "λ�ڵȺ����");
	}
	
	public void showPatients() {
		if(queue.size() == 0) {
			return;
		}else {
			Iterator<String> iter = queue.iterator();
			while(iter.hasNext()) {
				String name = iter.next();
				System.out.println(name + "�ڵȺ�");
			}
		}
	}
	
	public void callNumber() {
		System.out.println("�뻼��: " + queue.get(0) + "�����Ҿ���");
		queue.remove(0);
		
	}
	
}