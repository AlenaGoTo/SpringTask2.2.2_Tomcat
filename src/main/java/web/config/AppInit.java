package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// класс инициализатора конфигурации (из WebConfig) Spring Context
// предоставляет возможность настроить 2 контекста: корневой и сервлета
// ApplicationContext обычно содержит все сервисные и инфрастуктурные бины вашего приложения.
// WebServletApplicationContext обычно содержит контекст относящийся к отдельному DispatcherServlet.
public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Метод, указывающий на класс конфигурации корневого контекста, который будет предоставлен ContextLoaderListener.
    // (null если корневой контекст нежелателен)
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    // Вопрос? Если же у нас только один класс конфигурации, то его нужно передать в метод getRootConfigClasses(),
    // а getServletConfigClasses() должен возвращать null.
    // Добавление конфигурации контекста приложения сервлета, который будет предоставлен DispatcherServlet.
    // в которой инициализируем ViewResolver, для корректного отображения jsp.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }


    /* Данный метод указывает url, на котором будет базироваться приложение */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}