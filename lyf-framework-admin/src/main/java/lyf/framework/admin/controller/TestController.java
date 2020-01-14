package lyf.framework.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lyf
 * @description 测试nacos注册服务
 * @date 2020-01-14 11:26
 */
@RestController
@RequestMapping("admin/test")
public class TestController {
    private final RestTemplate restTemplate;

    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/echo/{arg}")
    public String echo(@PathVariable String arg) {
        return restTemplate.getForObject("http://nacos-registry/registry/echo/" + arg, String.class );
    }

}
