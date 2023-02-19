package org.IODecorator;

import java.io.*;

public class LowerCaseInputStream extends FileInputStream {
    public LowerCaseInputStream(File file) throws FileNotFoundException {
        super(file);
    }

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\work\\DesignPattern\\Decorator\\src\\main\\java\\org\\IODecorator\\test");
        InputStream lower = new LowerCaseInputStream(file);
        lower = new ConvertInput(lower);
        System.out.println("finish");
        System.out.println(lower.readAllBytes());
    }
}
