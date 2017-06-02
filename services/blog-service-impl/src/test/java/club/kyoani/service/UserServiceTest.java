package club.kyoani.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author JeremieAstray 2017/6/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml") //加载配置文件
public class UserServiceTest {
    @Autowired
    private BlogService blogService;

    @Test
    public void testMethod() {
        Assert.assertNotNull(this.blogService);
        System.out.println("this is a test");
    }
}