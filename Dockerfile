FROM 100.125.17.64:20202/hwcse/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/test-2-3-13-0.0.1-SNAPSHOT.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]