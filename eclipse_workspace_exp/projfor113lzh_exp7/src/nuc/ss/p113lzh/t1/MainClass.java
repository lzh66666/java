package nuc.ss.p113lzh.t1;

public class MainClass {
	public static void main(String[] args) {
		QueueCaller qc = new QueueCaller();
		for (int i = 1; i <= 3; i++) {
		  qc.fetchNumber("ÕÅÉ½-" + i);
		}
		while (qc.size() != 0) {
			qc.callNumber();
			qc.showPatients();
		}
		
	}
}
