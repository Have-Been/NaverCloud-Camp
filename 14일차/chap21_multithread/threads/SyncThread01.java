package chap21_multithread.threads;

public class SyncThread01 extends Thread{
	private PrintNumberWithSync pnws;
	
	public void setPnws(PrintNumberWithSync pnws) {
		this.pnws = pnws;
	}
	
	public PrintNumberWithSync getPnws() {
		return this.pnws;
	}
	
	@Override
	public void run() {
		// 동기화 메소드 호출
		pnws.printNum1(10);
	}
}
