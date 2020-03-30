package com.ramostear.stereotype.annotation.service;

import com.ramostear.stereotype.annotation.entity.Book;
import com.ramostear.stereotype.annotation.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName BookServiceImpl
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/30 0030 6:58
 * @Version since UnaBoot-1.0
 **/
@Service("bookService")
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    @Transactional
    public Book add(Book book) {
        return bookRepository.save(book);
    }

    @Override
    @Transactional
    public boolean delete(Integer id) {
        Book book = this.findById(id);
        if(book != null){
            bookRepository.delete(book);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Book findById(Integer id) {
        return bookRepository.getOne(id);
    }

    @Override
    @Transactional
    public Book update(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
