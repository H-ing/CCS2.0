package com.web.model.global.utils;

import java.io.*;

public class BlobUtil {
    /**
     * 把object对象序列化为二进制字节数组
     * @param object
     * @return
     */
    public static byte[] setObject(Object object){
        ByteArrayOutputStream baos = null;
        ObjectOutputStream out = null;
        try{
            baos = new ByteArrayOutputStream();
            out = new ObjectOutputStream(baos);
            out.writeObject(object);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(out != null){
                try{
                    out.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(baos != null){
                try{
                    baos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return baos.toByteArray();
    }

    /**
     * 把二进制字节数组反序列化为object对象
     * @param bytes
     * @return
     */
    public static Object getObject(byte[] bytes){
        Object obj = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream in = null;
        try{
            bais = new ByteArrayInputStream(bytes);
            in = new ObjectInputStream(bais);
            obj = in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bais != null) {
                try {
                    bais.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return obj;
    }
}
