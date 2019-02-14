public class Password {

  private String password;

  public Password (String inPword) {

    password = inPword;

  }

  private boolean characterReq() {

    int charCount = 0;

    if (password.length() != 0) {

      for(int i=0; i<password.length(); i++) {

        charCount = charCount + 1;

      }

    }

    if (charCount >= 8 && charCount <= 32) {

      return true;
    }

    else {

      return false;
    }

  }

  private boolean oneNumReq() {

    int numThere = 0;

    if (password.length() != 0) {

    for(int i=0; i<password.length(); i++) {

      String currentItem = password.substring(i, i+1);
      char charVer = currentItem.charAt(0);

        if (Character.isDigit(charVer)) {

            numThere = 1;
            break;
        }

        else {
          
          numThere = 0;

        }

      }

      if (numThere == 1) {

        return true;
      }

      else {

        return false;
      }

    }

    else {

      return false;
    }
  }

  private boolean oneUpperReq() {

    int oneUpper = 0;

    if (password.length() != 0) {

    for(int i=0; i<password.length(); i++) {

      String currentItem = password.substring(i, i+1);
      char charVer = currentItem.charAt(0);

        if (Character.isUpperCase(charVer)) {

            oneUpper = 1;
            break;
        }

        else {
          
          oneUpper = 0;

        }

      }

      if (oneUpper == 1) {

        return true;
      }

      else {

        return false;
      }

    }

    else {

      return false;
    }


  }

  private boolean oneLowerReq() {

    int oneLower = 0;

    if (password.length() != 0) {

    for(int i=0; i<password.length(); i++) {

      String currentItem = password.substring(i, i+1);
      char charVer = currentItem.charAt(0);

        if (Character.isLowerCase(charVer)) {

            oneLower = 1;
            break;
        }

        else {
          
          oneLower = 0;

        }

      }

      if (oneLower == 1) {

        return true;
      }

      else {

        return false;
      }

    }

    else {

      return false;
    }

  }

  private boolean noSpaceOrSlashReq() {
    
    int foundSpaceorSlash =0;

      if (password.length() != 0) {
         for(int i=0; i<password.length(); i++) {

           if(password.substring(i, i+1).equals("/")) {

             foundSpaceorSlash = 1;
             break;
           }

           else {

             foundSpaceorSlash = 0;
           }

         }
      }

      if(foundSpaceorSlash == 1) {

        return false;
      }

      else {
        return true;

      }
      

  }

  public boolean startingCharNoNum() {

    String firstLet = password.substring(0, 1);
    char convertedFirstLet = firstLet.charAt(0);
    
    if (Character.isDigit(convertedFirstLet)) {

      return false;

    }

    else {

      return true;
    }


  }

  public String checkPassword() {

    int passingPword;

    if (characterReq() && oneNumReq() && oneUpperReq() && oneLowerReq() && noSpaceOrSlashReq()) {

      passingPword = 1;
    }

    else {

      passingPword = 0;
    }

    if (passingPword == 1) {

      return password + " YES";

    }

    else {
      return password + " NO";

    }
  }




  

}