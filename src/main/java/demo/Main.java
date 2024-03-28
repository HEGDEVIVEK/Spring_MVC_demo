package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //before creating IOC
        //Doctor doc = new Doctor();


        //IOC
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context =
                new AnnotationConfigApplicationContext(APPConfig.class);


        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS MS MD");
        System.out.println("Qualification is "+doctor.getQualification());
        doctor.getNurse();
        System.out.println(doctor);

        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);

//        Nurse nurse= context.getBean(Nurse.class);
//        nurse.assist();


    }
}
