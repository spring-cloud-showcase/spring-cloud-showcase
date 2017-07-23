mkdir 'logs'

echo "start eureka servers..."
mvn spring-boot:run -f eureka-server -Dspring.profiles.active=eureka1 >>./logs/eureka1.log 2>&1 &
mvn spring-boot:run -f eureka-server -Dspring.profiles.active=eureka2 >>./logs/eureka2.log 2>&1 &
mvn spring-boot:run -f eureka-server -Dspring.profiles.active=eureka3 >>./logs/eureka3.log 2>&1 &

echo "start api gateway..."
mvn spring-boot:run -f api-gateway       >>./logs/api-gateway.log 2>&1 &

echo "start config server..."
mvn spring-boot:run -f config-server     >>./logs/config-server.log 2>&1 &

echo "start zipkin server..."
mvn spring-boot:run -f zipkin-server     >>./logs/zipkin-server.log 2>&1 &

sleep 30
echo "start commodity service..."
mvn spring-boot:run -f commodity-service >>./logs/commodity-service.log 2>&1 &