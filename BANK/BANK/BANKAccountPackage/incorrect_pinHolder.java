package BANK.BANKAccountPackage;

/**
* BANK/BANKAccountPackage/incorrect_pinHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��bank.idl
* 2020��3��18�� ������ ����11ʱ07��41�� CST
*/

public final class incorrect_pinHolder implements org.omg.CORBA.portable.Streamable
{
  public BANK.BANKAccountPackage.incorrect_pin value = null;

  public incorrect_pinHolder ()
  {
  }

  public incorrect_pinHolder (BANK.BANKAccountPackage.incorrect_pin initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BANK.BANKAccountPackage.incorrect_pinHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BANK.BANKAccountPackage.incorrect_pinHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BANK.BANKAccountPackage.incorrect_pinHelper.type ();
  }

}
