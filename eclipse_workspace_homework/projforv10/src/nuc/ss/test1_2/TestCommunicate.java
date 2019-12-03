package nuc.ss.test1_2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 书上P247第2题
 * @author 卢泽华
 * @version 2019 11 23 22:01
 */

public class TestCommunicate {
	private static java.util.Scanner sc = new java.util.Scanner(System.in);
	private static int i = 5;
	public static void main(String[] args) {
		File file = new File("communicate.txt");
		Communite communite = new Communite();
		
		while (true) {
			communite.menu();
			int choise = sc.nextInt();
			switch (choise) {
			case 1:
				i = communite.write(file);
				break;
			case 2:
				i = communite.add(file,i);
				System.out.println(i);
				break;
			case 3:
				System.out.println("所有的通讯成员如下:");
				try {
					communite.read(file,i);
				} catch (EOFException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("请输入要检索的成员姓名");
				String name = sc.next();
				communite.search(file, name,i);
				break;
			default:
				System.out.println("请输入: 1-4");
				continue;
			}
		}
	}
}

/**
  *     非常之重要！！！！！！！！！！
 *
 */
class MyObjectOutputStream extends ObjectOutputStream { 
	 public MyObjectOutputStream() throws IOException {  
	        super(); 
	  }
	  public MyObjectOutputStream(OutputStream out) throws IOException {
	    super(out);
	   } 
	  
	  @Override 
	  protected void writeStreamHeader() throws IOException { 
	     return;
	  }
} 

class Communite{
	/**
	 * 菜单页面
	 */
	public void menu(){
		System.out.println("请输入你的选择:");
		System.out.println("1.初始化通讯录");
		System.out.println("2.增加通讯录成员");
		System.out.println("3.显示所有通讯录成员");
		System.out.println("4.检索需要的成员");
	}
	/**
	 *  初始化通讯录成员
	 * @param file
	 */
	public int write(File file) {
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		List<Users> list = new ArrayList<Users>();
		list.add(new Users("张三",123456));
		list.add(new Users("李四",12345));
		list.add(new Users("王五",1234));
		list.add(new Users("赵六",1234567));
		list.add(new Users("韩七",123456));
		
		Iterator<Users> iter = list.iterator();
		
		FileOutputStream fout = null;
		ObjectOutputStream objectOut = null;
		Users user1 = null;
		
		try {
			fout = new FileOutputStream(file);
			if(file.length() < 1) {
				objectOut = new ObjectOutputStream(fout);
			}else {
				objectOut = new MyObjectOutputStream(fout);
			}
			while(iter.hasNext()) {
				user1 = iter.next();
				objectOut.writeObject(user1);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(objectOut != null) {
				try {
					objectOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return 5;
	}
	
	 /*  增加新通讯录成员
	 * @param file
	 */
	public int add(File file,int k) {
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		List<Users> list = new ArrayList<Users>();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Users user;
		int phone;
		System.out.println("请输入增加用户的数量:");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("请输入第" + (i+1) + "位成员的信息");
			System.out.println("请输入该用户的姓名:");
			String name = sc.next();
			System.out.println("请输入该用户的电话:");
			phone = sc.nextInt();
			user = new Users(name, phone);
			list.add(user);
		}
		Iterator<Users> iter = list.iterator();
		
		FileOutputStream fout = null;
		ObjectOutputStream objectOut = null;
		Users user1 = null;
		
		try {
			fout = new FileOutputStream(file,true);
			if(file.length() < 1) {
				objectOut = new ObjectOutputStream(fout);
			}else {
				objectOut = new MyObjectOutputStream(fout);
			}
			while(iter.hasNext()) {
				user1 = iter.next();
				objectOut.writeObject(user1);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(objectOut != null) {
				try {
					objectOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return k+n;
	}
	
	/**
	 * 输出所有的成员
	 */
	
	public void read(File file,int k) throws EOFException {
		FileInputStream fin = null;
		ObjectInputStream objectIn = null;
		Users user = null;
		try {
			fin = new FileInputStream(file);
			objectIn = new ObjectInputStream(fin);
			for(int i = 0; i < k; i++) {
				user = (Users)objectIn.readObject();
				System.out.println(user);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(objectIn != null) {
				try {
					objectIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	/**
	 *检索需要的成员
	 */
	
	public void search(File file,String name,int k) {
		FileInputStream fin = null;
		ObjectInputStream objectIn = null;
		Users user;
		boolean judge = false;
		try {
			fin = new FileInputStream(file);
			objectIn = new ObjectInputStream(fin);
			for(int i = 0; i < k; i++) {
				user = (Users)objectIn.readObject();
				if(user.check(name)) {
					System.out.println(user);
					judge = true;
					break;
				}
			}
			if(!judge) {
				System.out.println("没有该用户信息");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(objectIn != null) {
				try {
					objectIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
