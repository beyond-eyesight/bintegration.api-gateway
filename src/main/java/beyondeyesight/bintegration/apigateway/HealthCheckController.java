package beyondeyesight.bintegration.apigateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @RequestMapping("/health-check/ping")
    public String ping() {
        return "health checked";
    }
}
