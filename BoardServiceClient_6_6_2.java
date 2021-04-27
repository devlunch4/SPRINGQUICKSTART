package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient_6_6_2 {

	public static void main(String[] args) {
		// 1. Spring Container working
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring Container to BoardServiceImpl object Lookup
		BoardService boardService = (BoardService) container.getBean("boardService");

		// 3. Write function Test
		BoardVO vo = new BoardVO();
		vo.setTitle("test title");
		vo.setWriter("test writer");
		vo.setContent("test content....");
		boardService.insertBoard(vo);

		// 4. Board list search Test
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}

		// 5. Quit Container.
		container.close();

	}
}
