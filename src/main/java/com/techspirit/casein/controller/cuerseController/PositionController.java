package com.techspirit.casein.controller.cuerseController;

import com.techspirit.casein.model.Position;
import com.techspirit.casein.service.prototype.ServicePosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PositionController {
    private final ServicePosition servicePosition;

    @Autowired
    public PositionController(ServicePosition servicePosition) { this.servicePosition = servicePosition;}

    @CrossOrigin
    @GetMapping(value = "/positions/{id}")
    public ResponseEntity<Position> read(@PathVariable(name = "id") int id){
        final Position position = servicePosition.read(id);

        return position != null
                ? new ResponseEntity<>(position, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
