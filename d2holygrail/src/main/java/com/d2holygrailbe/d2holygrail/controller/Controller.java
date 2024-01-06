package com.d2holygrailbe.d2holygrail.controller;

import com.d2holygrailbe.d2holygrail.entity.Item1;
import com.d2holygrailbe.d2holygrail.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller implements PublicApi {

    Repository repository;

    @Autowired
    public Controller(Repository repository) {
    this.repository = repository;
    }


    public ResponseEntity<List<Item1>> publicApiGetItemData() {
        return ResponseEntity.ok(this.repository.findAll());
    }
}
