package com.ylqq.service;

import com.ylqq.dao.GradeDao;
import com.ylqq.dao.GradeDaoImp;
import com.ylqq.main.Grade;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class GradeServiceImp implements GradeService{
    @Override
    public String findAllGrade() throws JsonProcessingException {
        GradeDao gradeDao=new GradeDaoImp();
        ObjectMapper mapper=new ObjectMapper();
        String grade_json=mapper.writeValueAsString(gradeDao.findAll());
        return grade_json;
    }
}
