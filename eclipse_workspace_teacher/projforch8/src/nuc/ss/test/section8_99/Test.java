package nuc.ss.test.section8_99;

import java.awt.BorderLayout; 
import java.awt.Color; 
import java.awt.Container; 
import java.awt.Cursor; 
import java.awt.Dimension; 
import java.awt.GridLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.KeyEvent; 
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 
import java.awt.event.WindowAdapter; 
import java.awt.event.WindowEvent; 

import javax.swing.BoundedRangeModel; 
import javax.swing.ButtonGroup; 
import javax.swing.DefaultListModel; 
import javax.swing.Icon; 
import javax.swing.ImageIcon; 
import javax.swing.JButton; 
import javax.swing.JCheckBox; 
import javax.swing.JComboBox; 
import javax.swing.JDialog; 
import javax.swing.JFileChooser; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JList; 
import javax.swing.JMenu; 
import javax.swing.JMenuBar; 
import javax.swing.JMenuItem; 
import javax.swing.JOptionPane; 
import javax.swing.JPanel; 
import javax.swing.JProgressBar; 
import javax.swing.JRadioButton; 
import javax.swing.JScrollPane; 
import javax.swing.JSplitPane; 
import javax.swing.JTabbedPane; 
import javax.swing.JTable; 
import javax.swing.JTextField; 
import javax.swing.JTextPane; 
import javax.swing.JToggleButton; 
import javax.swing.JTree; 
import javax.swing.Timer; 
import javax.swing.border.EtchedBorder; 
import javax.swing.event.ListSelectionEvent; 
import javax.swing.event.ListSelectionListener; 
import javax.swing.event.TreeSelectionEvent; 
import javax.swing.event.TreeSelectionListener; 
import javax.swing.tree.DefaultMutableTreeNode; 
import javax.swing.tree.TreeSelectionModel; 

public class Test extends JFrame{ 
	public Test(){ 
		MenuTest menuTest=new MenuTest(); 
		LeftPanel leftPanel=new LeftPanel(); 
		RightPanel rightPanel=new RightPanel(); 
		BottomPanel bottomPanel=new BottomPanel(); 
		CenterPanel centerPanel=new CenterPanel(); 
		Container c=this.getContentPane(); 
		this.setJMenuBar(menuTest); 
		c.add(leftPanel,BorderLayout.WEST); 
		c.add(rightPanel,BorderLayout.EAST); 
		c.add(centerPanel,BorderLayout.CENTER); 
		c.add(bottomPanel,BorderLayout.SOUTH); 
		this.addWindowListener(new WindowAdapter(){ 
			public void WindowClosing(WindowEvent e){ 
				dispose(); 
				System.exit(0); 
			} 
		}); 
		setSize(700,500); 
		setTitle("Swing �����ȫ�����"); 
		setUndecorated(true); 
		setLocation(200,150);
		this.setVisible(true);
	}

