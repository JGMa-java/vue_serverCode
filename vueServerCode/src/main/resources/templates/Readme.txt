这个文件夹相当于Tomcat下的WEB-INF文件夹，是受保护的，
如果在此文件夹下添加一个hello.html文件，我们通过http://localhost:8080/hello.html是访问不到的，
我们只能通过控制器内部转发才能跳转到此页面，
当然，我们也可以在resources文件夹下创建一个public文件夹，将不需要受保护的静态页面放进去
