package chap21_multithread.threads;

public class NonSyncThread01 extends Thread{
	private PrintNumberWithSync pnws;
	
	public void setPnws(PrintNumberWithSync pnws) {
		this.pnws = pnws;
	}
	
	public PrintNumberWithSync getPnws() {
		return this.pnws;
	}
	
	@Override
	public void run() {
		pnws.printNum1(10);
	}
}
