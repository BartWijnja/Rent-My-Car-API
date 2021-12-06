package avans.avd.rmc_v2.repository;


import avans.avd.rmc_v2.model.Car;
import avans.avd.rmc_v2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Optional<Car> findCarByLicensePlateNumber(String licensePlateNumber);
//    List<Car> findAllByUser(User user);

}
