package nuc.ss.shopping.frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import nuc.ss.shopping.dao.BookDaoImpl;
import nuc.ss.shopping.dao.IBookDao;
import nuc.ss.shopping.entiy.Book;
import nuc.ss.shopping.entiy.User;


public class BookListFormFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	private BookListFormFrame bookListForm;
	
	/* ��¼ҳ/�û�����ҳ���ݵĵ�¼�û����� */
	@SuppressWarnings("unused")
	private User user = null;
	
	/* �鼮�������� */
	@SuppressWarnings("unused")
	private List<Book> mBooks = null;

	private JLabel lblBookName, lblCart, lblQuantity, lblCartDetail;
	private JTable tblBooks;
	private JButton btnQuery, btnBuy;
	private JScrollPane scrollPane;
	private JTextField txtBookId;
	
	public BookListFormFrame getBookListForm() {
		return bookListForm;
	}
	
	public BookListFormFrame(User user) {
		setTitle("���̹���ƽ̨--��Ʒ��ѯ����ҳ��");
		setBounds(100, 100, 380, 450);
		setResizable(false);
		getContentPane().setLayout(null);
		bookListForm = this;
		this.user = user;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
		
		setCenter(this);
		
		this.setVisible(true);
	}
	
	private void init() {
		lblBookName = new JLabel("�鼮��ţ�");
		lblBookName.setBounds(10, 24, 70, 15);
		add(lblBookName);
		
		txtBookId = new JTextField(10);
		txtBookId.setBounds(71, 19, 159, 25);
		add(txtBookId);

		btnQuery = new JButton("��ѯ");
		btnQuery.setBounds(250, 15, 70, 32);
		add(btnQuery);
		
		tblBooks = new JTable();
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 57, 350, 273);
		scrollPane.setViewportView(tblBooks);
		add(scrollPane);
		
		// ��ʾ�鼮��Ϣ
		initBooksTableModel();
		showBooks(null);
		
		btnBuy = new JButton("�� ��");
		btnBuy.setBounds(464, 380, 70, 32);
		add(btnBuy);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(230, 380, 70, 32);
		add(btnHome);
		
		btnHome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ���ص�¼����
				LoginRegFrame loginForm = new LoginRegFrame();
				loginForm.getLoginRegFrame().setVisible(true);
				bookListForm.dispose();
				
			}
		});
		
		lblCart = new JLabel("���ﳵ��Ʒ����");
		lblCart.setBounds(10, 388, 110, 15);
		add(lblCart);
		
		lblQuantity = new JLabel("0��");
		lblQuantity.setBounds(111, 388, 42, 15);
		add(lblQuantity);

		lblCartDetail = new JLabel("�鿴����");
		lblCartDetail.setForeground(Color.BLUE);
		lblCartDetail.setBounds(150, 388, 61, 15);
		add(lblCartDetail);


		
		// ��ѯ��ť��� - �¼���������
		btnQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String bid = txtBookId.getText().toString();

				// ��ʾ�鼮��Ϣ
				initBooksTableModel();
				showBooks(bid);
			}
		});
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
	private void showBooks(String bid) {

		IBookDao dao = new BookDaoImpl(); 
		List<Book> books = dao.queryAllBooks();
		List<Book> bookss = new ArrayList<Book>();

		Iterator<Book> iter = books.iterator();
		Book book = null;
		// �ж��Ƿ��ѯ���������������鼮��Ϣ
		// �ڱ�������ʾ����
		DefaultTableModel dt = (DefaultTableModel) tblBooks.getModel();
		if(bid != null) {
			if(bid.equals("")) {
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
			else {
				while (iter.hasNext()) {
					book = iter.next();
					if (book.getBid().equals(bid)) {
						bookss.add(book);
					}
				}
				if (bookss == null || bookss.size() == 0) {
					JOptionPane.showMessageDialog(null, "û�������������鼮��Ϣ", "������Ϣ", JOptionPane.WARNING_MESSAGE);
					return;
				} else {
					dt.setRowCount(bookss.size());
					dt.setColumnCount(5);
					for (int i = 0; i < bookss.size(); i++) {
						dt.setValueAt(bookss.get(i).getBid(), i, 0);
						dt.setValueAt(bookss.get(i).getName(), i, 1);
						dt.setValueAt(bookss.get(i).getAuthor(), i, 2);
						dt.setValueAt(bookss.get(i).getPrice(), i, 3);
						dt.setValueAt(bookss.get(i).getNum(), i, 4);
					}
				}
			}
		} else {
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
		// end
	}

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
}