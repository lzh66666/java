package nuc.ss.test4;

public class TestClassRoom {
	public static void main(String[] args) {
		/*
		 ClassRoom classRoom = new ClassRoom(); classRoom.teacher = new
		 Thread(classRoom,"����ʦ"); classRoom.student = new Thread(classRoom,"�Ű�˯");
		 classRoom.student.start(); classRoom.teacher.start();
		 */
		new ClassRoom();
	}
}

class ClassRoom implements Runnable {
	Thread student, teacher;

	public ClassRoom() {
		teacher = new Thread(this);
		student = new Thread(this);
		teacher.setName("����ʦ");
		student.setName("�Ű�˯");
		student.start();
		teacher.start();
		
	}

	@Override
	public void run() {
		if (Thread.currentThread() == student) {
			try {
				System.out.println(student.getName() + "����˯��,������");
				Thread.sleep(1000 * 60 * 60);
			} catch (InterruptedException e) {
				System.out.println(student.getName() + "����ʦ������");
			}
			System.out.println(student.getName() + "��ʼ����");
		} else if (Thread.currentThread() == teacher) {
			for (int i = 1; i <= 3; i++) {
				System.out.println("�Ͽ�");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			student.interrupt();// ����ѧ��
		}
	}
}