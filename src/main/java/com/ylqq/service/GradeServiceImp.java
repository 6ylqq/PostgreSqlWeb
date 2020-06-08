package com.ylqq.service;

import com.ylqq.dao.GradeDao;
import com.ylqq.main.Grade;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ylqq.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class GradeServiceImp implements GradeService{
    @Override
    public String findAllGrade() throws JsonProcessingException {
        SqlSession sqlSession = null;
        sqlSession = SqlSessionFactoryUtils.openSqlSession();
        GradeDao gradeDao = sqlSession.getMapper(GradeDao.class);
        List<Grade> gradeList = gradeDao.findAll();
        System.out.println(gradeList);
        //调用mybatis获取所需数据list
        ObjectMapper mapper = new ObjectMapper();
        String grade_json = mapper.writeValueAsString(gradeDao.findAll());
        return grade_json;
    }
}
