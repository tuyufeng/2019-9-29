package com.bw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * 只能扫描当前包和子包下的文件
 */
@SpringBootApplication

/*@ImportResource("classpath:xml-test.xml")*/
public class Bootstart {
    public static void main(String[] args) {
        SpringApplication.run(Bootstart.class, args);
        System.out.print("启动成功!!!");
    }


    /**
     * 最新的方法springboot中@bean
     *
     * 和  xml-test.xml   +
     *    @Autowired private  Demo  demo;
     *    +  @ImportResource("classpath:xml-test.xml")
     *    一样的效果
     * @return
     */

    /**
     * 使用构造方法注入构造对象的同时，完成依赖关系的建立
     *
     * @return
     */
    @Bean
    public Demo demo() {
         return new Demo();
    }


}
