import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lyf
 * @description nacos注册中心启动类
 * @date 2020-01-13 17:12
 */
@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class RegistryApplication {

    //@Value("${user.name}")
    //private static String userName;
    //@Value("${user.age}")
    //private static int age;

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(RegistryApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String userAge = applicationContext.getEnvironment().getProperty("user.age");
        System.out.println(userName + ":" + userAge);
    }
}
