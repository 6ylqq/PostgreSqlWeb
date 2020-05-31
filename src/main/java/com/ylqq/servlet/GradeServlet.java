package com.ylqq.servlet;

import com.ylqq.service.GradeService;
import com.ylqq.service.GradeServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/gradeservlet")
public class GradeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //调一下Service
        GradeService gradeService=new GradeServiceImp();
        String json=gradeService.findAllGrade();

        //看看去到数据没
        System.out.printf(json);

        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(json);
    }
}
