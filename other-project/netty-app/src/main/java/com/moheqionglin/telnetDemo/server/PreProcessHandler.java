package com.moheqionglin.telnetDemo.server;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.EventExecutorGroup;

/**
 * @author wanli.zhou
 * @description
 * @time 15/11/2018 11:23 AM
 */
public class PreProcessHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if(msg instanceof String){
            ctx.fireChannelRead(" Pre Process ==>" + msg);
        }

    }
}