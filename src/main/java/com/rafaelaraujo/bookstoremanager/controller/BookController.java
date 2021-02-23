package com.rafaelaraujo.bookstoremanager.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @GetMapping
    @ApiOperation(value = "Return an example hello word")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Sucess method return")})
    public String hello() {
        return "Hello Bookstore Manager";
    }
}
