# WebProjectDemo
Intellij-IDEA-maven+springMVC+mybatis整合DEMO

## 前言 ##

1.实现了多数据源配置。
2.实现动态切换数据源。
   过程：1).配置applicationContext-dao-multiple.xml文件
         2).查看MultipleDataSourceAspectAdvice.java   MultipleDataSource.java   两个文件
         
3.访问
   http://localhost:8080/itemList1.action  访问了DataSource1
   http://localhost:8080/itemList.action   访问了DataSource2
            
         
