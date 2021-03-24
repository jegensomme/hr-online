package com.techspirit.casein.web.profile;

import com.techspirit.casein.model.profile.Photo;
import com.techspirit.casein.service.prototype.profile.ServicePhoto;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/profile/photo")
@AllArgsConstructor
@Slf4j
@Api(tags="Photo controller")
public class PhotoController {
}
