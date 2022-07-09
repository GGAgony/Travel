package com.gg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: {LZG}
 * @ClassName: TravelApplication
 * @Description: TODO
 * @Date: 2022/7/8 10:28
 **/

@SpringBootApplication
@MapperScan("com.gg.mapper")
public class TravelApplication {
    public static void main(String[] args) {
        SpringApplication.run(TravelApplication.class,args);
    }
}
