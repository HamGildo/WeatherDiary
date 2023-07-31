package zerobase.weather_diary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather_diary.domain.Diary;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {
}