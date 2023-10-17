package no.pgr301d.cddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.UUID;

@RestController
class CDController {

    @GetMapping(path = "/")
    public String hello() {
        return "Hello world! at " +  LocalDateTime.now().toString() + " " + UUID.randomUUID().toString();;
    }

}