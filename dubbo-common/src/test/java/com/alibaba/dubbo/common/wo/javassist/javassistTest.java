package com.alibaba.dubbo.common.wo.javassist;

import javassist.*;

public class javassistTest {
    public static void main(String[] args) throws NotFoundException, CannotCompileException, IllegalAccessException, InstantiationException {
        ClassPool pool=ClassPool.getDefault();
        CtClass pt=pool.makeClass("astl",pool.get("com.alibaba.dubbo.common.wo.javassist.User"));
        CtConstructor constructor=new CtConstructor(null,pt);
        constructor.setBody("{}");
        pt.addConstructor(constructor);
        CtMethod method1=new CtMethod(pool.get("java.lang.String"),"getName",null,pt);
        method1.setBody("{return \"你好\";}");
        pt.addMethod(method1);
        CtMethod method2=new CtMethod(CtClass.voidType,"setName",new CtClass[]{pool.get("java.lang.String")},pt);
        method2.setBody("{}");
        pt.addMethod(method2);
        CtMethod method3=new CtMethod(pool.get("java.lang.String"),"sayHello",new CtClass[]{pool.get("java.lang.String")},pt );
        method3.setBody("{return $1;}");
        pt.addMethod(method3);
        Class<?> clazz=pt.toClass();
        User user= (com.alibaba.dubbo.common.wo.javassist.User) clazz.newInstance();
        System.out.println(user.getName());
    }
}
