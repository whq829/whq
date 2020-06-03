package BANK;


/**
* BANK/BANKAccountOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从bank.idl
* 2020年3月18日 星期三 上午11时07分41秒 CST
*/

public interface BANKAccountOperations 
{
  float balance ();
  BANK.BANKAccountPackage.account_kind kind_of_account ();
  void kind_of_account (BANK.BANKAccountPackage.account_kind newKind_of_account);
  void access (String account, String pin) throws BANK.BANKAccountPackage.account_not_available, BANK.BANKAccountPackage.incorrect_pin;
} // interface BANKAccountOperations
