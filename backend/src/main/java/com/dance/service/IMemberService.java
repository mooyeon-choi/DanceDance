package com.dance.service;

import java.util.List;

import com.dance.dto.Avatar;
import com.dance.dto.Member;

public interface IMemberService {

	Member login(Member login);

	int emailcheck(String email);

	void signup(Member member);

	int nicknamecheck(String nickname);

	void updateMyAvatar(Member member);

	List<Avatar> getAvatarList();

}
