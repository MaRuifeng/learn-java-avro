package com.flyer.avro.rpc;

import com.flyer.avro.Mail;
import com.flyer.avro.Message;
import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.Server;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.apache.avro.ipc.specific.SpecificResponder;
import org.apache.avro.util.Utf8;
import java.net.InetSocketAddress;

/**
 * An RPC demonstration with server and client in the same application.
 * https://github.com/phunt/avro-rpc-quickstart
 */

public class AvroRPCDemo {

    private static class MailImpl implements Mail {
        public Utf8 send(Message message) {
            System.out.println("[Server] Sending message ...");
            return new Utf8("[Server] Sending message to " + message.getTo().toString()
                    + " from " + message.getFrom().toString()
                    + " with message body " + message.getBody().toString());
        }
    }

    private static Server server;

    private static void startServer() {
        server = new NettyServer(new SpecificResponder(Mail.class, new MailImpl()),
                new InetSocketAddress(65111));
    }

    public static void main(String[] args) {
        try {
            System.out.println("[Server] Starting server ...");
            startServer();
            System.out.println("[Server] Server started.");

            NettyTransceiver client = new NettyTransceiver(new InetSocketAddress(65111));
            Mail proxy = SpecificRequestor.getClient(Mail.class, client);
            System.out.println("[Client] Client built, got proxy.");

            Message message = new Message();
            message.setTo(new Utf8("Jerry"));
            message.setFrom(new Utf8("Jack"));
            message.setBody(new Utf8("Hello World!"));

            System.out.println("[Client] Calling proxy.send with message " + message.toString());
            System.out.println("[Client] Result: " + proxy.send(message));

            client.close();
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
