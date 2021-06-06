package com.example.assignmentiasf.util;

public class StatusToStringUtil {
    public static String getStatusString (int status){
        return status == 1 ? "Đang sử dụng" : (status == 0 ? "Đang thi công" : "Đang tu sửa");
    }
}
