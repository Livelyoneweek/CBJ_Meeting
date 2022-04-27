package fighting.cbj_meeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CbjMeetingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CbjMeetingApplication.class, args);
    }

}
