package egovframework.example.cmmn.web;

import egovframework.example.cmmn.service.BoardService;
import egovframework.example.cmmn.vo.BoardVO;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	private final BoardService boardService;

	public HomeController(BoardService boardService) {
		this.boardService = boardService;
	}

	@RequestMapping(value="/testList.do")
	public String testListDo(Model model) {
		List<BoardVO> boardList = boardService.selectBoard();
		model.addAttribute("data", boardList);
		return "test/testList";
	}
	
	@RequestMapping(value="/test.do")
	public String testListDo1(Model model) {
		List<BoardVO> boardList = boardService.selectBoard();
		model.addAttribute("data", boardList);
		return "test/testList";
	}

	@RequestMapping(value = "/create.do", method = RequestMethod.POST)
	public String insertBoard(BoardVO boardVO) {
		boardService.insertBoard(boardVO);
		return "redirect:/testList.do";
	}

	@ResponseBody
	@RequestMapping(value = "/boardList.do")
	public ResponseEntity<?> boardList() {
		return new ResponseEntity<>(boardService.selectBoard(), HttpStatus.OK);
	}
}
