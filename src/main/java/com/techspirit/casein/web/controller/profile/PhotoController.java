package com.techspirit.casein.web.controller.profile;

import com.techspirit.casein.model.profile.Photo;
import com.techspirit.casein.service.profile.PhotoService;
import com.techspirit.casein.util.exception.NotFoundException;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("/profiles/{profileId}/photos")
@AllArgsConstructor
@Slf4j
@Api(tags="Photo controller")
public class PhotoController {

    private final PhotoService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Photo get(@PathVariable int id, @PathVariable int profileId) {
        log.info("read {}", id);
        try {
            return service.read(id, profileId);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }
}
