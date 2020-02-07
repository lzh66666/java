package nuc.ss.examination.view;

import javax.swing.JFrame;

/**
 * ���ڳ�����
 * @author ¬��
 * @version 2019 12 18
 *
 */
public abstract class BaseFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	
	public BaseFrame() {
	}
    public BaseFrame(String title){
        super(title);
    }
    
    //��������ʼ��
    protected void init() {
        setup();
        addElement();
        addListener();
        setFrameSelf();
    }

    //���� ����  ��ɫ  ����  ����
    protected abstract void setup();
    //�������ӵ�������
    protected abstract void addElement();
    //����¼�����
    protected abstract void addListener();
    //���ô�������
    protected abstract void setFrameSelf();
}
