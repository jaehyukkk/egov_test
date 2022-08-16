package egovframework.example.cmmn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import egovframework.example.cmmn.vo.BoardVO;
import egovframework.example.commn.dao.BoardDAO;

@Service
public class BoardService {
	
	private final BoardDAO boardDAO;
	
	public BoardService(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}
	
	public List<BoardVO> selectBoard(){
		return boardDAO.selectBoard();
	}
	
	public int insertBoard(BoardVO boardVO) {
		return boardDAO.insertBoard(boardVO);
	}

}
