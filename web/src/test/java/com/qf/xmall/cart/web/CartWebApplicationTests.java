package com.qf.bigdata.view.web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class viewWebApplicationTests {

    @Test
    void contextLoads() {
        public class Bground extends Thread{
            public static void main(String argv[]){
                Bground b = new Bground();
                b.run();
            }
            public void start(){
                for(int i=0;i<10;i++){
                    System.out.println("Value of i = "+i);
                }
            }
        }
    }

}
