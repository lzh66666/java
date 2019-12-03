/**
 * 测试字符类型和布尔类型
 * @author 卢泽华
 *
 */
public class TestPrimitiveDateType3 {
	public static void main(String[] agrs) {
		char a='T';
		char b='尚';
		char c='\u0061';
		System.out.println(c);
		
		//转义字符
		System.out.println('a'+'b');
		System.out.println(""+'a'+'b');
		System.out.println(""+'a'+'\n'+'b');
		System.out.println(""+'a'+'\t'+'b');
		System.out.println(""+'a'+'\''+'b');//a'b
		
		//String是一个字符序列
		String d="abc";
		//测试布尔类型
		boolean man=true;
		if(man) {
			System.out.println("男人");
		}
	}
}
