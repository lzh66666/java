package nuc.ss.singer;

public class PopSinger extends AbstractSinger{

	public PopSinger(String name, String style) {
		super(name, style);
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("�ҵ�������" + name + ",�ҵ��ݳ����Ϊ" + style + ",���ǳ��������ֵ�");
	}
	
	
	
}
