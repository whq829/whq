package BANK.BANKAccountPackage;

/**
* BANK/BANKAccountPackage/account_not_availableHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��bank.idl
* 2020��3��18�� ������ ����11ʱ07��41�� CST
*/

public final class account_not_availableHolder implements org.omg.CORBA.portable.Streamable
{
  public BANK.BANKAccountPackage.account_not_available value = null;

  public account_not_availableHolder ()
  {
  }

  public account_not_availableHolder (BANK.BANKAccountPackage.account_not_available initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BANK.BANKAccountPackage.account_not_availableHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BANK.BANKAccountPackage.account_not_availableHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BANK.BANKAccountPackage.account_not_availableHelper.type ();
  }

}
