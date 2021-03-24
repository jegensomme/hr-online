package com.techspirit.casein.web.course;

import com.techspirit.casein.model.course.Answer;
import com.techspirit.casein.service.prototype.course.ServiceAnswer;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/course/quest/question/answer")
@AllArgsConstructor
@Slf4j
@Api(tags="Answer controller")
public class AnswerController {
}
