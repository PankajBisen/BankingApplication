package bankingapplication.constant;

public class UrlConstant {

  public static final String CUSTOMER_URL = "customer";
  public static final String CUSTOMER_CREATE = "/create";
  public static final String GET_BY_ID_OR_NAME_OR_MOBILENO_OR_EMAILID = "/getBy/{content}";
  public static final String GET_ALL = "/getAll";
  public static final String UPDATE_CUSTOMER = "/update/{customerId}";
  public static final String DELETE_CUSTOMER = "/delete/{customerId}";
  public static final String GET_ALL_CUSTOMERS_WITHOUT_ACCOUNTS = "getAllCustomersWithoutAccount/{bankId}";

  public static final String BANK = "/bank";
  public static final String CREATE_BANK = "/creat";
  public static final String GET_BANK = "/getBy/{content}";
  public static final String BANK_UPDATE = "/update/{bankId}";
  public static final String BANK_DELETE = "/delete/{bankId}";
  public static final String GET_ALL_BANK = "/getAllBank";

  public static final String ACCOUNT = "/account";
  public static final String ACCOUNT_CREAT = "/create";
  public static final String GET_ACCOUNT = "/getBy/{content}";
  public static final String ALL_BANK_ACCOUNT = "/getAll";
  public static final String UPDATE_ACCOUNT = "/update/{accountId}";
  public static final String DELETE_ACCOUNT = "/delete/{accountId}";
  public static final String GET_ALL_BANK_BY_ID = "/getAllByBankId/{bankId}";

  public static final String TRANSFER_MONEY = "/transfer";
    public static final String ACCOUNT_TRANSACTION_BY_ID = "/accountTransaction/{accNo}";
  public static final String TRANSACTION_BY_DAYS = "/sevenDaysTransaction/{numberOfDays}";


}
