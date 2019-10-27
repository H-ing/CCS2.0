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
    -com.web</br>
      -GoClassApp.java  #App启动类</br> 
    -com.web.model      #WebService模块</br>
      -business           #业务</br>
        -user               #用户管理</br>
        -timer              #上课时间时段管理</br>
        -course_table       #课表管理</br>
        -classroom          #课室管理</br>
        -cg                 #分班业务</br>
        -ccs                #排课业务</br>
      -global             #全局配置
</pre>
