package cn.coschool.servlet.service.impl;

import cn.coschool.servlet.dao.HelloDAO;
import cn.coschool.servlet.po.HelloPO;
import cn.coschool.servlet.service.HelloService;

import java.util.List;

/**
 * @author He Gang coschool@yeah.net
 * @version V1.0.0.0
 * @createTime：2018-04-13 22:00:00
 * @description
 */
public class HelloServiceImpl implements HelloService{
    private HelloDAO helloDAO = new HelloDAO();
    @Override
    public int insert() {
        return helloDAO.insert();
    }

    @Override
    public int delete(int id) {
        return helloDAO.delete(id);
    }

    @Override
    public int updates() {
        return helloDAO.update();
    }

    @Override
    public List<HelloPO> findAll() {
        return helloDAO.findAll();
    }
}
