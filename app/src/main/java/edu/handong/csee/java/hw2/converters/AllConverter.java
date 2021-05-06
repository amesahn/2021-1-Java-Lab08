package edu.handong.csee.java.hw2.converters;
/**
 * print all converter's results(only KM, TON).
 * km -> m, mile.
 * ton -> kg, g.
 * @author Myunghun Ahn 
 */
public class AllConverter {
    private double value; 
    private String oMeasure;

    /**
     * set variable to initial value.
     * @param fromValue early value, before converting number.
     * @return return 'this' by method chaining
     */
    public AllConverter setFromValue( double fromValue) {
        this.value = fromValue;
        return this;
    }

    /**
     * bring original measure To check the units
     * @param originalMeasure Ex) KM, TON
     * @return return 'this' by method chaining
     */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        this.oMeasure = originalMeasure;
        return this;
    }

    /**
     * If it's km or ton, we'll print it out.
     * @return return 'this' by method chaining, cunverted result
     */
    public AllConverter convertAndPrintOut() {
        double result1, result2;

        if(this.oMeasure.equals("TON")){
            TONToKGConverter TKConverter = new TONToKGConverter();
            TKConverter.setFromValue(this.value);
            TKConverter.convert();
            result1 = TKConverter.getConvertedValue();

            TONToGConverter TGConverter = new TONToGConverter();
            TGConverter.setFromValue(this.value);
            TGConverter.convert();
            result2 = TGConverter.getConvertedValue();

            System.out.println(this.value + " " + this.oMeasure + " " + "to" + " " + result1 + " " + "KG");
            System.out.println(this.value + " " + this.oMeasure + " " + "to" + " " + result2 + " " + "G");
            
            // System.out.println(this.value + " " + this.oMeasure + " to " + this.value * 1000 + " KG");
            // System.out.println(this.value + " " + this.oMeasure + " to " + this.value*1000*1000 + " G");
        }

        else if(this.oMeasure.equals("KM")){
            KMToMConverter KMMConverter = new KMToMConverter();
            KMMConverter.setFromValue(this.value);
            KMMConverter.convert();
            result1 = KMMConverter.getConvertedValue();

            KMToMILEConverter KMMILEConverter = new KMToMILEConverter();
            KMMILEConverter.setFromValue(this.value);
            KMMILEConverter.convert();
            result2 = KMMILEConverter.getConvertedValue();

            System.out.println(this.value + " " + this.oMeasure + " " + "to" + " " + result1 + " " + "KM");
            System.out.println(this.value + " " + this.oMeasure + " " + "to" + " " + result2 + " " + "MILE");

            // System.out.println(this.value + " " + this.oMeasure + " to " + this.value * 1000 + " M");
            // System.out.println(this.value + " " + this.oMeasure + " to " + this.value * 1.6 + " MILE");
        }

        else {
            System.out.println("AllConverter cannot support the measure!");
        }
        return this;
    }
    
}