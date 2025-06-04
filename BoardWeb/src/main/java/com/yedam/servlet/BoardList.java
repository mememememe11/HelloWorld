package com.yedam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.DataSource;
import com.yedam.mapper.BoardMapper;
import com.yedam.vo.BoardVO;

/**
 * Servlet implementation class BoardList
 */
@WebServlet("/boardList.serv")
public class BoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BoardList() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
//		out.append("Served at: ").append(request.getContextPath());
		out.print("<h3>hello</h3>");
		out.print("<p>from 정경준_servlet</p>");
		SqlSession sqlSession = DataSource.getInstance().openSession(); 
		
		// 인터페이스 - 매퍼
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		List<BoardVO> list = mapper.selectList();
		
		out.print("<table border='1'>");
		out.print("<thead><tr><th>글번호</th><th>제목</th><th>작성자</th></tr></thead>");
		out.print("<tbody>");
		for(int i = 0; i < list.size(); i++) {
			out.print("<tr>");
			out.print("<td align='center'>" + list.get(i).getBoardNo() + "</td>");
			out.print("<td>" + list.get(i).getTitle() + "</td>");
			out.print("<td>" + list.get(i).getWriter() + "</td>");
			out.print("</tr>");
		}
		out.print("</tbody></table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
