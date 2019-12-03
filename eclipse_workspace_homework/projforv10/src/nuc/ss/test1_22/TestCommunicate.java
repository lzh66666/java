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
 * ����P247��2��
 * @author ¬��
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
				System.out.println("���е�ͨѶ��Ա����:");
				try {
					communite.read(file);
				} catch (EOFException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("������Ҫ�����ĳ�Ա����");
				String name = sc.next();
				communite.search(file, name);
				break;
			case 5:
				System.out.println("������Ҫ�޸�ǰ��Ա����");
				String name1 = sc.next();
				communite.setText(file,name1);
				break;
			case 6:
				System.out.println("������Ҫɾ���ĳ�Ա����");
				String name3 = sc.next();
				communite.deleteText(file,name3);
				break;
			default:
				System.out.println("������: 1-6");
				continue;
			}
		}
	}
}

class Communite{
	/**
	 * �˵�ҳ��
	 */
	public void menu(){
		System.out.println("���������ѡ��:");
		System.out.println("1.��ʼ��ͨѶ¼");
		System.out.println("2.����ͨѶ¼��Ա");
		System.out.println("3.��ʾ����ͨѶ¼��Ա");
		System.out.println("4.������Ҫ�ĳ�Ա");
		System.out.println("5.�޸���Ҫ�ĳ�Ա");
		System.out.println("6.ɾ����Ҫ�ĳ�Ա");
		
	}
	/**
	 *  ��ʼ��ͨѶ¼��Ա
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
		map.put("����",new Users("����",123456));
		map.put("����",new Users("����",12345));
		map.put("����",new Users("����",1234));
		map.put("����",new Users("����",1234567));
		map.put("����",new Users("����",123456));
		
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
	
	 /*  ������ͨѶ¼��Ա
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
		System.out.println("�����������û�������:");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("�������" + (i+1) + "λ��Ա����Ϣ");
			System.out.println("��������û�������:");
			String name = sc.next();
			System.out.println("��������û��ĵ绰:");
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
	 * ������еĳ�Ա
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
					System.out.println("���� = " + name + ",�绰= " + phone);
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
	 *������Ҫ�ĳ�Ա
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
					System.out.println("����=" + name1 + ",�绰" + phone);
					judge = true;
					break;
				}
			}
			if(!judge) {
				System.out.println("û�и��û���Ϣ");
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
	 * �޸�����Ҫ�ĳ�Ա
	 */
	public void setText(File file,String target) {
		String src;
		System.out.println("�޸���������1,�޸ĺ�������2");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int judge = sc.nextInt();
		if(judge == 1) {
			System.out.println("�������޸ĺ������");
			src = sc.next();
		}else {
			System.out.println("�������޸ĺ�ĺ���");
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
	 * ɾ������Ҫ�ĳ�Ա
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