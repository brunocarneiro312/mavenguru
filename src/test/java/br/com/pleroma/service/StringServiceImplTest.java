package br.com.pleroma.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringServiceImplTest {

    private StringServiceImpl stringService = new StringServiceImpl();

    @Test
    public void getName() {
        Assert.assertEquals("Bruno", stringService.getName());
    }
}