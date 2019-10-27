# CCS2.0
新高考走班排课系统2.0

开发系统环境：
<pre>
  jdk:1.8
  tomcat:7
  springboot:2.1.0
  mysql:5.7，远程数据库地址lede.dalaomai.cn，端口5006
  redis:5.0.6
</pre>

目录结构说明：
<pre>
com.goclass-parent</br>
  -com.goclass-mapper   #orm映射文件</br>
  -com.goclass-pojo     #orm映射实体</br>
  -com.goclass-security #权限控制</br>
  -com.goclass-rpc      #rpc调用</br>
  -com.goclass-common   #公共模块</br>
      -config             #配置</br>
      -utils              #工具</br>
  -com.goclass-web      #WebService</br>
    #main/java目录下</br>
    -com.web</br>
      -GoClassApp.java  #App启动类</br> 
    -com.web.model      #WebService模块</br>
      -business           #业务</br>
        -service            #服务接口层</br>
        -controller         #请求接收层</br>
      -global             #全局配置</br>
    ----------------------------------------------
    #main/resources目录下</br>
    -application.yml    #配置文件</br>
    ----------------------------------------------
    -pom.xml            #依赖</br>
</pre>
