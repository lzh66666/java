package nuc.ss.singer;

public class MainClass {
	public static void main(String[] args) {
		AbstractSinger singerPeople = new PopSinger("ÕÅÈý", "Ò¡¹ö");
		singerPeople.introduce();
		singerPeople.sing();
	}
}
