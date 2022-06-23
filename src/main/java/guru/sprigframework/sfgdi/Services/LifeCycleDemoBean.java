package guru.sprigframework.sfgdi.Services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean(){
        System.out.println("0 - I'm in constructor /// public LifeCycleDemoBean()");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("2 - Bean Factory has been set /// public void setBeanFactory(BeanFactory beanFactory) throws BeansException");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("1 - My bean name is: "+ s+" ///  public void setBeanName(String s)");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("9 - The Lifecycle bean has been terminated /// public void destroy() throws Exception");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6 - The Lifecycle bean has it's property set /// public void afterPropertiesSet() throws Exception ");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("3 - Application context has been set /// public void setApplicationContext(ApplicationContext applicationContext) throws BeansException");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("5 - The Post Construct annotated method has been called /// public void postConstruct(){");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("8 - The Predestroy annotated method has been called /// public void preDestroy()");
    }

    public void beforeInit(){
        System.out.println("4 - Before Init - Called by Bean Post Processor /// public void beforeInit()");
    }

    public void afterInit(){
        System.out.println("7 - After init called by Bean Post Processor /// public void afterInit()");
    }
}
