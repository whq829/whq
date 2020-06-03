package BANK;


/**
* BANK/_BANKAccountStub.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从bank.idl
* 2020年3月18日 星期三 上午11时07分41秒 CST
*/

public class _BANKAccountStub extends org.omg.CORBA.portable.ObjectImpl implements BANK.BANKAccount
{

  public float balance ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_balance", true);
                $in = _invoke ($out);
                float $result = $in.read_float ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return balance (        );
            } finally {
                _releaseReply ($in);
            }
  } // balance

  public BANK.BANKAccountPackage.account_kind kind_of_account ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_kind_of_account", true);
                $in = _invoke ($out);
                BANK.BANKAccountPackage.account_kind $result = BANK.BANKAccountPackage.account_kindHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return kind_of_account (        );
            } finally {
                _releaseReply ($in);
            }
  } // kind_of_account

  public void kind_of_account (BANK.BANKAccountPackage.account_kind newKind_of_account)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_set_kind_of_account", true);
                BANK.BANKAccountPackage.account_kindHelper.write ($out, newKind_of_account);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                kind_of_account (newKind_of_account        );
            } finally {
                _releaseReply ($in);
            }
  } // kind_of_account

  public void access (String account, String pin) throws BANK.BANKAccountPackage.account_not_available, BANK.BANKAccountPackage.incorrect_pin
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("access", true);
                $out.write_string (account);
                $out.write_string (pin);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:BANK/BANKAccount/account_not_available:1.0"))
                    throw BANK.BANKAccountPackage.account_not_availableHelper.read ($in);
                else if (_id.equals ("IDL:BANK/BANKAccount/incorrect_pin:1.0"))
                    throw BANK.BANKAccountPackage.incorrect_pinHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                access (account, pin        );
            } finally {
                _releaseReply ($in);
            }
  } // access

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:BANK/BANKAccount:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _BANKAccountStub
