登录用户 admin/123456


//获取授权码 
http://localhost:9001/oauth/authorize?response_type=code&client_id=client1&redirect_uri=https://www.baidu.com/&scope=app


//获取token
curl --user client1:123456 -X POST -d "grant_type=authorization_code&scope=app&redirect_uri=https://www.baidu.com/&code=xodoiz" http://127.0.0.1:9001/oauth/token
