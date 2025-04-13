package tn.esprit.atelier_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.atelier_1.entity.Skier;
import tn.esprit.atelier_1.enums.TypeCourse;
import tn.esprit.atelier_1.enums.TypeSubscription;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SkierRepository extends JpaRepository<Skier, Long> {
    List<Skier> findBySubscription(TypeSubscription subscriptionType);

    List<Skier> getSkierByTypeCourse(TypeCourse typeCourse);

    Skier findByFirstNameAndLastName(String firstName, String lastName);

    List<Skier> findByDateOfBirth(LocalDate dob);
}
