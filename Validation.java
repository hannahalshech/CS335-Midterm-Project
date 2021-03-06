    public class Validation{
        public static void main(String[] args){
            
        } 
        public static String validatePasswords(String password){
            // validate length of password is >= 8 characters
            char passShort = 'n';       
            if(password.length() >= 8) {
                passShort = 'y';    
            }
            while(passShort != 'y') {
                System.out.println("Password not long enough! Password must contain 8 characters.\nEnter new password: ");
                password = scan.next();
                if(password.length() > 8) {
                    passShort = 'y';    
                }

            //validate if special characters are included
            char passSpecial = 'n';
            if(password.contains("@") | password.contains("#") | password.contains("!") | password.contains("$") | password.contains("&") | password.contains("*")){
                passSpecial= 'y';
            }
            while(passSpecial != 'y'){
                System.out.println("This is not a valid password! Password must contain at least one of the following special characters: !, #, $, @, &, or *.\nEnter new password: ");
                password = scan.next();
                if(password.contains("@") | password.contains("#") | password.contains("!") | password.contains("$") | password.contains("&") | password.contains("*")){
                    passSpecial = 'y';
                }
            }

            //validate length of password <= 50 characters
            char passLong = 'n';
            if(password.length() <= 50){
                passLong = 'y';
            }
            while(passLong != 'y'){
                System.out.println("This password is too long! Password must contain 50 characters or less.\nEnter new password: ");
                password = scan.next();
                if(password.length() <= 50){
                    passLong = 'y';
                }
            }

            //validate if password contains digit
            char passNum = 'n';
            if (password.contains("0") | password.contains("1") | password.contains("2") | password.contains("3") | password.contains("4") | password.contains("5") | password.contains("6") | password.contains("7") | password.contains("8") | password.contains("9")){
                passNum = 'y';
            }
            while (passNum != 'y'){
                System.out.println("This password does not contain any digits. Your password must contain at least one digit.\nEnter new password: ");
                password = scan.next();
                if(password.contains("0") | password.contains("1") | password.contains("2") | password.contains("3") | password.contains("4") | password.contains("5") | password.contains("6") | password.contains("7") | password.contains("8") | password.contains("9")){
                    passNum = 'y';
                }
            }

            //validate if password contains at least one capital letter
            char passCap = 'n';
            for (int i=0; i < password.length(); i++){
                if(Character.isUpperCase(password.charAt(i))){
                    passCap = 'y';
                }
                while (passCap != 'y'){
                    System.out.println("This password does not contain a capital letter. Your password must contain at least one capital letter.\nEnter new password: ");
                    password.scan.next();
                    if(Character.isUpperCase(password.charAt(i))){
                        passCap = 'y';
                    }
                }
            }
        } // end validation loop     
        }

    }
    
