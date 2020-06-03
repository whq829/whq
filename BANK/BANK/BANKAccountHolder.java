package BANK;

/**
* BANK/BANKAccountHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��bank.idl
* 2020��3��18�� ������ ����11ʱ07��41�� CST
*/

public final class BANKAccountHolder implements org.omg.CORBA.portable.Streamable
{
  public BANK.BANKAccount value = null;

  public BANKAccountHolder ()
  {
  }

  public BANKAccountHolder (BANK.BANKAccount initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BANK.BANKAccountHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BANK.BANKAccountHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BANK.BANKAccountHelper.type ();
  }

}
