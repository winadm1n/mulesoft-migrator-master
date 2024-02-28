package testmodules;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.http.dsl.Http;

@Configuration
public class FlowConfigurations {
    @Bean
    IntegrationFlow hellomuleFlow() {
        return IntegrationFlows.from(Http.inboundGateway("/hellomule")).handle((p, h) -> p)
                .handle((p, h) -> "hellomule")
                .get();
    }
}