package BANK.BANKAccountPackage;


/**
* BANK/BANKAccountPackage/incorrect_pin.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��bank.idl
* 2020��3��18�� ������ ����11ʱ07��41�� CST
*/

public final class incorrect_pin extends org.omg.CORBA.UserException
{

  public incorrect_pin ()
  {
    super(incorrect_pinHelper.id());
  } // ctor


  public incorrect_pin (String $reason)
  {
    super(incorrect_pinHelper.id() + "  " + $reason);
  } // ctor

} // class incorrect_pin
