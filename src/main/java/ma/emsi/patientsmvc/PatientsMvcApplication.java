package ma.emsi.patientsmvc;

import ma.emsi.patientsmvc.entities.Patient;
import ma.emsi.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(
                    new Patient(1,"hassan",new Date(),false,122));
            patientRepository.save(
                    new Patient(2,"Mohamed",new Date(),true,321));
            patientRepository.save(
                    new Patient(3,"Yasmine",new Date(),true,165));
            patientRepository.save(
                    new Patient(4,"Hanae",new Date(),false,132));
            patientRepository.save(
                    new Patient(5,"hassan",new Date(),false,122));
            patientRepository.save(
                    new Patient(6,"Mohamed",new Date(),true,321));
            patientRepository.save(
                    new Patient(7,"Yasmine",new Date(),true,165));
            patientRepository.save(
                    new Patient(8,"Hanae",new Date(),false,132));
            patientRepository.findAll().forEach(p->{
                        System.out.println(p.getNom());
                    }
                    );
        };
    }
}
