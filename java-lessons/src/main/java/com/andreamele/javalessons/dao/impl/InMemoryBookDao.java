package com.andreamele.javalessons.dao.impl;

import com.andreamele.javalessons.dao.BookDao;
import com.andreamele.javalessons.entity.BookEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryBookDao implements BookDao {

    private static final Logger log = LoggerFactory.getLogger(InMemoryBookDao.class);

    private ConcurrentHashMap<String, BookEntity> db = new ConcurrentHashMap<>();

    @Override
    public void insert(BookEntity book) {
        if (!db.containsKey(book.getIsbn())) {
            db.put(book.getIsbn(),book );
            log.info("Libro inserito: " + book.getIsbn());
        }
        else {
            log.error("Libro con chiave " + book.getIsbn() + " già esiste");
        }

    }

    @Override
    public void update(BookEntity book) {

    }

    @Override
    public void delete(Long bookId) {

    }

    @Override
    public BookEntity getByBookId(String isbn) {
        return null;
    }

    @Override
    public List<BookEntity> getAll() {
        return List.of();
    }
}
