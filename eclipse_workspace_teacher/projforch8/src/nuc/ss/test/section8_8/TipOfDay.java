package nuc.ss.test.section8_8;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class TipOfDay extends JDialog {
	private final JPanel contentPanel = new JPanel();
	
	public static void main(String[] args) {
		TipOfDay dialog = new TipOfDay();
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
		
	}
	
	public TipOfDay() {
		setTitle("������ʾ");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.NORTH);
			{
				JLabel label = new JLabel("������ʾ");
				panel.add(label);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.SOUTH);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JCheckBox checkBox = new JCheckBox("������ʾ");
				panel.add(checkBox);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.WEST);
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.EAST);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, BorderLayout.CENTER);
			{
				JTextArea textArea = new JTextArea();
				textArea.setFont(new Font("΢���ź�", Font.PLAIN, 14));
				textArea.setLineWrap(true);
				textArea.setText("ѧУλ���й���ʷ�Ļ����ǡ���ɽ��ʡ̫ԭ�У�����˷��������У����ѧУӵ�����ƵĽ�ѧ�������豸�͹���������ϵ��ѧУ��ռ��2995Ķ���������123��ƽ���ף��̶��ʲ���ֵ��35��Ԫ����ѧ���������豸��ֵ8.19��Ԫ��ѧУӵ��ֽ��ͼ��ݲ�230����ᡢ����ͼ���200��ᡢ56������֪�����ݿ���Դ��");
				scrollPane.setViewportView(textArea);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("������Ϣ");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				this.getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("�رմ���");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
