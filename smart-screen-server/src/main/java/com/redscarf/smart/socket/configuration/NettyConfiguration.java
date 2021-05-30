package com.redscarf.smart.socket.configuration;

import com.redscarf.smart.socket.NettyServer;
import com.redscarf.smart.socket.property.NettyProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetSocketAddress;

/**
 * @Description
 * @Author LeeJohn
 * @Date 2021-05-30 13:55
 */
@Slf4j
@Configuration
public class NettyConfiguration implements CommandLineRunner {
    @Autowired
    private NettyServer nettyServer;
    @Autowired
    private NettyProperty nettyProperty;

    @Bean
    public NettyServer nettyServer(){
        return new NettyServer();
    }

    @Override
    public void run(String... args) throws Exception {
        //启动服务端
        nettyServer.start(new InetSocketAddress(
                nettyProperty.getHost(),
                nettyProperty.getPort()));
    }
}
