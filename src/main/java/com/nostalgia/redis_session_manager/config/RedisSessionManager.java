package com.nostalgia.redis_session_manager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession  //将应用中的session交给redis管理
public class RedisSessionManager {

}
