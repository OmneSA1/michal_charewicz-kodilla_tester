package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

@ExtendWith(MockitoExtension.class)
public class BookControllerRestAssuredTest {

    @Mock
    private BookService bookService;

    @BeforeEach
    void setUp() {
        RestAssuredMockMvc.standaloneSetup(new BookController(bookService));
    }

    @Test
    void shouldAddBook() {

        BookDto bookDto = new BookDto("Updated title", "Updated author");
        Mockito.doNothing().when(bookService).addBook(Mockito.any(BookDto.class));

        given()
                .contentType(ContentType.JSON)
                .body(bookDto)
                .when()
                .post("/books")
                .then()
                .statusCode(200);
        Mockito.verify(bookService).addBook(Mockito.any(BookDto.class));
    }
}
