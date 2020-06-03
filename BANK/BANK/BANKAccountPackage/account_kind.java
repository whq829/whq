package BANK.BANKAccountPackage;


/**
* BANK/BANKAccountPackage/account_kind.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从bank.idl
* 2020年3月18日 星期三 上午11时07分41秒 CST
*/

public class account_kind implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static BANK.BANKAccountPackage.account_kind[] __array = new BANK.BANKAccountPackage.account_kind [__size];

  public static final int _checking = 0;
  public static final BANK.BANKAccountPackage.account_kind checking = new BANK.BANKAccountPackage.account_kind(_checking);
  public static final int _saving = 1;
  public static final BANK.BANKAccountPackage.account_kind saving = new BANK.BANKAccountPackage.account_kind(_saving);

  public int value ()
  {
    return __value;
  }

  public static BANK.BANKAccountPackage.account_kind from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected account_kind (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class account_kind
