package nuc.ss.examination.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import nuc.ss.examination.entry.User;
import nuc.ss.examination.service.CompilerServiceImpl;
import nuc.ss.examination.service.ICompilerService;

public class CompilerFrame extends BaseFrame {
	private static final long serialVersionUID = 1L;

	private CompilerFrame compilerFrame;
	private User user;
	private int count;

	public CompilerFrame() {
		compilerFrame = this;
		this.init();
	}

	public CompilerFrame(User user,int count) {
		compilerFrame = this;
		this.user = user;
		this.count = count;
		this.init();
	}

	private JPanel selectPanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	private JTextArea complierArea = new JTextArea();
	private JScrollPane scrollPane = new JScrollPane(complierArea);

	private JButton save = new JButton("±£´æ");
	private JButton reset = new JButton("Çå¿Õ");
	private JButton back = new JButton("¹Ø±Õ");

	private ICompilerService compilerService = new CompilerServiceImpl();

	@Override
	protected void setup() {
		selectPanel.setLayout(null);
		selectPanel.setBackground(Color.LIGHT_GRAY);

		buttonPanel.setLayout(null);
		buttonPanel.setBounds(0, 453, 650, 90);

		scrollPane.setBounds(0, 0, 650, 450);
		complierArea.setFont(new Font("ºÚÌå", Font.PLAIN, 20));
		complierArea.setLineWrap(true);

		save.setBounds(40, 30, 100, 30);
		save.setFocusable(false);

		reset.setBounds(510, 30, 100, 30);
		reset.setFocusable(false);

		back.setBounds(276, 30, 100, 30);
		back.setFocusable(false);
	}

	@Override
	protected void addElement() {
		buttonPanel.add(save);
		buttonPanel.add(reset);
		buttonPanel.add(back);

		selectPanel.add(buttonPanel);
		selectPanel.add(scrollPane);
		add(selectPanel);
	}

	@Override
	protected void addListener() {
		compilerService.read(complierArea,user,count);
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compilerService.write(complierArea,user,count);
			}
		});

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				complierArea.setText("");
			}
		});

		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compilerFrame.dispose();
			}
		});

	}

	@Override
	protected void setFrameSelf() {
		setTitle("±àÒëÆ÷");
		this.setBounds(260, 80, 658, 570);
		this.setResizable(false);
		this.setVisible(true);
	}
}
