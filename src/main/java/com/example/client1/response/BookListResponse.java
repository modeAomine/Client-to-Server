package com.example.client1.response;

import com.example.client1.Entity.BookEntity;
import javafx.fxml.FXML;
import lombok.RequiredArgsConstructor;
import okhttp3.*;

import java.util.List;

import com.example.client1.Utils.HTTPUtils;

import static com.example.client1.controllers.MainController.booksData;

@RequiredArgsConstructor
public class BookListResponse extends BaseResponse {
    public List<BookEntity> data;

    public BookListResponse(List<BookEntity> data) {
        super(true, "Список книг");
        this.data = data;
    }

}
