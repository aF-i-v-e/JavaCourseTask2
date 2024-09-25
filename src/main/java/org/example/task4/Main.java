package org.example.task4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №4, вариант 1, Величко А.П." );
        
        AsyncHttpClient client = new AsyncHttpClient();
        String uri = "https://httpbin.org/ip";
        client.printRequestIP(uri);
    }
}