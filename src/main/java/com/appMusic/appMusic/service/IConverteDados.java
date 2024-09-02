package com.appMusic.appMusic.service;

public interface IConverteDados {

    <T> T converteDados(String json, Class<T> classe);
}
