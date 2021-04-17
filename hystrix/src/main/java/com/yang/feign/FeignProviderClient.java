package com.yang.feign;

import com.yang.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

//声明式接口只需要添加注解不需要实现类
/*
  这里value是服务提供者中配置文件中的名称spring name ：provider,
   如果能调通的话走的是value,不能调通的话走的是fallback，FeignError里面的业务，实现熔断机制
 */
@FeignClient(value = "provider")
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
