package com.atguigu.demo;

import org.springframework.util.DigestUtils;
import sun.security.provider.MD5;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EncodeTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //long time = System.currentTimeMillis();
        //String format1 = sdf.format(time);
        //System.out.println(format1);

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dataStr = sdf.format(date);
        System.out.println(dataStr);

        String timestamp = URLEncoder.encode(dataStr, "utf8");
        System.out.println(timestamp);

        String user_id = "nbforwarder";
        String pwd = "2dde55e422d2461b913f510e95da73b3";

        String data = user_id + pwd + timestamp;
        String sign = StringUtil.encode(data);
        String format = "json";
        String method = "cargoedi.demessage.msgrec.post";
        String parameters = "?user_id=" +user_id +"&format="+format+"&timestamp=" + timestamp +"&sign=" +sign
                +"&method=" + method;
        System.out.println(parameters);
    }
}
