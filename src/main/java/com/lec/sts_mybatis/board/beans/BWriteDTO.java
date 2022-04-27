package com.lec.sts_mybatis.board.beans;

import java.sql.Timestamp;

public class BWriteDTO {
	
	public int uid;			// wr_uid
	public String subject;	// wr_subject	
	public String content;	// wr_content
	public String name;		// wr_name
	public int viewCnt;		// wr_viewcnt
	public Timestamp regDate; // wr_regdate
	
	public BWriteDTO() {}

	public BWriteDTO(int uid, String subject, String content, String name, int viewCnt, Timestamp regDate) {
		super();
		this.uid = uid;
		this.subject = subject;
		this.content = content;
		this.name = name;
		this.viewCnt = viewCnt;
		this.regDate = regDate;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	
	

}
