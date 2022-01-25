package com.company.design.singleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz() {
        // this.socketClient = new SocketClient();
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
