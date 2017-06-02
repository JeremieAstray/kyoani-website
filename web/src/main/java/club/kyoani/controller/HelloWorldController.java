package club.kyoani.controller;

import club.kyoani.service.BlogService;
import club.kyoani.service.UserSerivce;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author JeremieAstray 2017/6/2.
 */
@Controller("/")
public class HelloWorldController {

    @Autowired
    private UserSerivce userSerivce;
    @Autowired
    private BlogService blogService;

    @RequestMapping("test")
    @ResponseBody
    public String test() {
        Assert.assertNotNull(userSerivce);
        Assert.assertNotNull(blogService);
        return "hello world! 搞事情";
    }
}
