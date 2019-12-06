package com.dsmanioto.proxy.image.image;

import org.junit.jupiter.api.Test;

public class ProxyImageTest {

    @Test
    public void test() {
        Image image = new ProxyImage("teste.jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}
