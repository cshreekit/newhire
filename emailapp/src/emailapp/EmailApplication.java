package emailapp;

import java.util.Scanner;

public class EmailApplication {
        private String firstName;
        private String lastName;
        private String dept;
        private String password;
        private int mailCapacity;
        private String altEmailAdd;
        private final String company = "shreepvtltd";

        public EmailApplication(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
                System.out.println("Please enter the department code");
                this.dept = setDepartment();
                System.out.println("Dept:"+" "+ this.dept);
                System.out.println("Your Email: "+ this.firstName+"."+this.lastName+"."+"@"+this.dept+"."+company+".com");
                
                this.password = randomPassword(8);
                System.out.println("Your password is "+ this.password);
        }

        private String setDepartment(){
                System.out.print("Enter department:\n1 for Sales\n2 for Accounting\n3 for Development\n0 for None\n");
                Scanner input = new Scanner(System.in);
                int deptChoice = input.nextInt();
                if(deptChoice==0){
                        return "";
                } else if (deptChoice == 1){
                        return "sales";
                }else if (deptChoice == 2 ) {
                        return "accounting";
                }else if (deptChoice == 3 ) {
                        return "development";
                }

                return dept;

        }
        
        // add password functionality
        private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789#$%";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
        int random = (int)(Math.random()* passwordSet.length());
        password[i] = passwordSet.charAt(random);
        }
        return new String (password);
        }


}
