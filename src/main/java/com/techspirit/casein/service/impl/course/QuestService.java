package com.techspirit.casein.service.impl.course;

import com.techspirit.casein.model.course.Quest;
import com.techspirit.casein.repository.api.course.QuestRepository;
import com.techspirit.casein.service.prototype.course.ServiceQuest;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class QuestService implements ServiceQuest {

    private final QuestRepository repository;

    @Override
    public Quest read(int id, int courseId) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id, courseId), id);
    }
}
