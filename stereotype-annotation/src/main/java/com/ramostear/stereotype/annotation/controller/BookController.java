package com.ramostear.stereotype.annotation.controller;

import com.ramostear.stereotype.annotation.entity.Book;
import com.ramostear.stereotype.annotation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName BookController
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/30 0030 7:07
 * @Version since UnaBoot-1.0
 **/
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<Object> books(){
        return ResponseEntity.ok().body(bookService.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> add(@RequestBody Book book){
        return ResponseEntity.ok().body(bookService.add(book));
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody Book book){
        return ResponseEntity.ok().body(bookService.update(book));
    }

    @DeleteMapping("/{id:\\d+}")
    public ResponseEntity<Object> delete(@PathVariable("id")Integer id){
        if(bookService.delete(id)){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.badRequest().build();
        }
    }

}
