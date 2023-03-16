package AprosjektOppgave.Oppgave2;



public class RentalAgreement extends Person{

    public String contractStart = "ContractStart";
    public String contractEnd = "ContractEnd";


    public RentalAgreement(String signature, int day, int month, int year, int endDay, int endMonth, int endYear) {
        super(signature, day, month, year, endDay, endMonth, endYear);

    }

    @Override
    public String toString() {
        return "\u001B[33mRENTAL AGREEMENT: \u001B[34m" + "\n" +
                "   |- Signature: " + signature + " " +"\n"+
                "   |- "+ contractStart + ": " + day +"/"+month+"/"+year +"\n" +
                "   |- "+ contractEnd + ": " + endDay +"/"+endMonth+"/"+endYear +"\n" ;
    }


}

