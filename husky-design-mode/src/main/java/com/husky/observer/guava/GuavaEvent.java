package com.husky.observer.guava;


/**
 * Created by Liuph on 2019/3/17.
 */
public class GuavaEvent {

   // @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }

}
