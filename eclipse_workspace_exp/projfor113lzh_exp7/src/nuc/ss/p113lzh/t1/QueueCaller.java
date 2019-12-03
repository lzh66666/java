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
	 * 取号
	 * @param patient
	 */
	public void fetchNumber(String patient) {
		queue.add(patient);
		System.out.println(patient+ "还有" + (size()-1) + "位在等候就诊");
	}
	
	public void showPatients() {
		if(queue.size() == 0) {
			return;
		}else {
			Iterator<String> iter = queue.iterator();
			while(iter.hasNext()) {
				String name = iter.next();
				System.out.println(name + "在等候");
			}
		}
	}
	
	public void callNumber() {
		System.out.println("请患者: " + queue.get(0) + "到诊室就诊");
		queue.remove(0);
		
	}
	
}
