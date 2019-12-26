package ru.siksmfp.rx.play.connector.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

import static java.nio.channels.SelectionKey.OP_ACCEPT;
import static ru.siksmfp.rx.play.connector.nio.AppState.isWorking;

public class NioConnector {

    public static void main(String[] args) throws IOException {
        new NioConnector().start();
    }

    public void start() throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(8081));
        serverSocketChannel.configureBlocking(false);
        Selector selector = Selector.open();
        serverSocketChannel.register(selector, OP_ACCEPT);

        while (isWorking){
            System.out.println("Working");
        }

        System.out.println("Finishing nio connector");
    }
}