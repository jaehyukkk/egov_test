package egovframework.example.cmmn.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {
	private int seq;
	private String title;
	private String description;
	private String writer;
}
