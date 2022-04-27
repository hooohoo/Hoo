package com.lec.sts_mybatis.board.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lec.sts_mybatis.board.C;
import com.lec.sts_mybatis.board.beans.BWriteDTO;
import com.lec.sts_mybatis.board.command.BCommand;
import com.lec.sts_mybatis.board.command.BDeleteCommand;
import com.lec.sts_mybatis.board.command.BListCommand;
import com.lec.sts_mybatis.board.command.BSelectCommand;
import com.lec.sts_mybatis.board.command.BUpdateCommand;
import com.lec.sts_mybatis.board.command.BViewCommand;
import com.lec.sts_mybatis.board.command.BWriteCommand;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
	
	private BCommand command;
	
	private SqlSession sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
		C.sqlSession = sqlSession;
	}

	public BoardController() {
		System.out.println("BoardController() 생성");
	}
	
	@RequestMapping(value = "/list.do")
	public String selectBoard(Model model) {
		command = new BListCommand();
		command.execute(model);
		return "board/list";
	}
	
	@RequestMapping(value = "/write.do")
	public String writeBoard(Model model) {
		return "board/write";
	}
	
	@RequestMapping(value = "/writeOk.do")
	public String writeOkBoard(BWriteDTO dto, Model model) {
		model.addAttribute("dto", dto);
		command = new BWriteCommand();
		command.execute(model);
		return "board/writeOk";
	}
	
	@RequestMapping(value = "/view.do")
	public String viewBoard(int uid, Model model) {
		model.addAttribute("uid", uid);
		command = new BViewCommand();
		command.execute(model);
		return "board/view";
	}
	
	@RequestMapping(value = "/update.do")
	public String updateBoard(int uid, Model model) {
		model.addAttribute("uid", uid);
		command = new BSelectCommand();
		command.execute(model);
		return "board/update";
	}
	
	@RequestMapping(value = "/updateOk.do")
	public String updateOkBoard(BWriteDTO dto, Model model) {
		model.addAttribute("dto", dto);
		command = new BUpdateCommand();
		command.execute(model);
		return "board/updateOk";
	}
	
	@RequestMapping(value = "/deleteOk.do")
	public String deleteOk(int uid, Model model) {
		model.addAttribute("uid", uid);
		command = new BDeleteCommand();
		command.execute(model);
		return "board/deleteOk";
	}

}
