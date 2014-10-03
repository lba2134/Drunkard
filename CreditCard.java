//**************************************************
// 
//  CreditCard.java
//  Written by Lyndsie Anderson
//
//**************************************************

//=================================================
//  Objects of this class determine the validity of
//  a 12-digit credit card number.
//==================================================

public class CreditCard {
 
  private String creditCardNumber;
  private boolean valid;
  public int code=0;
  private int first = Integer.parseInt(creditCardNumber.substring(0,1));
  private int second = Integer.parseInt(creditCardNumber.substring(1,2));
  private int third = Integer.parseInt(creditCardNumber.substring(2,3));
  private int fourth = Integer.parseInt(creditCardNumber.substring(3,4));
  private int fifth = Integer.parseInt(creditCardNumber.substring(4,5));
  private int sixth = Integer.parseInt(creditCardNumber.substring(5,6));
  private int seventh = Integer.parseInt(creditCardNumber.substring(6,7));
  private int eighth = Integer.parseInt(creditCardNumber.substring(7,8));
  private int ninth = Integer.parseInt(creditCardNumber.substring(8,9));
  private int tenth = Integer.parseInt(creditCardNumber.substring(9,10));
  private int eleventh = Integer.parseInt(creditCardNumber.substring(10,11));
  private int twelvth = Integer.parseInt(creditCardNumber.substring(11,12));


  public CreditCard(String n){
    creditCardNumber = n;
    valid=true;
        }
              

  public void check () {
    check1();
    check2();
    check3();
    check4();
    check5();
    check6();
  }
 
  private void check1 () { //first digit must be a four
        if (first!=4) {
          valid=false;
          code=1;
        }
  }

  private void check2 () { // the fourth digit must be one greater than the fifth
      if (fifth + 1 != fourth) {
          valid=false;
          code=2;
      }
  }

  private void check3 () {
      if (first * fifth * ninth != 24){
          valid=false;
          code=3;
      }
      
  }

  private void check4 (){
      if ((first + second + third + fourth + fifth + sixth + seventh + eighth + ninth +tenth + eleventh + twelvth)/4 != 4) {
          valid=false;
          code=4;
      }
  }

  private void check5 () {
      if (first + second + third + fourth +1 != ninth + tenth + eleventh + twelvth)
      { valid = false;
        code=5;
       }
  }

  private void check6 () {
      if ((first*10 + second)+ (seventh*10 + eighth) != 100 )
      { valid = false;
        code=6;
  
      }
  }
  
  public int getErrorCode () {
    return code;
  }
  public boolean isValid() {
    return valid;
  }
}
