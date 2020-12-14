package com.mxc.core.constant;

import java.util.HashMap;
import java.util.Map;

public class FileConstant {
    //文件
    public static final String[] imageFileType = new String[]{".gif", ".png", ".jpg", ".jpeg", ".bmp"};

    public static void main(String[] args) {
            Map<String, String> map = new HashMap<String, String>(64);
            map.put("alderney", "未实现服务");
            map.put("luminance", "未实现服务");
            map.put("chorology", "未实现服务");
            map.put("carline", "未实现服务");
            map.put("fluorosis", "未实现服务");
            map.put("angora", "未实现服务");
            map.put("insititious", "未实现服务");
            map.put("insincere", "已实现服务");

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 100000000; i++) {
                map.get("insincere");
            }
            System.out.println("耗时(initialCapacity)：" + (System.currentTimeMillis() - startTime));
    }
}
