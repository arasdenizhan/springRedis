package com.denzhn.springredis.repository;

import com.denzhn.springredis.model.Person;
import com.redis.om.spring.repository.RedisDocumentRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRedisRepository extends RedisDocumentRepository<Person,String> {
}
