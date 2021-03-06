package com.dance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dance.dao.MemberDaoImpl;
import com.dance.dto.Avatar;
import com.dance.dto.Member;


@Service
public class MemberServiceImpl implements IMemberService {
	
	@Autowired
	private MemberDaoImpl memberdao;


	@Override
	@Transactional(readOnly=true)
	public Member login(Member login) {
		return memberdao.login(login);
	}


	@Override
	@Transactional(readOnly=true)
	public int emailcheck(String email) {
		return memberdao.emailcheck(email);
	}
	
	
	@Override
	@Transactional(readOnly=true)
	public int nicknamecheck(String nickname) {
		return memberdao.nicknamecheck(nickname);
	}


	@Override
	@Transactional
	public void signup(Member member) {
		memberdao.signup(member);
	}


	@Override
	@Transactional
	public void updateMyAvatar(Member member) {
		memberdao.updateMyAvatar(member);
	}


	@Override
	@Transactional(readOnly=true)
	public List<Avatar> getAvatarList() {
		return memberdao.getAvatarList();
	}


}
