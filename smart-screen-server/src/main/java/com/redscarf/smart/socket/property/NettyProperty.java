package com.redscarf.smart.socket.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author LeeJohn
 * @Date 2021-05-30 13:49
 */
@Data
@Component
public class NettyProperty {
    @Value("${netty.host:127.0.0.1}")
    private String host;
    @Value("${netty.port:8888}")
    private Integer port;
}
