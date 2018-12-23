package br.com.pleroma;

import org.apache.commons.lang3.StringUtils;

public class HelloWorld
{
    public static void main(String[] args)
    {
        String helloString = "hello world";
        System.out.println(helloString);
        System.out.println(StringUtils.capitalize(helloString));
    }
}
