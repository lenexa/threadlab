package code.threadsim;

public class ThreadRunner {

	public static void main(String[] args) {
		Thread ep = new Thread(new EvenPrinter());
		OddPrinter op = new OddPrinter();
		
		ep.start();
		op.start();
	}

}
