package com.techspirit.casein.web.profile;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/profile/photo")
@AllArgsConstructor
@Slf4j
@Api(tags="Photo controller")
public class PhotoController {
}
