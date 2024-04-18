package org.learning.util;

import org.springframework.stereotype.Component;

@Component
public class CommonUtils {
    public void printKachra() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*****");
        }
    }
}
