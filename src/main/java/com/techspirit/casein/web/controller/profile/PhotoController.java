package com.techspirit.casein.web.controller.profile;

import com.techspirit.casein.model.profile.Photo;
import com.techspirit.casein.service.impl.profile.PhotoService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


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
        return service.read(id, profileId);
    }
}
