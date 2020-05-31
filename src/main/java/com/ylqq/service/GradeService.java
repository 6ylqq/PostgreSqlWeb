package com.ylqq.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ylqq.main.Grade;

import java.util.List;

public interface GradeService {
    public String findAllGrade() throws JsonProcessingException;
}
