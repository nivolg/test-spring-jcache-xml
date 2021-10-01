import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Nikolay Golubev
 */
public class Starter {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"app-context.xml"}, false);
        context.setAllowBeanDefinitionOverriding(false);
        context.refresh();
    }
}
