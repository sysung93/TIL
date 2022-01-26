package com.company.design;

import com.company.design.AOP.AopBrowser;
import com.company.design.Proxy.Browser;
import com.company.design.Proxy.BrowserProxy;
import com.company.design.Proxy.IBrowser;
import com.company.design.Strategy.*;
import com.company.design.adapter.*;
import com.company.design.decorator.*;
import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.SftpClient;
import com.company.design.facade.Writer;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
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
/* Cleaner cleaner = new Cleaner();
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

        //데코레이터패턴
        Icar audi = new Audi(1000);
        audi.showPrice();

        //a3
        Icar audi3 = new A3(audi, "A3");
        audi3.showPrice();
        //a4
        Icar audi4 = new A4(audi, "A4");
        audi4.showPrice();
        //a5
        Icar audi5 = new A5(audi, "A4");
        audi5.showPrice();



        //Observer
        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("메시지 전달 : click1");
        button.click("메시지 전달 : click2");
        button.click("메시지 전달 : click3");
        button.click("메시지 전달 : click4");

    //Facade
        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.temp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.temp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();

        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,"/home/etc", "text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
        */
        //전략패턴
        Encoder encoder = new Encoder();

        //base64
        EncodingStrategy base64 = new Base64Strategy();

        //normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);

    }

    //adapter patton
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
