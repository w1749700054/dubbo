package com.alibaba.dubbo.common.wo.ClassTest;

import com.alibaba.dubbo.common.Node;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.Version;

import java.lang.reflect.Array;
import java.lang.reflect.Modifier;

public class GetNameTest {
    public static void main(String[] args) throws NoSuchMethodException {
        int []a={1,2,3};
        Object obj=Array.newInstance(int.class,1);
        Class clazz=obj.getClass();
        Object obj2=Array.newInstance( int.class,3);
        for (int i=0;i<3;i++){
            Array.set(obj2,i,i);
        }
        int []b= (int[]) obj2;
        for(int i=0;i<b.length;i++){
            System.out.println(i);
        }
        System.out.println(obj2);
        System.out.println(String.class.getName());
        System.out.println(String.class.getPackage().getName());
        System.out.println(Modifier.isPublic(Student.class.getModifiers()));
        System.out.println(Student.class.getMethod("getName",null).getDeclaringClass());
    }
}
