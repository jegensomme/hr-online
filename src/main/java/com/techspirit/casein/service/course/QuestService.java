package com.techspirit.casein.service.course;

import com.techspirit.casein.model.course.Quest;
import com.techspirit.casein.repository.api.course.QuestRepository;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class QuestService {

    private final QuestRepository repository;

    public Quest read(int id, int courseId) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id, courseId), id);
    }
}
