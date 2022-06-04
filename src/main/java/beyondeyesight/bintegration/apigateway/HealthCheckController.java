package beyondeyesight.bintegration.apigateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @RequestMapping("/health")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("health checked");
    }
}
