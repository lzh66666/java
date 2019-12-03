package nuc.ss.test1_22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 书上P247第2题
 * @author 卢泽华
 * @version 2019 11 24 14:16
 * 
 */

public class TestCommunicate {
	private static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		File file = new File("communicate1.txt");
		Communite communite = new Communite();
		
		while (true) {
			communite.menu();
			int choise = sc.nextInt();
			switch (choise) {
			case 1:
				communite.write(file);
				break;
			case 2:
				communite.add(file);
				break;
			case 3:
				System.out.println("所有的通讯成员如下:");
				try {
					communite.read(file);
				} catch (EOFException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("请输入要检索的成员姓名");
				String name = sc.next();
				communite.search(file, name);
				break;
			case 5:
				System.out.println("请输入要修改前成员姓名");
				String name1 = sc.next();
				communite.setText(file,name1);
				break;
			case 6:
				System.out.println("请输入要删除的成员姓名");
				String name3 = sc.next();
				communite.deleteText(file,name3);
				break;
			default:
				System.out.println("请输入: 1-6");
				continue;
			}
		}
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
		System.out.println("5.修改需要的成员");
		System.out.println("6.删除需要的成员");
		
	}
	/**
	 *  初始化通讯录成员
	 * @param file
	 */
	public void write(File file) {
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Map<String, Users> map = new HashMap<String, Users>();
		map.put("张三",new Users("张三",123456));
		map.put("李四",new Users("李四",12345));
		map.put("王五",new Users("王五",1234));
		map.put("赵六",new Users("赵六",1234567));
		map.put("韩七",new Users("韩七",123456));
		
		Iterator<Entry<String, Users>> iter = map.entrySet().iterator();
		
		FileWriter fout = null;
		BufferedWriter bOut = null;
		
		try {
			fout = new FileWriter(file);
			bOut = new BufferedWriter(fout);
			while(iter.hasNext()) {
				Map.Entry<String, Users> entry = (Map.Entry<String, Users>)iter.next();
				bOut.write(entry.getKey() + "\r\n");
				bOut.write(entry.getValue().getPhone() + "" + "\r\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bOut != null) {
				try {
					bOut.flush();
					bOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	 /*  增加新通讯录成员
	 * @param file
	 */
	public void add(File file) {
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Map<String, Users> map = new HashMap<String, Users>();
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
			map.put(name, user);
		}
		Iterator<Entry<String, Users>> iter = map.entrySet().iterator();
		
		FileWriter fout = null;
		BufferedWriter bOut = null;
		
		try {
			fout = new FileWriter(file,true);
			bOut = new BufferedWriter(fout);
			while(iter.hasNext()) {
				Map.Entry<String, Users> entry = (Map.Entry<String, Users>)iter.next();
				bOut.write(entry.getKey() + "\r\n");
				bOut.write(entry.getValue().getPhone() + "");
				bOut.write("\r\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bOut != null) {
				try {
					bOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 输出所有的成员
	 */
	
	public void read(File file) throws EOFException {
		FileReader fin = null;
		BufferedReader bIn = null;
		String name;
		String phone;
		try {
			fin = new FileReader(file);
			bIn = new BufferedReader(fin);
			while((name = bIn.readLine()) != null){
				
				if(!name.equals("")) {
					phone = bIn.readLine();
					System.out.println("姓名 = " + name + ",电话= " + phone);
				}	
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		}  finally {
			if(bIn != null) {
				try {
					bIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 *检索需要的成员
	 */
	
	public void search(File file,String name) {
		FileReader fin = null;
		BufferedReader bIn = null;
		String name1;
		String phone;
		boolean judge = false;
		try {
			fin = new FileReader(file);
			bIn = new BufferedReader(fin);
			while((name1 = bIn.readLine()) != null) {
				phone = bIn.readLine();
				if(name1.equals(name)) {
					System.out.println("姓名=" + name1 + ",电话" + phone);
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
		} finally {
			if(bIn != null) {
				try {
					bIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 修改所需要的成员
	 */
	public void setText(File file,String target) {
		String src;
		System.out.println("修改名字输入1,修改号码输入2");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int judge = sc.nextInt();
		if(judge == 1) {
			System.out.println("请输入修改后的名字");
			src = sc.next();
		}else {
			System.out.println("请输入修改后的号码");
			src = sc.next();
		}
        BufferedReader br = null;
        PrintWriter pw = null;
        StringBuffer buff = new StringBuffer();
        try {
            br=new BufferedReader(new FileReader(file));
            for(String str = br.readLine();str != null;str = br.readLine()) {
                if(str.equals(target)) {
                	if(judge == 1) {
                		str=str.replaceAll(target,src);
                	}else {
                		buff.append(str+"\r\n");
                		str = br.readLine();
                		str = str.replaceAll(str,src);
                	}
                }
                buff.append(str+"\r\n");
            }
            pw = new PrintWriter(new FileWriter(file),true);
            pw.println(buff);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(pw != null) 
                pw.close();
        }
    }
	
	/**
	 * 删除所需要的成员
	 */
	public void deleteText(File file,String target) {
        BufferedReader br = null;
        PrintWriter pw = null;
        StringBuffer buff = new StringBuffer();
        try {
            br = new BufferedReader(new FileReader(file));
            for(String str = br.readLine() ;str != null;str = br.readLine()) {
                if(str.equals(target)) {
                	str = "\r\n";
                	buff.append(str);
                	str = br.readLine();
                	str = br.readLine();
                }
                buff.append(str + "\r\n");
            }
            pw = new PrintWriter(new FileWriter(file),true);
            pw.println(buff);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(pw != null) 
                pw.close();
        }
    }
}
