package ru.siksmfp.rx.play.nio.handler.impl.nio;

import ru.siksmfp.rx.play.nio.handler.api.DecoratedHandler;
import ru.siksmfp.rx.play.nio.handler.api.Handler;

import java.io.IOException;
import java.nio.channels.SocketChannel;

public class NioBlockingConnectionHandler extends DecoratedHandler<SocketChannel> {

    public NioBlockingConnectionHandler(Handler<SocketChannel> handler) {
        super(handler);
    }

    @Override
    public void handle(SocketChannel socketChannel) throws IOException {
        while (socketChannel.isConnected()) {
            super.handle(socketChannel);
        }
    }
}