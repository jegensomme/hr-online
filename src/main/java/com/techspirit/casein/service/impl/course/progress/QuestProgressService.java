package com.techspirit.casein.service.impl.course.progress;

import com.techspirit.casein.model.course.progress.QuestProgress;
import com.techspirit.casein.repository.course.progress.QuestProgressRepository;
import com.techspirit.casein.service.prototype.course.progress.ServiceQuestProgress;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class QuestProgressService implements ServiceQuestProgress {
    private final QuestProgressRepository questProgressRepository;

    @Override
    public QuestProgress read(int id) {
        return questProgressRepository.getOne(id);
    }
}
