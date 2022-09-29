package datastructure.codility.spring.healthcheck;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


@RestController
class HealthcheckController {

    @GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<HealthCheckResponse> healthcheck(@RequestParam String format) {
        if (!isValidInputFormatParameter(format)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        MultiValueMap<String, String> httpHeaders = new LinkedMultiValueMap<>();
        httpHeaders.add("Content-Type", "application/json");
        return format.equalsIgnoreCase("full") ? getResponseForFormatTypeFull(httpHeaders) : new ResponseEntity<>(httpHeaders, HttpStatus.OK);
    }

    private ResponseEntity<HealthCheckResponse> getResponseForFormatTypeFull(MultiValueMap<String, String> httpHeaders) {
        HealthCheckResponse respone = new HealthCheckResponse();
        respone.setCurrentTime(getCurrentTime());
        respone.setApplication("OK");
        return new ResponseEntity<>(respone, httpHeaders, HttpStatus.OK);
    }

    private boolean isValidInputFormatParameter(String format) {
        return format.equalsIgnoreCase("full") || format.equalsIgnoreCase("short");
    }

    private String getCurrentTime() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        df.setTimeZone(tz);
        return df.format(new Date());
    }

    @PutMapping(value = "/healthcheck")
    public void healthcheckPut() {
        return;
    }

    @PostMapping(value = "/healthcheck")
    public void healthcheckPost() {
        return;
    }


    @DeleteMapping(value = "/healthcheck")
    public void healthcheckDelete() {
        return;
    }


    public class HealthCheckResponse {
        private String currentTime;
        private String application;


        public String getCurrentTime() {
            return currentTime;
        }

        public void setCurrentTime(String currentTime) {
            this.currentTime = currentTime;
        }

        public String getApplication() {
            return application;
        }

        public void setApplication(String application) {
            this.application = application;
        }

    }

}
