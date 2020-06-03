package BANK.BANKAccountPackage;


/**
* BANK/BANKAccountPackage/account_kindHelper.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��bank.idl
* 2020��3��18�� ������ ����11ʱ07��41�� CST
*/

abstract public class account_kindHelper
{
  private static String  _id = "IDL:BANK/BANKAccount/account_kind:1.0";

  public static void insert (org.omg.CORBA.Any a, BANK.BANKAccountPackage.account_kind that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static BANK.BANKAccountPackage.account_kind extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (BANK.BANKAccountPackage.account_kindHelper.id (), "account_kind", new String[] { "checking", "saving"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static BANK.BANKAccountPackage.account_kind read (org.omg.CORBA.portable.InputStream istream)
  {
    return BANK.BANKAccountPackage.account_kind.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, BANK.BANKAccountPackage.account_kind value)
  {
    ostream.write_long (value.value ());
  }

}
