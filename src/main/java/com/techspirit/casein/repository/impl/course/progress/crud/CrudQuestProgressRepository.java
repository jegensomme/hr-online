package com.techspirit.casein.repository.impl.course.progress.crud;

import com.techspirit.casein.model.course.progress.QuestProgress;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.query.Param;

        import java.util.List;

public interface CrudQuestProgressRepository extends JpaRepository<QuestProgress, Integer> {

    @Query("SELECT qp FROM QuestProgress qp WHERE qp.courseProgress.id=:courseProgressId")
    List<QuestProgress> getAll(@Param("courseProgressId") int courseProgressId);
}
