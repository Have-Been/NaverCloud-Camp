package chap21_multithread.threads;

public class SyncThread02 extends Thread{
	private PrintNumberWithSync pnws;
	
	public void setPnws(PrintNumberWithSync pnws) {
		this.pnws = pnws;
	}
	
	public PrintNumberWithSync getPnws() {
		return this.pnws;
	}
	
	@Override
	public void run() {
		// 동기화 블록에 의해서 동기화 메소드에서 선점한 공유객체를 사용할 수 없는 상태
		// 공유 객체를 선점한 스레드의 작업이 끝날 떄까지 실행되지 않는다.
		
		pnws.printNum2(20);
	}
}
