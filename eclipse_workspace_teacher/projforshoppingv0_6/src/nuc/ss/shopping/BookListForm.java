package nuc.ss.shopping;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.entity.User;
import nuc.ss.shopping.service.BookDao;
import nuc.ss.shopping.service.BookDaoImpl;

public class BookListForm extends JFrame{
	private static final long serialVersionUID = 1L;

	private BookListForm bookListForm;
	
	/* 登录页/用户详情页传递的登录用户对象 */
	private User user = null;
	
	/* 书籍集合数据 */
	private List<Book> mBooks = null;

	private JLabel lblBookName, lblCategory, lblCart, lblWelcome, lblName, lblCity, lblQuantity, lblCartDetail;
	private JTable tblBooks;
	private JButton btnQuery, btnBuy;
	private JScrollPane scrollPane;
	private JTextField txtBookName;
	private JComboBox<String> cboCategory;
	
	public BookListForm getBookListForm() {
		return bookListForm;
	}
	
	public BookListForm(User user) {
		setTitle("电商购物平台--商品查询页面");
		setBounds(100, 100, 550, 450);
		setResizable(false);
		getContentPane().setLayout(null);
		bookListForm = this;
		this.user = user;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//BookDao dao = new BookDaoImpl(); 
		//this.mBooks = dao.queryBook(null, 0);
		
		init();
		
		initDatas();
		
		setCenter(this);
		
		this.setVisible(true);
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void init() {
		lblBookName = new JLabel("书籍名：");
		lblBookName.setBounds(10, 64, 70, 15);
		add(lblBookName);
		
		txtBookName = new JTextField(10);
		txtBookName.setBounds(71, 59, 159, 25);
		add(txtBookName);

		btnQuery = new JButton("查询");
		btnQuery.setBounds(464, 55, 70, 32);
		add(btnQuery);
		
		tblBooks = new JTable();
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 97, 524, 273);
		scrollPane.setViewportView(tblBooks);
		add(scrollPane);
		
		// 显示书籍信息
		initBooksTableModel();
		showBooks(null, 0);
		
		lblWelcome = new JLabel("您好，");
		lblWelcome.setBounds(10, 10, 42, 15);
		add(lblWelcome);
		
		lblName = new JLabel("");
		lblName.setBounds(55, 10, 91, 15);
		add(lblName);
		
		lblCity = new JLabel("来自于：");
		lblCity.setBounds(434, 10, 100, 15);
		add(lblCity);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 35, 524, 2);
		add(separator);
		
		btnBuy = new JButton("购 买");
		btnBuy.setBounds(464, 380, 70, 32);
		add(btnBuy);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(364, 380, 70, 32);
		add(btnHome);
		
		btnHome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 返回登录界面
				LoginForm loginForm = new LoginForm();
				loginForm.getLoginForm().setVisible(true);
				bookListForm.dispose();
				
			}
		});
		
		lblCart = new JLabel("购物车商品数：");
		lblCart.setBounds(10, 388, 110, 15);
		add(lblCart);
		
		lblQuantity = new JLabel("0件");
		lblQuantity.setBounds(111, 388, 42, 15);
		add(lblQuantity);

		lblCartDetail = new JLabel("查看详情");
		lblCartDetail.setForeground(Color.BLUE);
		lblCartDetail.setBounds(150, 388, 61, 15);
		add(lblCartDetail);

		lblCategory = new JLabel("分类：");
		lblCategory.setBounds(240, 64, 70, 15);
		add(lblCategory);
		
		cboCategory = new JComboBox<String>();
		cboCategory.setModel(new DefaultComboBoxModel<String>(new String[] {
				"- 请选择 -", "工具类 > 软件编程", "小说类 > 历史" }));
		cboCategory.setBounds(288, 59, 159, 25);
		add(cboCategory);
		
		// 查询按钮点击 - 事件处理程序
		btnQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String name = txtBookName.getText().toString();
				int category = cboCategory.getSelectedIndex();

				// 显示书籍信息
				initBooksTableModel();
				showBooks(name, category);
			}
		});
	}

	/**
	 * 初始化表格控件(书籍表)
	 */
	private void initBooksTableModel() {
		// 创建一个JTable的默认显示模式
		DefaultTableModel dt = new DefaultTableModel();
		// 设置JTable的列的个数和列的名字
		dt.setColumnIdentifiers(new Object[] { "书籍编号", "书籍名称", "书籍作者", "库存", "书籍分类" });

		tblBooks.setBackground(new Color(255, 255, 255));
		// 设置JTable表格对象被选中行的背景色
		tblBooks.setSelectionBackground(new Color(128, 0, 255));
		// 设置JTable表格对象被选中行的字体色
		tblBooks.setSelectionForeground(new Color(255, 255, 255));
		// 为表格设置商品信息表格模型
		tblBooks.setModel(dt);
		tblBooks.isCellEditable(tblBooks.getSelectedRow(),
				tblBooks.getSelectedColumn());

		tblBooks.getColumnModel().getColumn(0).setPreferredWidth(70);
		tblBooks.getColumnModel().getColumn(1).setPreferredWidth(150);
		tblBooks.getColumnModel().getColumn(2).setPreferredWidth(70);
		tblBooks.getColumnModel().getColumn(3).setPreferredWidth(70);
		tblBooks.getColumnModel().getColumn(4).setPreferredWidth(164);

	}

	/**
	 * 在表格中显示书籍信息
	 * 
	 */
	private void showBooks(String name, int category) {

		BookDao dao = new BookDaoImpl(); 
		List<Book> books = dao.queryBook(name);

		// 判断是否查询到了满足条件的书籍信息
		if (books == null || books.size() == 0) {
			JOptionPane.showMessageDialog(null, "没有满足条件的书籍信息", "警告信息",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		// 在表格中显示数据
		DefaultTableModel dt = (DefaultTableModel) tblBooks.getModel();
		// bejin（此处请同学们补充代码，完成表格数据显示）
		dt.setRowCount(4);
		dt.setColumnCount(5);
		for(int i = 0 ; i < books.size(); i++) {
			dt.setValueAt(books.get(i).getBid(), i, 0);
			dt.setValueAt(books.get(i).getName(), i, 1);
			dt.setValueAt(books.get(i).getAuthor(), i, 2);
			dt.setValueAt(books.get(i).getNumber(), i, 3);
			dt.setValueAt(books.get(i).getCategory(), i, 4);
		}
		
		
		// end
	}
	
	/**
	 * 将用户信息通过Swing控件呈现。
	 */
	private void initDatas() {
		if (user == null) {
			JOptionPane.showMessageDialog(null, "登录页/用户信息详情页未传递有效的用户对象。",
					"警告信息", JOptionPane.WARNING_MESSAGE);
			return;
		}

		// 显示用户真实姓名
		this.lblName.setText(user.getName());
		// 显示用户所在地
		this.lblCity.setText("来自于: " + user.getCity());
		
	}

	/**
	 * 窗体自动居中 
	 * 
	 * @param window
	 */
	private void setCenter(JFrame window) {
		// 获取屏幕的大小
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int width = window.getWidth();
		int height = window.getHeight();
		// 居中显示
		window.setBounds((d.width - width) / 2, 
				         (d.height - height) / 2, 
				          width,
				          height);
		
	}
	
}
