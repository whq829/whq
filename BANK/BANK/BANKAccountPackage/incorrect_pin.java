package BANK.BANKAccountPackage;


/**
* BANK/BANKAccountPackage/incorrect_pin.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从bank.idl
* 2020年3月18日 星期三 上午11时07分41秒 CST
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
