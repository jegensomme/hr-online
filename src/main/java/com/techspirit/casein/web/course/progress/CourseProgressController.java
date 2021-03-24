package com.techspirit.casein.web.course.progress;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/progress")
@AllArgsConstructor
@Slf4j
@Api(tags="CourseProgress controller")
public class CourseProgressController {
}
