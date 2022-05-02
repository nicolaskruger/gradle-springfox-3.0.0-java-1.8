package com.example.oito.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
public class RouteController {
    @GetMapping
    public ResponseEntity get(@RequestBody String name){
        return ResponseEntity.ok().build();
    }
    @PostMapping
    public ResponseEntity post(@RequestBody String name){
        return ResponseEntity.ok().build();
    }
    @PutMapping
    public ResponseEntity put(@RequestBody String name){
        return ResponseEntity.ok().build();
    }
    @PatchMapping
    public ResponseEntity path(@RequestBody String name){
        return ResponseEntity.ok().build();
    }
    @DeleteMapping
    public ResponseEntity delete(@RequestBody String name){
        return ResponseEntity.ok().build();
    }
}
