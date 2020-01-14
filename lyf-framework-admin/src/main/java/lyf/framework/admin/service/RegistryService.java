package lyf.framework.admin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description Feign测试
 * @author lyf
 * @date 2020-1-14 14:44
 */
@FeignClient(name = "nacos-registry")
public interface RegistryService {
    @GetMapping("registry/echo/{arg}")
    String feignTest(@PathVariable("arg") String arg);
}
