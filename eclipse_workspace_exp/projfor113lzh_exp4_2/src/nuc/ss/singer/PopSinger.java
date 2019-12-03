package nuc.ss.singer;

public class PopSinger extends AbstractSinger{

	public PopSinger(String name, String style) {
		super(name, style);
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("我的名字是" + name + ",我的演唱风格为" + style + ",我是唱流行音乐的");
	}
	
	
	
}
