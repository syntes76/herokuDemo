package pl.jr4soft.herokuDemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

/**
 * @author "Robert Milkowski"
 */
@RestController
@RequestMapping(value = "/health")
public class HealtCheckController {

    @ResponseStatus(OK)
    @GetMapping()
    public String ping() {
        return "App is running";
    }
}
