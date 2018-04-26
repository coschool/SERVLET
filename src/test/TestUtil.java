import cn.coschool.servlet.po.HelloPO;
import cn.coschool.servlet.service.HelloService;
import cn.coschool.servlet.service.impl.HelloServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * @author He Gang coschool@yeah.net
 * @version V1.0.0.0
 * @createTime：
 * @description
 */
public class TestUtil {
    private HelloService helloService = new HelloServiceImpl();
    @Test
    public void testInsert(){
        int ret = helloService.insert();
        System.out.print(ret);
    }
    @Test
    public void testUpdate(){
        int ret = helloService.updates();
        System.out.print(ret);
    }
    @Test
    public void testFindAll(){
        List<HelloPO> ret = helloService.findAll();
        System.out.print(ret.size());
    }
    @Test
    public void testDelete(){
        int ret = helloService.delete(9);
        System.out.print(ret);
    }
}
