package nuc.ss.test.section7_4;

class HaierTVFactory implements TVFactory {
    public TV produceTV() {
    	System.out.println("�������ӻ����������������ӻ���");
    	return new HaierTV();
    }
}
