import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.web.client.RestOperations
import org.springframework.web.client.RestTemplate

@RestController
class Application {

    RestTemplate restTemplate;

    @Bean
    RestOperations rest(RestTemplateBuilder builder) {
        this.restTemplate = builder.basicAuthorization("username", "password").build()
    }

    @RequestMapping('/')
    String home() {
        restTemplate.getForObject('http://localhost:8888/card-games', String.class)
    }
}
