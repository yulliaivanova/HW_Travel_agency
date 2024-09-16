package travel_agency.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import travel_agency.domain.Tour;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TourRepositoryImpl implements TourRepository {

    private File database;
    private ObjectMapper mapper;
    private long currentId;

    public TourRepositoryImpl() {
        database = new File("TravelTour.txt");
        mapper = new ObjectMapper();
        try {
            database.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        getMaxId();
    }

    private void getMaxId() {
        List<Tour> tours = findAll();
        if (!tours.isEmpty()) {
            Tour lastSuperTour = tours.get(tours.size() - 1);
            currentId = lastSuperTour.getId();
        }
    }


    @Override
    public Tour save(Tour tour) {
        List<Tour> tours = findAll();
        tour.setId(++currentId);
        tour.setActual(true);
        tours.add(tour);
        try {
            mapper.writeValue(database, tours);
            return tour;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Tour> findAll() {
        try {
            Tour[] tours = mapper.readValue(database, Tour[].class);
            List<Tour> result = new ArrayList<>();
            Collections.addAll(result, tours);
            return result;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public Tour findById(long id) {
        return findAll()
                .stream()
                .filter((x -> x.getId() == id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void update(Tour tour) {
        //findAll().
        //     stream()
        //  .filter(x -> x.getId() == tour.getId())
        //  .forEach(x->x.setPrice(tour.getPrice()));
        List<Tour> tours = findAll();
        for (Tour travelTour : tours) {
            if (travelTour.getId() == tour.getId()) {
                travelTour.setPrice(tour.getPrice());
                travelTour.setActual(true);
            }
        }
        try {
            mapper.writeValue(database, tours);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void deleteById(long id) {
        List<Tour> tours = findAll();

        tours
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .ifPresent(x -> x.setActual(false));


    }
}
