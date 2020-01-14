package lyf.platform.registry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyf
 * @description nacos注册中心测试
 * @date 2020-01-14 11:00
 */
@RestController
@RequestMapping("registry")
public class RegistryController {

    @GetMapping("/echo/{arg}")
    public String echo(@PathVariable String arg) {
        return "hello Nacos Discovery" + arg;
    }
}
