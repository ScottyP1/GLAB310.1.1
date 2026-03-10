package com.glab309_7_1.repository;

import com.glab309_7_1.model.Tutorial;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long>
        // Tutorial → Entity type and Long --> primary key
{
    //   findByPublished is a custom method()
    List<Tutorial> findByPublished(boolean published);
}