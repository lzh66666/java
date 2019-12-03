package nuc.ss.test3;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestStopWatch {

	public static void main(String[] args) {
		new StopWatch();
	}
}
class StopWatch extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private static final String INIT_TIME = "00:00:00:000";
	private JLabel timeshowlbl = null; //显示时间
	private Thread timerthread = null; //线程控制秒表开始、暂停、继续		
	private long startTime;            //线程开始时间
	private long pauseStartTime;       //线程暂停开始时间
	private long pauseCounTtime;       //暂停时间总和
	boolean flag, flagpause;           //标记线程的开始和结束，已经暂停和继续
	private JButton btpause;
	
	class CountThread implements Runnable{				
		public void run() {			
			while(flag){	
				long count = System.currentTimeMillis() - startTime - pauseCounTtime;
				timeshowlbl.setText(format(count));
                if(flagpause){
					synchronized(Thread.currentThread()){
						try {							
							Thread.currentThread().wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
                }
			}
		}	
	}
	public StopWatch(){		
		setTitle("秒表计算器");
		setSize(400,150);		
		init();
		setResizable(false);
		setVisible(true);
	}
	/**
	 * 将毫秒格式化
	 */
	public String format(long x){		
		int milli=0, second=0, minute=0, hour=0;	
		
		milli = (int)(x % 1000);
		
		x = x / 1000;
		second = (int)(x % 60);
		
		x = x / 60;
		minute = (int)(x % 60);
		
		x = x / 60;
		hour=(int)(x % 60);		
		
		return String.format("%02d:%02d:%02d:%03d", 
				              hour, minute, second, milli);
	}
	
	public void init(){
		setLayout(new GridLayout(2, 1, 2, 2));
		getContentPane().setBackground(Color.GREEN);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1, 3, 2, 2));		
		JButton btstart = new JButton("开始");
		JButton btreset = new JButton("重置");
		btpause = new JButton("暂停");			
		p.add(btstart);
		p.add(btpause);		
		p.add(btreset);	
		
		timeshowlbl = new JLabel(INIT_TIME, JTextField.CENTER);		
		timeshowlbl.setForeground(Color.blue);
		timeshowlbl.setFont(new Font("楷体", Font.BOLD, 50));
		
		this.add(timeshowlbl);
		this.add(p);
		
		//开始事件处理
		btstart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CountThread ct = new CountThread();
				timerthread = new Thread(ct);
				startTime = System.currentTimeMillis();
				pauseStartTime = 0;
				pauseCounTtime = 0;		
				btpause.setText("暂停");
				timeshowlbl.setText(INIT_TIME);
				flag = true;
				flagpause = false;
				timerthread.start();
			}
		});
		
		//暂停事件处理
		btpause.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	
				JButton bt = (JButton)e.getSource();
				if (bt.getText().equals("暂停")) {//判断按钮上的文字内容
			      synchronized(this){
					flagpause = true;
					pauseStartTime = System.currentTimeMillis();
					bt.setText("继续");
			      }
				} else if(bt.getText().equals("继续")) {					
					synchronized(timerthread){
						bt.setText("暂停");
						timerthread.notifyAll();
				    	flagpause = false;	
				    	pauseCounTtime += System.currentTimeMillis() - pauseStartTime;
				    	
				    }
				}
			}
		}); 
		
		//重置事件处理
		btreset.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {	
				flag = false;
				btpause.setText("暂停");
				timeshowlbl.setText(INIT_TIME);
			}
		});
	}
}
