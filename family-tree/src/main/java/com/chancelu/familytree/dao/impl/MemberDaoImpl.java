package com.chancelu.familytree.dao.impl;

import com.chancelu.familytree.dao.MemberDao;
import com.chancelu.familytree.model.Member;
import com.chancelu.familytree.rowMapper.MemberRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MemberDaoImpl implements MemberDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Member getMemberById(Integer memberId) {

        String sql = "SELECT member_id, member_name, member_phone, " +
                "job, image_url, birth_date FROM memberInfo WHERE member_id = :memberId";

        Map<String, Object> map = new HashMap<>();
        map.put("memberId", memberId);

        List<Member> memberList = namedParameterJdbcTemplate.query(sql, map, new MemberRowMapper());

        if (memberList.size() > 0) {
            return memberList.get(0);
        } else {
            return null;
        }
    }
}
