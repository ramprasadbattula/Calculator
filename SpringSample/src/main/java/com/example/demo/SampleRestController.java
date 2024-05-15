/*
 * package com.example.demo;
 * 
 * import java.net.http.HttpRequest;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.MediaType; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.ResponseBody; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.example.demo.components.Addd;
 * 
 * import jakarta.servlet.http.HttpServletRequest;
 * 
 * 
 * @RestController public class SampleRestController {
 * 
 * 
 * @Autowired Addd additionn;
 * 
 * @PostMapping(value = "/addit", consumes = MediaType.TEXT_PLAIN_VALUE)
 * public @ResponseBody String addValues(HttpServletRequest
 * servletRequest, @RequestBody String input) { String[] getStrNumbers =
 * input.split(" "); return "" +
 * additionn.addition(Integer.parseInt(getStrNumbers[0]),
 * Integer.parseInt(getStrNumbers[1])); //return "Hello World " + input;
 * 
 * }
 * 
 * 
 * }
 */
package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class SampleRestController {

    private static final Logger logger = LoggerFactory.getLogger(SampleRestController.class);

    @Autowired
    private Addd additionn;

    @PostMapping(value = "/addit", consumes = MediaType.TEXT_PLAIN_VALUE)
    public String addValues(HttpServletRequest servletRequest, @RequestBody String input) {
        try {
            logger.info("Content-Type: " + servletRequest.getContentType());
            logger.info("Input: " + input);
            String[] getStrNumbers = input.split(" ");
            int num1 = Integer.parseInt(getStrNumbers[0]);
            int num2 = Integer.parseInt(getStrNumbers[1]);
            int result = additionn.addition(num1, num2);
            logger.info("Addition result: " + result);
            return String.valueOf(result);
        } catch (Exception e) {
            logger.error("Error processing input", e);
            return "Error: " + e.getMessage();
        }
    }
}
