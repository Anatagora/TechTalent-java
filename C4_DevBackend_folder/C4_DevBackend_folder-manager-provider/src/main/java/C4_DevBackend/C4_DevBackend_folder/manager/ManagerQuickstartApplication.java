package C4_DevBackend.C4_DevBackend_folder.manager;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : zhangqian9158@gmail.com
 */
@SpringBootApplication
@EnableDubbo
public class ManagerQuickstartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerQuickstartApplication.class,args);
    }
}
