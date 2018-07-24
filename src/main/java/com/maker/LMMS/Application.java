package com.maker.LMMS;

import com.blade.Blade;

/**
 * @author : zimu
 * @Date: 2018/7/24 09:46
 * @description :  程序主入口
 */

public class Application {
    public static void main(String[] args) {
        Blade.me().start(Application.class, args);
    }
}
