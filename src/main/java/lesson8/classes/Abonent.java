package lesson8.classes;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Random;

public class Abonent {

    private long id;
    private String name;
    private String tariffPlan;
    private PhoneNubmer phoneNubmer;

    public String getPhoneNubmer() {
        if (phoneNubmer != null){
            return ("+" + phoneNubmer.countryCode + "_" + phoneNubmer.netCode + "_" + phoneNubmer.number);
        }
        else
        return ("phone number is empty");
    }

    public String getTariffPlan() {
        return tariffPlan;
    }

    public void setTariffPlan(String tariffPlan) {
        this.tariffPlan = tariffPlan;
    }

    public Abonent(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void obtainPhoneNumber(int countryCode, int netCode){
        phoneNubmer = new PhoneNubmer();
        phoneNubmer.setCountryCode(countryCode);
        phoneNubmer.setNetCode(netCode);
        phoneNubmer.generateNumber();
    }

    @Override
    public String toString() {
        return "Abonent '" + name + "'\n" +
                "ID " + id + "\n" +
                " Tariff Plan - " + tariffPlan + "\n" +
                " Phone Number - " + getPhoneNubmer() + "\n";
    }

    private class PhoneNubmer {
        private int countryCode;
        private int netCode;
        private int number;

        public void setCountryCode(int countryCode) {
            this.countryCode = countryCode;
        }

        public void setNetCode(int netCode) {
            this.netCode = netCode;
        }

        public void generateNumber(){
            number = new Random().nextInt(10_000_000);

        }
    }


}
