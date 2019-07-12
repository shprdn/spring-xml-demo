package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    //called before destroying all beans
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy()");
    }
    //this is called after properties are set
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet()");
    }
}
