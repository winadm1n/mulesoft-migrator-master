package TestPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.http.dsl.Http;

@Configuration
public class FlowConfigurations {
    @Bean
    IntegrationFlow get_user_detailsFlow() {
        return IntegrationFlows.from(Http.inboundGateway("/getUserDetails")).handle((p, h) -> p)
                .handle((p, h) -> "User Name : Greg Spencer,User Address : 399 Thornall Street, 1st Floor, Edison, NJ, NJ 08837")
                .get();
    }

}