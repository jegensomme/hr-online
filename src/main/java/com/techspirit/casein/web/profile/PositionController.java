package com.techspirit.casein.web.profile;

import com.techspirit.casein.model.profile.Position;
import com.techspirit.casein.service.prototype.profile.ServicePosition;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/position")
@AllArgsConstructor
@Slf4j
@Api(tags="Position controller")
public class PositionController {
}
