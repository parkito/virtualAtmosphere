package ru.siksmfp.rx.play.nio;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class NastyChamp {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<Socket> sockets = new ArrayList<>(3000);
        for (int i = 0; i < 3000; i++) {
            sockets.add(new Socket("localhost", 8081));
        }

        Thread.sleep(10_000);
    }
}