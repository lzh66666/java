package nuc.ss.shopping.frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import nuc.ss.shopping.dao.BookDaoImpl;
import nuc.ss.shopping.dao.IBookDao;
import nuc.ss.shopping.entiy.Book;
import nuc.ss.shopping.entiy.User;


public class ShoppingCartFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	private ShoppingCartFrame shoppingCart;
	
	/* ��¼ҳ/�û�����ҳ���ݵĵ�¼�û����� */
	@SuppressWarnings("unused")
	private User user = null;
	
	/* �鼮�������� */
	@SuppressWarnings("unused")
	private List<Book> mBooks = null;

	private JLabel lblCart, lblQuantity;
	private JTable tblBooks;
	private JScrollPane scrollPane;
	
	public ShoppingCartFrame getBookListForm() {
		return shoppingCart;
	}
	
	public ShoppingCartFrame() {
		setTitle("���ﳵ");
		setBounds(100, 100, 380, 400);
		setResizable(false);
		getContentPane().setLayout(null);
		shoppingCart = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
		
		setCenter(this);
		
		this.setVisible(true);
	}
	
	private void init() {
		
		tblBooks = new JTable();
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 20, 350, 273);
		scrollPane.setViewportView(tblBooks);
		add(scrollPane);
		
		// ��ʾ�鼮��Ϣ
		initBooksTableModel();
		showBooks();
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(288, 300, 70, 32);
		add(btnHome);
		
		btnHome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ���ص�¼����
				LoginRegFrame loginForm = new LoginRegFrame();
				loginForm.getLoginRegFrame().setVisible(true);
				shoppingCart.dispose();
				
			}
		});
		
		lblCart = new JLabel("���ﳵ��Ʒ����");
		lblCart.setBounds(10, 310, 110, 15);
		add(lblCart);
		
		lblQuantity = new JLabel("0��");
		lblQuantity.setBounds(111, 310, 42, 15);
		add(lblQuantity);

	}

	/**
	 * ��ʼ������ؼ�(�鼮��)
	 */
	private void initBooksTableModel() {
		// ����һ��JTable��Ĭ����ʾģʽ
		DefaultTableModel dt = new DefaultTableModel();
		// ����JTable���еĸ������е�����
		dt.setColumnIdentifiers(new Object[] { "�鼮���", "�鼮����", "�鼮����", "���", "�鼮����" });

		tblBooks.setBackground(new Color(255, 255, 255));
		// ����JTable�������ѡ���еı���ɫ
		tblBooks.setSelectionBackground(new Color(128, 0, 255));
		// ����JTable�������ѡ���е�����ɫ
		tblBooks.setSelectionForeground(new Color(255, 255, 255));
		// Ϊ����������Ʒ��Ϣ����ģ��
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
	 * �ڱ�������ʾ�鼮��Ϣ
	 * 
	 */
	private void showBooks() {
		initBooksTableModel();
		IBookDao dao = new BookDaoImpl(); 
		List<Book> books = dao.queryAllBooks();
		// �ж��Ƿ��ѯ���������������鼮��Ϣ
		// �ڱ�������ʾ����
		if (books == null || books.size() == 0) {
			JOptionPane.showMessageDialog(null, "���ﳵΪ��", "������Ϣ", JOptionPane.WARNING_MESSAGE);
			return;
		}else {
			DefaultTableModel dt = (DefaultTableModel) tblBooks.getModel();
			dt.setRowCount(books.size());
			dt.setColumnCount(5);
			for (int i = 0; i < books.size(); i++) {
				dt.setValueAt(books.get(i).getBid(), i, 0);
				dt.setValueAt(books.get(i).getName(), i, 1);
				dt.setValueAt(books.get(i).getAuthor(), i, 2);
				dt.setValueAt(books.get(i).getPrice(), i, 3);
				dt.setValueAt(books.get(i).getNum(), i, 4);
			}
		}
	}
		// end

	/**
	 * �����Զ����� 
	 * 
	 * @param window
	 */
	private void setCenter(JFrame window) {
		// ��ȡ��Ļ�Ĵ�С
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int width = window.getWidth();
		int height = window.getHeight();
		// ������ʾ
		window.setBounds((d.width - width) / 2, 
				         (d.height - height) / 2, 
				          width,
				          height);
		
	}
	
	public static void main(String[] args) {
		new ShoppingCartFrame();
	}
}