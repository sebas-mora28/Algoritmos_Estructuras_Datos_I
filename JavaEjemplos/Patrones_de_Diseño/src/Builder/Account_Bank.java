package Builder;

public class Account_Bank {

    private String name;
    private int number_account;
    private String city;
    private int ID;


    public void info(){
        System.out.println(name + "\n" + number_account + "\n" + city + "\n" + ID);
    }




    public static class Builder {
        private String name;
        private int number_account;
        private String city;
        private int ID;



        public Builder(String name){
            this.name = name;
        }

        public Builder setNumberAccount(int number_account){
            this.number_account = number_account;

            return this;
        }

        public Builder setCity(String city){
            this.city = city;

            return this;
        }

        public Builder setID(int ID){
            this.ID = ID;

            return this;
        }

        public Account_Bank build(){
            Account_Bank account_bank = new Account_Bank();
            account_bank.name = name;
            account_bank.number_account = number_account;
            account_bank.city = city;
            account_bank.ID = ID;

            return account_bank;
        }




    }
}
