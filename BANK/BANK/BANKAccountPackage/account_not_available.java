package BANK.BANKAccountPackage;


/**
* BANK/BANKAccountPackage/account_not_available.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��bank.idl
* 2020��3��18�� ������ ����11ʱ07��41�� CST
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
