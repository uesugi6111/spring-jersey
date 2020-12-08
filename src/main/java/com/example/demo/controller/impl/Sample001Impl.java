package com.example.demo.controller.impl;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

import com.example.demo.controller.Sample001;
import com.example.demo.controller.form.Sample001Form;

import org.springframework.stereotype.Component;

@Component
public class Sample001Impl implements Sample001 {

    @Override
    public Response getsample001(Sample001Form form) {
        Map<String, Object> map = new HashMap<>();
        map.put("request", form);

        return Response.ok().entity(map).build();

    }

}
