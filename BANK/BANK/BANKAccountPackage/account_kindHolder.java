package BANK.BANKAccountPackage;

/**
* BANK/BANKAccountPackage/account_kindHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��bank.idl
* 2020��3��18�� ������ ����11ʱ07��41�� CST
*/

public final class account_kindHolder implements org.omg.CORBA.portable.Streamable
{
  public BANK.BANKAccountPackage.account_kind value = null;

  public account_kindHolder ()
  {
  }

  public account_kindHolder (BANK.BANKAccountPackage.account_kind initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BANK.BANKAccountPackage.account_kindHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BANK.BANKAccountPackage.account_kindHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BANK.BANKAccountPackage.account_kindHelper.type ();
  }

}
