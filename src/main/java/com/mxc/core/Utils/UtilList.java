package com.mxc.core.Utils;


import java.util.ArrayList;
import java.util.List;

public class UtilList {

    /**
     * 如果为null则新建一个List
     * @param list
     * @return
     */
    public static List nullToNewList(List list) {
        return list == null ? new ArrayList() : list;
    }
}
