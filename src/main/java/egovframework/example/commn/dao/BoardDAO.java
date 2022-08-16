package egovframework.example.commn.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import egovframework.example.cmmn.vo.BoardVO;

@Repository
public class BoardDAO {
	
	private static final String mapperNamespace = "egovframework.example.mappers.board.BoardMapper.";
	
	private final SqlSession sqlSession;
	
	public BoardDAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<BoardVO> selectBoard() {
		return sqlSession.selectList(mapperNamespace +"selectBoard");
	}
	
	public int insertBoard(BoardVO boardVO) {
		return sqlSession.insert(mapperNamespace +"insertBoard", boardVO);
	}

}
