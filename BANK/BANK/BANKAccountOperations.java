package BANK;


/**
* BANK/BANKAccountOperations.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��bank.idl
* 2020��3��18�� ������ ����11ʱ07��41�� CST
*/

public interface BANKAccountOperations 
{
  float balance ();
  BANK.BANKAccountPackage.account_kind kind_of_account ();
  void kind_of_account (BANK.BANKAccountPackage.account_kind newKind_of_account);
  void access (String account, String pin) throws BANK.BANKAccountPackage.account_not_available, BANK.BANKAccountPackage.incorrect_pin;
} // interface BANKAccountOperations
