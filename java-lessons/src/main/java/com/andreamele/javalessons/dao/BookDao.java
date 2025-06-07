package com.andreamele.javalessons.dao;

import com.andreamele.javalessons.entity.BookEntity;

import java.util.List;

public interface BookDao {

    void insert (BookEntity book);
    void update (BookEntity book);
    void delete (Long bookId);
    BookEntity getByBookId (String isbn);
    List<BookEntity> getAll();
}
