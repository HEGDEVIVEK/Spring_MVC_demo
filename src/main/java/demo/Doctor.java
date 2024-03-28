package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff {
    private String qualification;
    private  Nurse nurse;

    @Autowired
    public Doctor(Nurse nurse) {
        this.nurse=nurse;
        System.out.println("hello");
    }

    public void getNurse() {
        //return nurse;
        nurse.assist();
    }



    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    public void assist()
    {
        System.out.println(" doctor is helping\n");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                ", nurse=" + nurse +
                '}';
    }


}
