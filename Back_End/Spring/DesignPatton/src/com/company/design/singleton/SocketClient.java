package com.company.design.singleton;

public class SocketClient {
    private static SocketClient socketClient = null;

    //싱글톤은 기본생성자를 private로 막아줘야함
    private SocketClient() {

    }

    //static 메소들 통해 getInstance메소드 제공
    //자신의 객체가 null인 경우 신규로 생성해서 return
    //null이 아닌경우 자신을 리턴
    public static SocketClient getInstance(){
        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
