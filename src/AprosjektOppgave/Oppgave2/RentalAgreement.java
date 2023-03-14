package AprosjektOppgave.Oppgave2;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class RentalAgreement extends Person{

    public String signature;
    public Date contractStart;
    public Date contractEnd;

    public RentalAgreement(String signature, Date contractStart, Date contractEnd) {
        super(signature);
        this.signature = personName;
        this.contractStart = getContractStart();
        this.contractEnd = getContractEnd();

    }

    public Date getContractStart() {
        return contractStart;
    }

    public void setContractStart(Date contractStart) {
        this.contractStart = contractStart;
    }

    public Date getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(Date contractEnd) {
        this.contractEnd = contractEnd;
    }
}
