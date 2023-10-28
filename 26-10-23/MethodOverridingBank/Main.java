public class Main {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        System.out.println("ROI SBI: "+sbi.getRateOfInterest());
        System.out.println("ROI ICICI: "+icici.getRateOfInterest());
        System.out.println("ROI Axis: "+axis.getRateOfInterest());
    }
}