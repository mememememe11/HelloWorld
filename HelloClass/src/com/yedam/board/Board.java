package com.yedam.board;

// 글번호, 제목, 내용, 작성자 : 필드
// getter, setter 작성
// 기본생성자, 전체매개값을 갖는 생성자
public class Board {
	
	public Board() { }

	public Board(int boardNo, String title, String content, String writer) {
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	private int boardNo; // 글번호
	private String title; // 제목
	private String content; //내용
	private String writer;	//작성자
	
	//생성자
	int getBoardNo() {
		return boardNo;
	}
	void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	String getContent() {
		return content;
	}
	void setContent(String content) {
		this.content = content;
	}
	String getWriter() {
		return writer;
	}
	void setWriter(String writer) {
		this.writer = writer;
	}
//	public Board() {}
//	public Board(int GoardNo, String title, String content, String )
	
	//글번호, 제목, 작성자 => 간략출력
	public void showInfo() {
	// 1 날씨가 좋아요    홍길동	
		System.out.printf("%3d %12s %4\n", boardNo, title, writer);
		
	}
	// 상세보기
	public void showAllInfo( ) {
		// 글번호: 5    작성자: 홍길동
		// 제목: 날씨가 좋아요
		// 내용: 오늘 30도가 넘는데도 좋아요
		String strFormat = "글번호: %d    작성자: %s\n";
		strFormat += "제목: %s\n";
		strFormat += "내용: %s";
		System.out.printf("",boardNo, writer, title, content);
	}
}		
