<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://java.sun.com/xml/ns/javaee"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://java.sun.com/xml/ns/javaee
          http://java.sun.com/xml/ns/javaee/web-app_3_1.xsd"
           version="3.1">
    <welcome-file-list>
        <welcome-file>index.jsp</welcome-file>
    </welcome-file-list>

    <servlet>
        <servlet-name>weChatServlet</servlet-name>
        <servlet-class>weChatServlet.weChatAccounts</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>weChatServlet</servlet-name>
        <url-pattern>/weChatServlet</url-pattern> <!--url-pattern������servlet-nameһ��-->
    </servlet-mapping>
</web-app>
