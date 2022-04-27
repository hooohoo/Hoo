package com.lec.sts_mybatis.board.command;

import org.springframework.ui.Model;

import com.lec.sts_mybatis.board.C;
import com.lec.sts_mybatis.board.beans.BWriteDTO;
import com.lec.sts_mybatis.board.beans.IWriteDAO;

public class BSelectCommand implements BCommand{
	
	@Override
	public void execute(Model model) {
		int uid = (Integer)model.getAttribute("uid");
		
		// mybatis
		IWriteDAO dao = C.sqlSession.getMapper(IWriteDAO.class);
		model.addAttribute("dto", dao.readByUid(uid));
		
	}

}
