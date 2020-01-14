package lyf.platform.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyf
 * @description nacos配置中心测试
 * @date 2020-01-14 9:50
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {
    @Value("${user.age:23}")
    private String age;

    @GetMapping("/get")
    public String get() {
        return age;
    }

}
