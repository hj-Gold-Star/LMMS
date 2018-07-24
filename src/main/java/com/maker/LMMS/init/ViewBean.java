package com.maker.LMMS.init;

import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import com.blade.mvc.view.template.JetbrickTemplateEngine;

/**
 * @author : zimu
 * @Date: 2018/7/24 10:33
 * @description : 初始化
 */
@Bean
public class ViewBean implements BeanProcessor {
    @Override
    public void processor(Blade blade) {
        JetbrickTemplateEngine template = new JetbrickTemplateEngine();  //创建模板引擎实例
        blade.templateEngine(template);
    }
}
