package com.techspirit.casein.service.course;

import com.techspirit.casein.model.course.Question;
import com.techspirit.casein.repository.api.course.QuestionRepository;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class QuestionService {

    private final QuestionRepository repository;

    public Question read(int id, int questId) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id, questId), id);
    }
}
