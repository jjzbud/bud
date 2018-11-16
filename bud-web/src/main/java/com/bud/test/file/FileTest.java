package com.bud.test.file;

import java.io.File;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-11-05
 */
public class FileTest {

    public static void main(String[] args) {
        File file = new File("D:\\workspace","a.txt");
        if(file.exists()){
            System.out.println(file.getName());
            System.out.println(file.getPath());
            System.out.println(file.isAbsolute());
        }

    }
}
