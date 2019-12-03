package nuc.ss.test4;

public class TestClassRoom {
	public static void main(String[] args) {
		/*
		 ClassRoom classRoom = new ClassRoom(); classRoom.teacher = new
		 Thread(classRoom,"严老师"); classRoom.student = new Thread(classRoom,"张爱睡");
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
		teacher.setName("严老师");
		student.setName("张爱睡");
		student.start();
		teacher.start();
		
	}

	@Override
	public void run() {
		if (Thread.currentThread() == student) {
			try {
				System.out.println(student.getName() + "正在睡觉,不听课");
				Thread.sleep(1000 * 60 * 60);
			} catch (InterruptedException e) {
				System.out.println(student.getName() + "被老师叫醒了");
			}
			System.out.println(student.getName() + "开始听课");
		} else if (Thread.currentThread() == teacher) {
			for (int i = 1; i <= 3; i++) {
				System.out.println("上课");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			student.interrupt();// 叫醒学生
		}
	}
}