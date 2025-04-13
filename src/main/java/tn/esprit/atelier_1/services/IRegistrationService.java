package tn.esprit.atelier_1.services;

import tn.esprit.atelier_1.entity.Registration;
import tn.esprit.atelier_1.entity.Skier;

import java.util.List;

public interface IRegistrationService {
    Registration addRegistrationAndAssignToSkier(
            Registration registration, Long numSkieur
    );
    Registration addRegistration(Registration registration);
    Registration updateRegistration(Registration registration);
    Registration retrieveRegistration(Long numRegistration);
    List<Registration> retrieveAll();
    void removeRegistration(Long numRegistration);
    Registration assignRegistrationToCourse(Registration registration,Long numCourse);
    Skier addSkierAndAssignToCourse(Skier skier, Long numCourse);
}
