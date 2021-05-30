package com.redscarf.smart.socket.client;

/**
 * @Description
 * @Author LeeJohn
 * @Date 2021-05-30 14:19
 */
public class SocketTest {

    public static void main(String[] args){
        NettyClient nettyClient = new NettyClient();
        nettyClient.start();
    }
}
