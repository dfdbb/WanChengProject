package com.example.wanchengdemo;

import com.example.wanchengdemo.commom.IdGetSnowflake;
import org.junit.Test;

public class snowTest {

    @Test
    public static void main(String[] args) {
        int i = 0;
        IdGetSnowflake idGetSnowflake = new IdGetSnowflake();
        while (i<20){


            System.out.println(idGetSnowflake.snowflakeId());
            i++;
        }
    }
}
