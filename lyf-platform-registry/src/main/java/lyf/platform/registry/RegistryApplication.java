package lyf.platform.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lyf
 * @description nacos注册中心启动类
 * @date 2020-01-13 17:12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistryApplication.class, args);
    }
}
