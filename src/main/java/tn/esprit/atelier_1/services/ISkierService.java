package tn.esprit.atelier_1.services;

import tn.esprit.atelier_1.entity.Skier;
import tn.esprit.atelier_1.enums.TypeCourse;
import tn.esprit.atelier_1.enums.TypeSubscription;

import java.time.LocalDate;
import java.util.List;

public interface ISkierService {
    List<Skier> retrieveAllSkiers();
    Skier addSkier(Skier skier);
    void removeSkier (Long numSkier);
    Skier retrieveSkier (Long numSkier);
    Skier addSkierAndAssignToCourse(Skier skier, Long numCourse);

    public Skier getByFirstAndLastName(String firstName, String lastName) ;
    public List<Skier> getByDateOfBirth(LocalDate dob) ;
    void assignSkierToPiste(Long numSkier, Long numPiste);

    List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription subscriptionType);
    List<Skier> getSkierByTypeCourse(TypeCourse typeCourse);
    public Skier updateSkier(Skier skier) ;
}
