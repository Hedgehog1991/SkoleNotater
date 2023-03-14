package AprosjektOppgave.Oppgave2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;



public class RentalAgreement extends Person{

    public String signature;
    public int contractStart;
    public int contractEnd;
    public int day;
    public int  month;
    public int year;


    public RentalAgreement(String signature, int contractStart,int contractEnd) {
        super(signature);
        this.signature = personName;
        this.contractStart = getContractStart();
        this.contractEnd = contractEnd;
    }


    public int getContractStart() {
        return contractStart;
    }






    public void setContractStart(int contractStart) {

        this.contractStart = contractStart;

    }

    public int getContractEnd() {
     return contractEnd;
    }

    public void setContractEnd(int contractEnd) {
        this.contractEnd = contractEnd;
    }

    @Override
    public String toString() {
        return "RentalAgreement{" +
                ", signature='" + signature + '\'' +
                ", contractStart=" + getContractStart() +
                ", contractEnd=" + getContractEnd() +

                '}';
    }
}
