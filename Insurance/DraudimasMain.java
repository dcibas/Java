
public class DraudimasMain {
	
    public static void main(String[] args) {
    	
        Draudimas draudimas1 = new TPVCADraudimas("John Doe",1200,"ABS123","Lietuva");
        Draudimas draudimas2 = new KaskoDraudimas("Tony Sparks",2100,"LAB389",1.00);
        AutomobilioDraudimas draud3 = new TPVCADraudimas("William Johnson",1800,"CDE734","Europa");

        System.out.println("\n\n");
        System.out.println(draudimas1.getApdraustojoVardas());
        System.out.println(draudimas1.getDraudimoSuma());
        System.out.println(((AutomobilioDraudimas) draudimas1).getAutomobilioValstNr());
        System.out.println(((TPVCADraudimas) draudimas1).getGaliojimoTeritorija());

        System.out.println("\n");
        System.out.println(draudimas2.getApdraustojoVardas());
        System.out.println(draudimas2.getDraudimoSuma());
        System.out.println(((AutomobilioDraudimas)draudimas2).getAutomobilioValstNr());
        System.out.println(((KaskoDraudimas) draudimas2).getFransize());

        System.out.println("\n");
        System.out.println(draud3.getApdraustojoVardas());
        System.out.println(draud3.getDraudimoSuma());
        System.out.println(draud3.getAutomobilioValstNr());
        System.out.println(((TPVCADraudimas) draud3).getGaliojimoTeritorija());
        
    }
}
