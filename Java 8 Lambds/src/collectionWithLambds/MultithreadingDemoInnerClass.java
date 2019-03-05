package collectionWithLambds;

public class MultithreadingDemoInnerClass {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i + " pr");
				}
			}
		};

	Thread thread = new Thread(runnable);
	thread.start();
	
	for ( int i = 0  ; i< 10 ; i ++) {
		System.out.println( i+" PUPA ");
	}
	
	
	
	
	}

}
