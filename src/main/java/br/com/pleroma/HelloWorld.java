package br.com.pleroma;

import br.com.pleroma.service.StringServiceImpl;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld
{
    private StringServiceImpl stringService;

    public HelloWorld()
    {
        stringService = new StringServiceImpl();
    }

    public static void main(String[] args)
    {
        String helloString = "hello world";
        System.out.println(helloString);
        System.out.println(StringUtils.capitalize(helloString));
    }
}
