# DNSQueenExample
DNSQueen项目的使用案例


### Document


#### 开启Queen服务

java -jar ./target/DNSQueenExample-1.0-SNAPSHOT.jar useQueen

#### 开启测试Socket Server（端口为9999，您可以自己变更）

java -jar ./target/DNSQueenExample-1.0-SNAPSHOT.jar useServer 9999

#### 开启socket客户端

java -jar ./target/DNSQueenExample-1.0-SNAPSHOT.jar useClient 127.0.0.1 9999