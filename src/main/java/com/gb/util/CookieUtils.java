package com.gb.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieUtils {

    public  static String getCookie(HttpServletRequest request){



        String value="";
        String cookie=request.getHeader("cookie");
        Cookie[] cookies =request.getCookies();
        //Cookie cookie ;//设置一个为null的cookie
        if(cookies.length>0){

            for(int i = 0; i < cookies.length; i++){
                Cookie  a = cookies[i];
                if(a.getName()!=null&&a.getName().length()>0){
                    if (a.getName().equals("lname")) {
                        value = a.getValue();
                        break;
                    }
                }
            }

        }
        else{
            System.out.println("cookies.length为空");
        }
         return value;

    }



}
