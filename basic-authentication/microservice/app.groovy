import org.springframework.security.provisioning.InMemoryUserDetailsManager
import org.springframework.security.core.userdetails.User

@Grab('spring-boot-starter-security')
@RestController
class Application {

    @RequestMapping('/card-games')
    String cardGames() {
        return ['Blackjack', 'Pai Gow Poker', 'Texas Hold \'em']
    }

    /*@Bean
    InMemoryUserDetailsManager udm() {
        return new InMemoryUserDetailsManager(User.withDefaultPasswordEncoder()
                .username("user").password("secret").roles("USER").build());
    }*/
}
