package me.sonam.swaggerui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * Handler
 */
@Component
public class Handler {
    private static  final Logger LOG = LoggerFactory.getLogger(Handler.class);
    /**
     * outline only
     */
    public Mono<ServerResponse> handle(ServerRequest serverRequest) {
        LOG.info("display links to all openapi yaml");
        StringBuilder stringBuilder = new StringBuilder("<html><title>swagger-ui</title><body>");
        stringBuilder.append("<h1>Swagger ui</h1>").append("<p>access ");
        stringBuilder.append("<a href=\"/swagger-ui.html\"/> swaggerui</a></p>");
        stringBuilder.append("</body></html>");
        return ServerResponse.ok().contentType(MediaType.TEXT_HTML).bodyValue(stringBuilder.toString());
    }
}
