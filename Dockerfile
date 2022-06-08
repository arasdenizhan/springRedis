FROM redis:7.0.0-alpine
#COPY ./redis.conf /usr/local/etc/redis/redis.conf
#ENTRYPOINT ["redis-server", "/usr/local/etc/redis/redis.conf"]
ENTRYPOINT ["redis-server"]

