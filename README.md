# MovieTicket-Back-End-XY

## 项目说明：影院订票系统后端

## 线上demo
http://movie.btorg.org

## API地址
http://localhost:8000/swagger-ui.html

## 线上API地址
http://movie.btorg.org:8080/movieticket-back-end-xy/swagger-ui.html


     
     后端项目地址：https://github.com/MxyEI/movieticket-back-end-xy
     

## 安装运行

- 环境需求

    - Maven 3.5.0

- 本地运行

    ```bash
    $ mvn clean tomcat7:run
    ```

    **提示:** 使用 `-Djava.security.egd=file:/dev/./urandom` 如果运行的很慢的话 ([details](http://nobodyiam.com/2016/06/07/tomcat-startup-slow/))

- 运行测试用例

    ```bash
    $ mvn clean test
    ```

- 创建docker镜像

    ```bash
    $ docker build -t movieticket-back-end-xy .
    ```
- 打包war
    ```bash
    $ mvn package -Dmaven.test.skip=true -Ptest
    ```

## License

See the [LICENSE](./LICENSE) file for license rights and limitations.


