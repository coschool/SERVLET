package cn.coschool.servlet.service;

import cn.coschool.servlet.po.HelloPO;

import java.util.List;

/**
 * @author He Gang coschool@yeah.net
 * @version V1.0.0.0
 * @createTime：2018-04-13 22:00:00
 * @description
 */
public interface HelloService {
    int insert();
    int delete(int id);
    int updates();
    List<HelloPO> findAll();
}
