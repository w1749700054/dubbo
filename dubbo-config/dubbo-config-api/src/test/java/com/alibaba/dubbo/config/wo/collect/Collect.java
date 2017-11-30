package com.alibaba.dubbo.config.wo.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collect {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        Collection collection= Collections.unmodifiableCollection(list);
//        list.add("c");
        collection.add("c");
        System.out.println(list);
    }
}
