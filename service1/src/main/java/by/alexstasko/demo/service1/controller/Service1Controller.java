package by.alexstasko.demo.service1.controller;

import by.alexstasko.demo.service1.model.SimpleResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Service1Controller {

    private List<String> list;

    @PostConstruct
    public void init() {
        list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SimpleResponse> callEndpoint(@PathVariable(name = "id") String id) {
        return new ResponseEntity<>(new SimpleResponse(id), HttpStatus.OK);
    }
}
