package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/5/30
 * @Time 16:32
 */

/**
 * @Component 注解代表当前类是一个bean,可以自定义bean的id也可以直接使用默认（括号中不写字符串）
 */
@Component("du")
public class MessagePrinter {
    final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
