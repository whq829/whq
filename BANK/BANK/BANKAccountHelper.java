package BANK;


/**
* BANK/BANKAccountHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从bank.idl
* 2020年3月18日 星期三 上午11时07分41秒 CST
*/

abstract public class BANKAccountHelper
{
  private static String  _id = "IDL:BANK/BANKAccount:1.0";

  public static void insert (org.omg.CORBA.Any a, BANK.BANKAccount that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static BANK.BANKAccount extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (BANK.BANKAccountHelper.id (), "BANKAccount");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static BANK.BANKAccount read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_BANKAccountStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, BANK.BANKAccount value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static BANK.BANKAccount narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof BANK.BANKAccount)
      return (BANK.BANKAccount)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      BANK._BANKAccountStub stub = new BANK._BANKAccountStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static BANK.BANKAccount unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof BANK.BANKAccount)
      return (BANK.BANKAccount)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      BANK._BANKAccountStub stub = new BANK._BANKAccountStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
