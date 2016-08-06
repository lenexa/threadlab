package code.threadsim;

public class EvenPrinter implements Runnable {

	@Override
	public void run()
	{
		for(int k=0; k<100; k=k+2)
		{
			System.out.println(k);
		}
	}

}
