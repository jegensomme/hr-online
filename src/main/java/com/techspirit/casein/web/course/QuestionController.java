package com.techspirit.casein.web.course;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course/quest/question")
@AllArgsConstructor
@Slf4j
@Api(tags="Question controller")
public class QuestionController {

}
