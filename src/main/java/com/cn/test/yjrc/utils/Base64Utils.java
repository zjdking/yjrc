package com.cn.test.yjrc.utils;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zjdking
 * 2020/6/3 0003.
 * @version 1.0
 */
public class Base64Utils {
    public static String ImageToBase64(String path){
        InputStream in = null;
        byte[] data = null;
        try{
            Resource resource = new ClassPathResource(path);
            File file = resource.getFile();
            in = new FileInputStream(file.getPath());
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BASE64Encoder decoder = new BASE64Encoder();
        return decoder.encode(data);
    }


}
