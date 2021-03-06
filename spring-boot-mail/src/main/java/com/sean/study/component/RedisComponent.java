package com.sean.study.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**     
  * redis组件
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/25 19:39
  * @version:  1.0 2018/3/25
* */
@Component
public class RedisComponent {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void set(String key, String value) {
        ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
        if (!this.stringRedisTemplate.hasKey(key)) {
            ops.set(key, value);
            System.out.println("set key success");
        } else {
            // 存在则打印之前的value值
            System.out.println("this key = " + ops.get(key));
        }
    }

    public String get(String key) {
        return this.stringRedisTemplate.opsForValue().get(key);
    }

    public void del(String key) {
        this.stringRedisTemplate.delete(key);
    }

}
