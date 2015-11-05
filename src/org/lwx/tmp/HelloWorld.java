package org.lwx.tmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hfeng on 2015/11/5.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // 我知道你为啥不喜欢java了. 这个地方确实是非常的复杂
        // java为了做到完全的Object Oriented,所以继承设计的
        // 特别复杂.为了做一个简单的事情牵涉到其他很多父类
        // java的设计目标是让"一帮普通的工程师(因为原来计算机工程师非
        // 常高大上,基本都是大学博士,所以现在大部分人都是普通工程师)"开发出健壮的系统,
        // 所以就写起来很啰嗦. 得承认,这是java的缺点.以后新的替代java
        // 互联网地位的语言,会在这里改善
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Welcome to My First Java Program");

        System.out.println("Please Enter in your first name");
        try {
            String firstName = bufferedReader.readLine();
            System.out.println("Your name is: " + firstName);
        } catch (IOException err) {
            System.out.println("Error reading line");
        }
    }
}
