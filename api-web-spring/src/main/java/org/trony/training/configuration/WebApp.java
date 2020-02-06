package org.trony.training.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletRegistration;

public class WebApp extends AbstractAnnotationConfigDispatcherServletInitializer {
    public WebApp() {
        super();
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        //return new Class[0];
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //return new Class[0];
        return new Class<?>[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        //return new String[0];
        return new String[] {"/trony"};
    }

    @Override
    protected void customizeRegistration(final ServletRegistration.Dynamic registration) {
        super.customizeRegistration(registration);
    }


}
