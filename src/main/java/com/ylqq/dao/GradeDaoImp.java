package com.ylqq.dao;

import com.ylqq.main.Grade;
import com.ylqq.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class GradeDaoImp implements GradeDao{

    //整个template就不需要搞result这些鬼也了
    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Grade> findAll() {
        String sql="select S.sname AS sname,C.cname AS cname,G.score AS score" +
                " from student AS S join grade g on S.sid = g.sid JOIN course c on g.cid = c.cid";

        return template.query(sql,new BeanPropertyRowMapper<Grade>(Grade.class));
    }
}
