package BankInterfaceExample;

public class Main {
    public static void main (String[] args) {
//        SBI sbi = new SBI();
//        HDFC hdfc = new HDFC();
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        System.out.println("SBI ROI: "+sbi.rateOfInterest());
        System.out.println("HDFC ROI: "+hdfc.rateOfInterest());
    }

}
