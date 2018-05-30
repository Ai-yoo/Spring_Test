package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/5/30
 * @Time 16:34
 */

/**
 * @Configuration 相当于把这个类当作beans，配置spring容器，应用上下文
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            @Override
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

    public static void main(String[] args) {
        System.out.println();
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        //通过bean的id获取bean
        MessagePrinter printer =  (MessagePrinter) context.getBean("du");
        printer.printMessage();

    }
}
