package com.ramostear.stereotype.annotation.repository;

import com.ramostear.stereotype.annotation.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @ClassName BookRepository
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/30 0030 6:31
 * @Version since UnaBoot-1.0
 **/
public interface BookRepository extends JpaRepository<Book,Integer> {
}
