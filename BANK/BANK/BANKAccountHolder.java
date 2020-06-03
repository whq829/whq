package BANK;

/**
* BANK/BANKAccountHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从bank.idl
* 2020年3月18日 星期三 上午11时07分41秒 CST
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
