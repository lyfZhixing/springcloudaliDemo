package lyf.framework.admin.controller;

import lombok.AllArgsConstructor;
import lyf.framework.admin.service.RegistryService;
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
@AllArgsConstructor
public class TestController {

    private RegistryService registryService;

    private final RestTemplate restTemplate;

    @GetMapping("/echo/{arg}")
    public String echo(@PathVariable String arg) {
        // rest调用
        //return restTemplate.getForObject("http://nacos-registry/registry/echo/" + arg, String.class );
        // 声明式远程调用
        return registryService.feignTest(arg);
    }

}
