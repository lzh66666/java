
/**
 * 测试静态初始化块的使用
 * @author 卢泽华
 *
 */
//上溯到Object类，先执行object类的静态初始化块，在执行子类的静态初始化块，直到我们的静态初始化块为止
public class User3 {
    int id;        //id
    String name;   //账户名
    String pwd;   //密码
    static String company; //公司名称
    
    static {
        System.out.println("执行类的初始化工作");
        company = "北京尚学堂";
        printCompany();
    }  
    
    public static void printCompany(){
        System.out.println(company);
    }  
    public static void main(String[] args) {
        User3  u3 = null;
    }
}