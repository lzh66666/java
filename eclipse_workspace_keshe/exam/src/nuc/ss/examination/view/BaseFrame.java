package nuc.ss.examination.view;

import javax.swing.JFrame;

/**
 * 窗口抽象类
 * @author 卢泽华
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
    
    //窗体程序初始化
    protected void init() {
        setup();
        addElement();
        addListener();
        setFrameSelf();
    }

    //设置 字体  颜色  背景  布局
    protected abstract void setup();
    //将组件添加到窗体中
    protected abstract void addElement();
    //添加事件监听
    protected abstract void addListener();
    //设置窗体自身
    protected abstract void setFrameSelf();
}
