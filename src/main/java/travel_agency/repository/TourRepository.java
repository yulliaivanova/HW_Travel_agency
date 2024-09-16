package travel_agency.repository;

import travel_agency.domain.Tour;

import java.util.List;

public interface TourRepository {
    // Сохранение тура
    //Получение списка туров
    //Получение конкретного тура по ID
    //Изменение тура
    //Логическое удаление тура (деактивация)

    Tour save(Tour tour);

    List<Tour> findAll();

    Tour findById(long id);

    void update (Tour tour);

    void deleteById(long id);





}
