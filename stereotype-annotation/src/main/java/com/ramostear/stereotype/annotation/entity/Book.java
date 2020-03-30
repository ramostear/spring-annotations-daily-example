package com.ramostear.stereotype.annotation.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName Book
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/30 0030 6:27
 * @Version since UnaBoot-1.0
 **/
@Entity
@Table(name = "t_book")
@Getter
@Setter
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name",columnDefinition = "varchar(128) not null")
    private String name;

    @Column(name = "author",columnDefinition = "varchar(64) not null")
    private String author;

    @Column(name = "summary",columnDefinition = "varchar(255) default ''")
    private String summary;
}
