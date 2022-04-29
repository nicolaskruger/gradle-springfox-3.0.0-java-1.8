package com.example.oito.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
public class RouteController {
    @GetMapping
    public ResponseEntity get(){
        return ResponseEntity.ok().build();
    }
    @PostMapping
    public ResponseEntity post(){
        return ResponseEntity.ok().build();
    }
    @PutMapping
    public ResponseEntity put(){
        return ResponseEntity.ok().build();
    }
    @PatchMapping
    public ResponseEntity path(){
        return ResponseEntity.ok().build();
    }
    @DeleteMapping
    public ResponseEntity delete(){
        return ResponseEntity.ok().build();
    }
}
