package chap21_multithread.threads;

public class NonSyncThread02 extends Thread{
private PrintNumberWithSync pnws;
	
	public void setPnws(PrintNumberWithSync pnws) {
		this.pnws = pnws;
	}
	
	public PrintNumberWithSync getPnws() {
		return this.pnws;
	}
	
	@Override
	public void run() {
		pnws.printNum2(20);
	}
}
