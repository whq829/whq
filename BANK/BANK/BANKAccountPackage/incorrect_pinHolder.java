package BANK.BANKAccountPackage;

/**
* BANK/BANKAccountPackage/incorrect_pinHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从bank.idl
* 2020年3月18日 星期三 上午11时07分41秒 CST
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
