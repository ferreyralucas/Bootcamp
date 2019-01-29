package com.Bootcamp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test(){
        ClaseC c=new ClaseC();
        ClaseD d=new ClaseD();

        Assert.assertEquals("Soy la clase C y soy hincha de Boca",c.buenosAires());
        Assert.assertEquals("Soy la clase D y soy hincha de Belgrano",d.cordoba());

    }

}