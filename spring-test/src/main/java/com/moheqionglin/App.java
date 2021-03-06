package com.moheqionglin;

import com.moheqionglin.simpleDemo.Config;
import com.moheqionglin.simpleDemo.TestBean;
import com.moheqionglin.simpleDemo.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {

//https://www.logicbig.com/tutorials/spring-framework/spring-core/bean-definition.html
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        TestBean tb = (TestBean) applicationContext.getBean("tBean");
        System.out.println(tb);
        String names[] = applicationContext.getBeanNamesForType(TestBean.class);
        for(String name : names){
            System.out.println(name);
        }

        TestDao td = (TestDao) applicationContext.getBean("testDao");
        System.out.println(td);


    }
}