	class MenuTest extends JMenuBar{ 
		private JDialog aboutDialog; 
		public MenuTest(){ 
			JMenu fileMenu=new JMenu("�ļ�"); 
			JMenuItem exitMenuItem=new JMenuItem("�˳�",KeyEvent.VK_E); 
			JMenuItem aboutMenuItem=new JMenuItem("����..",KeyEvent.VK_A); 
			fileMenu.add(exitMenuItem); 
			fileMenu.add(aboutMenuItem); 
			this.add(fileMenu); 
			aboutDialog=new JDialog(); 
			initAboutDialog(); 
			exitMenuItem.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
					dispose(); 
					System.exit(0); 
				} 
			}); 
			aboutMenuItem.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
					aboutDialog.show(); 
				} 
			}); 
		} 

		public JDialog get(){ 
			return aboutDialog; 
		} 

		public void initAboutDialog(){ 
			aboutDialog.setTitle("����"); 
			Container con=aboutDialog.getContentPane(); 
			Icon icon=new ImageIcon("sdmile.gif"); 
			JLabel aboutLabel=new JLabel("<html><b><font size=5>"+"<center>Swing!"+"<br>",icon,JLabel.CENTER); 
			con.add(aboutLabel,BorderLayout.CENTER); 
			aboutDialog.setSize(450,225); 
			aboutDialog.setLocation(300,300); 
			aboutDialog.addWindowListener(new WindowAdapter(){ 
				public void WindowClosing(WindowEvent e){ 
					dispose(); 
				} 
			}); 
		} 
	} 

	class LeftPanel extends JPanel{ 
		private int i=0; 
		public LeftPanel(){ 
			DefaultMutableTreeNode root=new DefaultMutableTreeNode("Root"); 
			DefaultMutableTreeNode child=new DefaultMutableTreeNode("Child"); 
			DefaultMutableTreeNode select=new DefaultMutableTreeNode("select"); 
			DefaultMutableTreeNode child1=new DefaultMutableTreeNode(""+i); 
			root.add(child); 
			root.add(select); 
			child.add(child1); 
			JTree tree=new JTree(root); 
			tree.getSelectionModel().setSelectionMode(TreeSelectionModel.DISCONTIGUOUS_TREE_SELECTION);
			tree.setRowHeight(20); 
			tree.addTreeSelectionListener(new TreeSelectionListener(){ 
				public void valueChanged(TreeSelectionEvent e){ 
					JTree tree=(JTree)e.getSource(); 
					DefaultMutableTreeNode selectNode=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent(); 
					i++; 
					selectNode.add(new DefaultMutableTreeNode(""+i)); 
				} 
			}); 
			tree.setPreferredSize(new Dimension(100,300)); 
			JScrollPane scrollPane=new JScrollPane(tree); 
			this.add(scrollPane); 
		} 
	} 

	class BottomPanel extends JPanel{ 
		private JProgressBar pb; 
		public BottomPanel(){ 
			pb=new JProgressBar(); 
			pb.setPreferredSize(new Dimension(680,20)); 
			Timer time=new Timer(1,new ActionListener(){ 
				int counter=0; 
				public void actionPerformed(ActionEvent e){ 
					counter++; 
					pb.setValue(counter); 
					Timer t=(Timer)e.getSource(); 
					if(counter==pb.getMaximum()){ 
						t.stop(); 
						counter=0; 
						t.start(); 
					} 
				} 
			}); 
			time.start(); 
			pb.setStringPainted(true); 
			pb.setMinimum(0); 
			pb.setMaximum(1000); 
			pb.setBackground(Color.white); 
			pb.setForeground(Color.red); 
			this.add(pb); 
		} 

		public void setProcessBar(BoundedRangeModel rangeModel){ 
			pb.setModel(rangeModel); 
		} 
	} 

	class RightPanel extends JPanel{ 
		public RightPanel(){ 
			this.setLayout(new GridLayout(8,1)); 
			JCheckBox checkBox=new JCheckBox("��ѡ��ť"); 
			JButton button=new JButton("���ļ�"); 
			button.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
					JFileChooser file=new JFileChooser(); 
					int resule=file.showOpenDialog(new JPanel()); 
					if(resule==file.APPROVE_OPTION){ 
						String fileName=file.getSelectedFile().getName(); 
						String dir=file.getSelectedFile().getName(); 
						JOptionPane.showConfirmDialog(null,dir+"\\"+fileName,"ѡ����ļ�",JOptionPane.YES_OPTION); 
					} 
				} 
			}); 
			JToggleButton toggleButton=new JToggleButton("˫̥��ť"); 
			ButtonGroup buttonGroup=new ButtonGroup(); 
			JRadioButton radioButton1=new JRadioButton("��ѡ��ť1",false); 
			JRadioButton radioButton2=new JRadioButton("��ѡ��ť2",false); 
			JComboBox comboBox=new JComboBox(); 
			comboBox.setToolTipText("��������б�����ѡ��"); 
			comboBox.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
					JComboBox comboBox=(JComboBox)e.getSource(); 
					comboBox.addItem("����Ա"); 
					comboBox.addItem("����Ա"); 
				} 
			}); 
			DefaultListModel litem=new DefaultListModel(); 
			litem.addElement("�㽶"); 
			litem.addElement("ˮ��"); 
			JList list=new JList(litem); 
			list.addListSelectionListener(new ListSelectionListener(){ 
				public void valueChanged(ListSelectionEvent e){ 
					JList l=(JList)e.getSource(); 
					Object s=l.getSelectedValue(); 
					JOptionPane.showMessageDialog(null,s,"��Ϣ��",JOptionPane.YES_OPTION); 
				} 
			}); 
			buttonGroup.add(radioButton1);
			buttonGroup.add(radioButton2);
			add(button);
			add(toggleButton);
			add(checkBox);
			add(radioButton1);
			add(radioButton2);
			add(comboBox);
			add(list);
			this.setBorder(new EtchedBorder(EtchedBorder.LOWERED,Color.LIGHT_GRAY,Color.blue));
		}
	}

	class CenterPanel extends JPanel{ 
		public CenterPanel(){ 
			JTabbedPane tab=new JTabbedPane(JTabbedPane.TOP); 
			JTextField textField=new JTextField("�ı��򣬵����<�ļ���ť>��ѡ���ļ�"); 
			textField.setActionCommand("textField"); 
			JTextPane textPane=new JTextPane(); 
			textPane.setCursor(new Cursor(Cursor.TEXT_CURSOR)); 
			textPane.setText("�༭�������ŵ���ı��������������ָ�����"); 
			textPane.addMouseListener(new MouseAdapter(){ 
				public void mousePressed(MouseEvent e){ 
					JTextPane textPane=(JTextPane)e.getSource(); 
					textPane.setText("�༭���������ɹ�"); 
				} 
			}); 
			JSplitPane splitPane=new JSplitPane(JSplitPane.VERTICAL_SPLIT,textField,textPane); 
			JTable table=new JTable(10,10); 
			JPanel pane=new JPanel(); 
			pane.add(table.getTableHeader(),BorderLayout.NORTH); 
			pane.add(table); 
			tab.addTab("�ı���ʾ",splitPane); 
			tab.addTab("������ʾ", pane); 
			tab.setPreferredSize(new Dimension(500,600)); 
			this.add(tab); 
			this.setEnabled(true); 
		} 
	}
	
	public static void main(String args[]){ 
		new Test(); 
	} 
}