package chap11_abstraction.board;

public class FreeBoard extends Board {
	
	String attachFile;
	
	public FreeBoard(long id, String title, String content, String write, 
			String creDate, String attachFile) {
		super(id, title, content, write, creDate);
		this.attachFile = attachFile;
	}

	@Override
	public void post() {
		// TODO Auto-generated method stub
		System.out.println("자유게시판에 글을 작성합니다.");
		System.out.println(this.attachFile + " 파일을 업로드합니다.");
	}

	@Override
	public void modify() {
		System.out.println("자유게시판 게시글을 수정합니다.");
		System.out.println(this.attachFile + " 파일을 추가로 업로드합니다.");
		
	}

	@Override
	public void delete() {
		System.out.println("자유게시판 게시글을 삭제합니다");
		System.out.println(this.attachFile + " 파일을 삭제합니다.");
		
	}

}
