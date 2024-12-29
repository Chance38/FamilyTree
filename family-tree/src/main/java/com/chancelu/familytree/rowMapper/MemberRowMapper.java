package com.chancelu.familytree.rowMapper;

import com.chancelu.familytree.model.Member;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberRowMapper implements RowMapper<Member> {

    @Override
    public Member mapRow(ResultSet resultSet, int i) throws SQLException {
        Member member = new Member();

        member.setMemberId(resultSet.getInt("member_id"));
        member.setMemberName(resultSet.getString("member_name"));
        member.setMemberPhone(resultSet.getString("member_phone"));
        member.setJob(resultSet.getString("job"));
        member.setImageUrl(resultSet.getString("image_url"));
        member.setBirthday(resultSet.getDate("birth_date"));

        return member;
    }
}
