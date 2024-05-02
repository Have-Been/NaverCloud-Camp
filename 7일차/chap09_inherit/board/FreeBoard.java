package chap09_inherit.board;

public class FreeBoard extends Board {
	String attachFile;

	public FreeBoard(long id, String title, String content, String write, 
			String creDate, String attachFile) {
		super(id, title, content, write, creDate);
		this.attachFile = attachFile;
	}
	
	@Override
	public void post() {
		System.out.println("자유게시판에 게시글을 작성합니다.");
		System.out.println(this.attachFile + "파일을 업로드합니다.");
	}
	
}
