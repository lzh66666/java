package nuc.ss.test.section7_4;

class HaierTVFactory implements TVFactory {
    public TV produceTV() {
    	System.out.println("海尔电视机工厂生产海尔电视机。");
    	return new HaierTV();
    }
}
