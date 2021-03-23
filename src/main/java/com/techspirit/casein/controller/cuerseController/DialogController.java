package com.techspirit.casein.controller.cuerseController;

import com.techspirit.casein.model.Dialog;
import com.techspirit.casein.service.prototype.ServiceDialog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DialogController {
    private final ServiceDialog serviceDialog;

    @Autowired
    public DialogController(ServiceDialog serviceDialog) { this.serviceDialog = serviceDialog;}

    @CrossOrigin
    @GetMapping(value = "/dialogs/{id}")
    public ResponseEntity<Dialog> read(@PathVariable(name = "id") int id){
        final Dialog dialog = serviceDialog.read(id);

        return dialog != null
                ? new ResponseEntity<>(dialog, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
