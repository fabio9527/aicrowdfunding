package com.aicrowdfunding.commonUtil;

public class StringUtil {
    public static boolean isEmpty(String target){
        if(target==null || target==""){
            return true;
        }
        else
            return false;
    }
}
