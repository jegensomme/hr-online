package com.techspirit.casein.service.impl.course;

import com.techspirit.casein.model.course.Question;
import com.techspirit.casein.repository.api.course.QuestionRepository;
import com.techspirit.casein.service.prototype.course.ServiceQuestion;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class QuestionService implements ServiceQuestion {

    private final QuestionRepository repository;

    @Override
    public Question read(int id, int questId) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id, questId), id);
    }
}
