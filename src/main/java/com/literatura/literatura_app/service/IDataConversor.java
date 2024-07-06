package com.literatura.literatura_app.service;

public interface IDataConversor {
    <T> T convertData(String json, Class<T> clase);
}
