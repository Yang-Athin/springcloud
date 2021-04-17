package com.yang.feign.impl;

import com.yang.entity.Student;
import com.yang.feign.FeignProviderClient;
import feign.Feign;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}
