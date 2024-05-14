package chap21_multithread;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import chap21_multithread.threads.PrintThread;

public class _15_ThreadPool03 {

	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		
		PrintThread pt01 = new PrintThread();
		PrintThread pt02 = new PrintThread();

		pt02.setThreadName("스레드 2번");
		
		for(int i = 0; i < 10; i++) {
			pt01.setThreadName("스레드 1번 - " + i);
			
			// execute() 메소드
			// 스레드 풀의 최대 스레드 개수가 5개로 지정되어 있어서
			// 0~4번까지 처음에 스레드가 지정되고
			// 0번 스레드의 작업이 끝나면 5번 스레드의 할당이 일어나게 된다.
//			System.out.println(i);
			threadPool.execute(pt01);
			// execute : ExecutorService 인터페이스에서 정의된 메소드,
			// 작업을 스레드풀에 제출해 실행시키는 데 사용한다.
			// Runnable 객체를 인자로 받아 해당 작업을 스레드풀에 제출한다.
		}
		
		// Runnable : 스레드를 생성하기 위한 인터페이스, 스레드가 실행할 작업을 정의하는 데 사용
		List<Runnable> runnableList = threadPool.shutdownNow();
		
		for(Runnable runnable : runnableList) {
			System.out.println(runnable);
		}
	}

}
