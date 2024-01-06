package com.d2holygrailbe.d2holygrail.controller;

import com.d2holygrailbe.d2holygrail.entity.Item1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.2/")
public interface PublicApi {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/public/api/getdb",
            produces = {"application/json"}
    )
    ResponseEntity<List<Item1>> publicApiGetItemData();
}
