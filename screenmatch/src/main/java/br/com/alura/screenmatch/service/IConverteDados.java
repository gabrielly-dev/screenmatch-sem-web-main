package br.com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);//um objeto genérico, ICONVERTEDADOS vai receber um dados e transformar em uma string
}
