package useutils;

import props.User;

public class Util {
    
    public static User us = new User();

    public String md5Generator( String password ) {
        String st = password;
        for (int i = 0; i < 3; i++) {
            st = MD5(st);
        }
        return st;
    }
    
    
    public String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }
    
    

}
