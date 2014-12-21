package org.smartjava;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;

/**
 * Created by scorpiovn on 12/19/14.
 */
public class HelloVerticle extends Verticle {

    @Override
    public void start() {
        vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
            @Override
            public void handle(HttpServerRequest httpServerRequest) {
                httpServerRequest.response().end("hello");
            }
        }).listen(8889);

        container.logger().info("Webserver started, listening on port: 8889");
    }
}
