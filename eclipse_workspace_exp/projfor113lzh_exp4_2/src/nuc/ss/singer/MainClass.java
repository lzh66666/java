package nuc.ss.singer;

public class MainClass {
	public static void main(String[] args) {
		AbstractSinger singerPeople = new PopSinger("����", "ҡ��");
		singerPeople.introduce();
		singerPeople.sing();
	}
}
