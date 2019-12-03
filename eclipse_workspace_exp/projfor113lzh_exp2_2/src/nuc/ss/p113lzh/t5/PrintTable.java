package nuc.ss.p113lzh.t5;

public class PrintTable {

	public static void main(String[] args) {
		int row = 0;
		int column = 0;
		while(row < 10) {
			while(column < 10) {
				System.out.print("("+row+","+column+")");
				column++;
			}
			column = 0;
			row++;
			System.out.println();
		}
	}

}
