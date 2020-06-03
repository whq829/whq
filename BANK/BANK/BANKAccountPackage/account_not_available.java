package BANK.BANKAccountPackage;


/**
* BANK/BANKAccountPackage/account_not_available.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从bank.idl
* 2020年3月18日 星期三 上午11时07分41秒 CST
*/

public final class account_not_available extends org.omg.CORBA.UserException
{
  public String reason = null;

  public account_not_available ()
  {
    super(account_not_availableHelper.id());
  } // ctor

  public account_not_available (String _reason)
  {
    super(account_not_availableHelper.id());
    reason = _reason;
  } // ctor


  public account_not_available (String $reason, String _reason)
  {
    super(account_not_availableHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class account_not_available
