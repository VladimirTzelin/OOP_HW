package OOP_HW6.utils;

public class Validate {

    public void checkNumber(String telephone) throws Exception {
        if(!telephone.substring(0,1).equals("+")) {
            throw new PhoneException("Номер телефона обычно начинается с плюса +");
        }
        
        else if(telephone.length() != 12) {
            throw new PhoneException("Обычно номер телефона состоит из 11 цифр");
        }
    }   
}
