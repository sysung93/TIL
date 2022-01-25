package com.company.design;

import com.company.design.AOP.AopBrowser;
import com.company.design.Proxy.Browser;
import com.company.design.Proxy.BrowserProxy;
import com.company.design.Proxy.IBrowser;
import com.company.design.adapter.*;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class main {
    public static void main(String[] args) {
/*
        //싱글톤
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));

        //adapter patton
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        */
/*Cleaner cleaner = new Cleaner();
        connect(cleaner);*//*


        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);

      //Proxy patter
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();


        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();
*/
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now- start.get());
                }
        );
        aopBrowser.show();
        System.out.println("loading time : " + end.get());
    }

    //adapter patton
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
