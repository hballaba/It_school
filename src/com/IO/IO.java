package com.IO;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;

public class IO {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/hballaba/Desktop/javaSchool/src/com/IO/text.txt");
        if (file.exists()) {
            System.out.println("Absolute path =" + file.getAbsolutePath());
            String parentPath = file.getParent();
            System.out.println("Parent path = " + parentPath);
            System.out.println();
            File listFile = new File(parentPath);

            File[] files = listFile.listFiles();
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
            }

        }
        System.out.println();

        BufferedInputStream stream = new BufferedInputStream(new FileInputStream("/Users/hballaba/Desktop/javaSchool/src/com/IO/text.txt"));
        stream.skip(2);
        System.out.print((char) stream.read());
        System.out.print((char) stream.read());
        System.out.print((char) stream.read());
        System.out.println((char) stream.read());
        stream.close();
        System.out.println();


        String str = "Люблю Java!";
        FileOutputStream fileStream = new FileOutputStream("/Users/hballaba/Desktop/javaSchool/src/com/IO/loveJava.txt");
        fileStream.write(str.getBytes(StandardCharsets.UTF_8));
        fileStream.close();

    }
}
