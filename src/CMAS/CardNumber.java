/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CMAS;

/**
 *
 * @author Eric
 */
public class CardNumber implements Number {

    String type = "card number";
    String number = "";
    int length = 16;
    int seccode = 0;
    String format = "xxxx-xxxx-xxxx-xxxx";
    String cardholder = "";
    String signature = "";
    String bank = "";
    int expMonth;
    int expDay;
    int expYear;

    static char x = 'x';
    static char s = '-';

    public CardNumber() {
        number = "0000000000000000";
        cardholder = "John Doe";
        seccode = 123;
        expMonth = 01;
        expDay = 01;
        expYear = 2004;
        signature = "";
        bank = "";
    }

    public CardNumber(String num, String holder, int m, int d, int y, int code, String bnk, String sig) {
        number = num;
        cardholder = holder;
        seccode = code;
        expMonth = 01;
        expDay = 01;
        expYear = 2004;
        signature = sig;
        bank = bnk;
    }

    public String getCardHolder() {
        return cardholder;
    }

    public void setCardHolder(String name) {
        cardholder = name;
    }

    public String getExpire() {
        return expMonth + "/" + expDay + "/" + expYear;
    }

    public void setExpire(int mon, int day, int year) {
        expMonth = mon;
        expDay = day;
        expYear = year;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bnk) {
        bank = bnk;
    }

    public String getSignature() {
        return signature;
    }

    public void sign(String sig) {
        signature = sig;
    }

    public String getCode() {
        return "" + seccode;
    }

    public void setCode(int c) {
        seccode = c;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public void setNumber(String num) {
        if (isFormatted(num)) {
            number = num;
        }
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public void setLength(int size) {
        length = size;
    }

    @Override
    public void setLength(int min, int max) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFormat() {
        return format;
    }

    @Override
    public void setFormat(String fmat) {
        format = fmat;
    }

    @Override
    public String toString() {
        String num = "";
        char index;

        for (int i = 0, j = 0; i < format.length(); i++) {
            index = format.charAt(i);
            if (format.charAt(i) == x) {
                char digit = number.charAt(j);
                j++;
                num = num.concat(String.valueOf(digit));
            }
            if (index == s) // index is a dash
            {
                num = num.concat("-");
            }
        }
        return num;
    }

    private boolean isFormatted(String fmat) {
        return fmat.length() == 16;
    }
}
