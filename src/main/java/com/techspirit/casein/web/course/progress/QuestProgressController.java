package com.techspirit.casein.web.course.progress;

import com.techspirit.casein.model.course.progress.QuestProgress;
import com.techspirit.casein.service.prototype.course.progress.ServiceQuestProgress;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/progress/quest")
@AllArgsConstructor
@Slf4j
@Api(tags="QuestProgress controller")
public class QuestProgressController {
}
