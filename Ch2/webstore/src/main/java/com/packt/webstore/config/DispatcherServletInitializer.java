package com.packt.webstore.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RootApplicationContextConfig.class };
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {
                WebApplicationContextConfig.class
        };
    }

    protected String[] getServletMappings() {
        return new String[] {
                "/"
        };
    }
}
