package com.xiyun.cxn.java.base.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2020/04/13 17:21
 */
public class IOAndNIOTest {


    public static void method2() {
        InputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream("src/nomal_io.txt"));
            byte[] buf = new byte[1024];
            int bytesRead = in.read(buf);
            while (bytesRead != -1) {
                for (int i = 0; i < bytesRead; i++) {
                    System.out.print((char) buf[i]);
                }
                bytesRead = in.read(buf);
            }
        } catch
        (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch
            (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void method1() {
        RandomAccessFile aFile = null;
        try {

            aFile = new RandomAccessFile("src/nio.txt", "rw");
            FileChannel fileChannel = aFile.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(1024);
            int bytesRead = fileChannel.read(buf);
            System.out.println(bytesRead);
            while (bytesRead != -1) {
                buf.flip();
                while (buf.hasRemaining()) {
                    System.out.print((char) buf.get());
                }
                buf.compact();
                bytesRead = fileChannel.read(buf);
            }

        } catch
        (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (aFile != null) {
                    aFile.close();
                }
            } catch
            (IOException e) {
                e.printStackTrace();
            }

        }

    }



//    public static void method3() {
//        try (InputStream in = new BufferedInputStream(new FileInputStream("src/nomal_io.txt"))){
//            byte[] buf = new byte[1024];
//            int bytesRead = in.read(buf);
//            while (bytesRead != -1) {
//                for (int i = 0; i < bytesRead; i++) {
//                    System.out.print((char) buf[i]);
//                }
//                bytesRead = in.read(buf);
//            }
//        } catch
//        (IOException e) {
//            e.printStackTrace();
//        }
//    }


}
