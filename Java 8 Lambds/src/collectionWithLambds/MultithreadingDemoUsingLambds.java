package collectionWithLambds;

public class MultithreadingDemoUsingLambds {

	public static void main(String[] args) {

//	Runnable runnable =() -> {
//			for ( int i = 0 ;i < 10 ;i++) {
//				System.out.println(i+ " PR Lambds");
//			}
//		};
//	
//	Thread thread = new Thread(runnable);
//	thread.start();
//	
//	for ( int i = 0  ; i< 10 ; i ++) {
//		System.out.println( i+" PUPA Lambds");
//	}

		Thread thread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + " PR Lambds");
			}
		});

		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " PUPA Lambds");
		}

	}

}
