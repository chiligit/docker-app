package org.chilisoft.docker.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main controller
 *
 * @author Andras Toth
 *         date: 2015.08.25.
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "Hello docker!";
    }
}
