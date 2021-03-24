package com.techspirit.casein.service.impl.course;

import com.techspirit.casein.model.course.Quest;
import com.techspirit.casein.repository.course.QuestRepository;
import com.techspirit.casein.service.prototype.course.ServiceQuest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class QuestService implements ServiceQuest {

    private final QuestRepository questRepository;

    @Override
    public Quest read(int id) {
        return questRepository.getOne(id);
    }
}
