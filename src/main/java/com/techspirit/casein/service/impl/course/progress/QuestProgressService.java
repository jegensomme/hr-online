package com.techspirit.casein.service.impl.course.progress;

import com.techspirit.casein.model.course.progress.QuestProgress;
import com.techspirit.casein.repository.api.course.progress.QuestProgressRepository;
import com.techspirit.casein.service.prototype.course.progress.ServiceQuestProgress;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class QuestProgressService implements ServiceQuestProgress {

    private final QuestProgressRepository questProgressRepository;

    @Override
    public QuestProgress read(int id, int courseProgress) {
        return checkNotFoundWithId(questProgressRepository.get(id, courseProgress), id);
    }
}
