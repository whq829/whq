package BANK.BANKAccountPackage;


/**
* BANK/BANKAccountPackage/incorrect_pinHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从bank.idl
* 2020年3月18日 星期三 上午11时07分41秒 CST
*/

abstract public class incorrect_pinHelper
{
  private static String  _id = "IDL:BANK/BANKAccount/incorrect_pin:1.0";

  public static void insert (org.omg.CORBA.Any a, BANK.BANKAccountPackage.incorrect_pin that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static BANK.BANKAccountPackage.incorrect_pin extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [0];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (BANK.BANKAccountPackage.incorrect_pinHelper.id (), "incorrect_pin", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static BANK.BANKAccountPackage.incorrect_pin read (org.omg.CORBA.portable.InputStream istream)
  {
    BANK.BANKAccountPackage.incorrect_pin value = new BANK.BANKAccountPackage.incorrect_pin ();
    // read and discard the repository ID
    istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, BANK.BANKAccountPackage.incorrect_pin value)
  {
    // write the repository ID
    ostream.write_string (id ());
  }

}
