package nuc.ss.test.section7_4;

class HisenseTVFactory implements TVFactory {
    public TV produceTV() {
    	System.out.println("���ŵ��ӻ������������ŵ��ӻ���");
    	return new HisenseTV();
    }
}