package code.threadsim;

public class OddPrinter extends Thread {
	public void run()
	{
		for(int k=1; k<100; k=k+2)
		{
			System.out.println(k);
		}
	}
}
