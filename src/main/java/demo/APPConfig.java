package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo")
public class APPConfig {

    //if you are not suing component scan then write below code

//    @Bean
//    public Doctor doctor()
//    {
//        Doctor doctor = new Doctor(new Nurse());   //constructor
//        doctor.setQualification("mbbs");           //property
//        return doctor;
//    }
//
//    @Bean
//    public Nurse nurse()
//    {
//        return new Nurse();
//    }


//    A Nurse bean, created by the nurse() method.
//    A Doctor bean, created by the doctor() method, which automatically injects the Nurse bean.

}