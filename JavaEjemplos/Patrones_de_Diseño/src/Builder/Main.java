package Builder;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args){


        Account_Bank account_bank01 = new Account_Bank.Builder("Sebastian").setID(147547).setNumberAccount(1111000202).build();
        account_bank01.info();
    }



}