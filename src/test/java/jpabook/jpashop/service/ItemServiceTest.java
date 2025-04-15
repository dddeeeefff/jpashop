package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ItemServiceTest {

    @Autowired ItemService itemService;

    @Test
    public void 아이템_등록() throws Exception{
        // given
        Book book = new Book();
        book.addStock(100);
        book.setName("주주서한");

        // when
        itemService.saveItem(book);

        // then
        assertSame(book, itemService.findOne(book.getId()));
    }

}