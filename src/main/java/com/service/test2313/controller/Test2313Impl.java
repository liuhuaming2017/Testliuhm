package com.service.test2313.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-15T03:25:20.572Z")

@RestSchema(schemaId = "test2313")
@RequestMapping(path = "/test-2-3-13", produces = MediaType.APPLICATION_JSON)
public class Test2313Impl {

    @Autowired
    private Test2313Delegate userTest2313Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTest2313Delegate.helloworld(name);
    }

}
