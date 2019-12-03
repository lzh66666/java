package 第四章数组.第1题;

public class Arr {
	public static void main(String[] args) {
		int [] oldArr = {1,3,5,1,1,6,6,1,5,7,6,7,1,5};
		int [] newArr = new int[9];
		int j = 0;
		for (int i = 0; i < oldArr.length; i++) {
			if(oldArr[i] == 1) {
				continue;
			}
		    newArr[j++] = oldArr[i];
		}
		for (int i : newArr) {
			System.out.print(i+" ");
		}
	}
}
