package cn.coschool.servlet.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author He Gang coschool@yeah.net
 * @version V1.0.0.0
 * @createTime：2018-04-13 22:00:00
 * @description
 */
//@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String method = req.getParameter("method");
        if("insert".equals(method)){
            this.insert(req,resp);
        }else if("delete".equals(method)){
            this.delete(req,resp);
        }else if("update".equals(method)){
            this.update(req,resp);
        }else if("findAll".equals(method)){
            this.findAll(req,resp);
        }else{
            throw new RuntimeException("方法"+method+"不存在");
        }
    }

    private void insert(HttpServletRequest req, HttpServletResponse resp){

    }
    private void delete(HttpServletRequest req, HttpServletResponse resp){

    }
    private void update(HttpServletRequest req, HttpServletResponse resp){

    }
    private void findAll(HttpServletRequest req, HttpServletResponse resp){

    }
}