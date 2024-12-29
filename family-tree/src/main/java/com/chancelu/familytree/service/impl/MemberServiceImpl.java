package com.chancelu.familytree.service.impl;

import com.chancelu.familytree.dao.MemberDao;
import com.chancelu.familytree.model.Member;
import com.chancelu.familytree.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public Member getMemberById(Integer memberId) {
        return memberDao.getMemberById(memberId);
    }
}
