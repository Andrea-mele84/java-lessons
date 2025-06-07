package com.andreamele.javalessons;

import com.andreamele.javalessons.dao.BookDao;
import com.andreamele.javalessons.dao.impl.InMemoryBookDao;
import com.andreamele.javalessons.entity.BookEntity;

public class MainBookEntity {
    public static void main(String[] args) {

        BookDao bookDao = new InMemoryBookDao();
        BookEntity b1 = new BookEntity();
        b1.setTitle("Pirati");
        b1.setIsbn("978-3-16-148410-0");
        b1.setAuthor("Giuann");

        BookEntity b2 = new BookEntity();
        b2.setTitle("Fregne");
        b2.setIsbn("978-3-16-148410-1");
        b2.setAuthor("Vecienz");

        bookDao.insert(b1);
        bookDao.insert(b2);

        bookDao.insert(b1);

    }
}
