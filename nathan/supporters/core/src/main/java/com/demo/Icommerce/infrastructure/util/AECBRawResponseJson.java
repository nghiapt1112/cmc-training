package com.demo.Icommerce.infrastructure.util;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class AECBRawResponseJson {
    @JsonProperty("NAE_RES")
    public NAERES nAE_RES;
}

class NewApplication {
    @JsonProperty("CBContractId")
    public String cBContractId;
    @JsonProperty("ProviderApplicationNo")
    public String providerApplicationNo;
}

class Individual {
    @JsonProperty("FullNameEN")
    public String fullNameEN;
    @JsonProperty("Gender")
    public String gender;
    @JsonProperty("DOB")
    public String dOB;
    @JsonProperty("Nationality")
    public String nationality;
    @JsonProperty("EmiratesId")
    public String emiratesId;
    @JsonProperty("PassportNo")
    public String passportNo;
    @JsonProperty("PrimaryMobileNo")
    public String primaryMobileNo;
    @JsonProperty("NameEN")
    public NameEN nameEN;
    @JsonProperty("FirstNameENHistory")
    public ArrayList<FirstNameENHistory> firstNameENHistory;
    @JsonProperty("LastNameENHistory")
    public ArrayList<LastNameENHistory> lastNameENHistory;
    @JsonProperty("FullNameENHistory")
    public ArrayList<FullNameENHistory> fullNameENHistory;
    @JsonProperty("GenderHistory")
    public ArrayList<GenderHistory> genderHistory;
    @JsonProperty("DOBHistory")
    public ArrayList<DOBHistory> dOBHistory;
    @JsonProperty("NationalityHistory")
    public ArrayList<NationalityHistory> nationalityHistory;
    @JsonProperty("Title")
    public String title;
    @JsonProperty("TitleHistory")
    public ArrayList<TitleHistory> titleHistory;
    @JsonProperty("ResidentFlag")
    public String residentFlag;
    @JsonProperty("ResidentFlagHistory")
    public ArrayList<ResidentFlagHistory> residentFlagHistory;
    @JsonProperty("PassportHistory")
    public ArrayList<PassportHistory> passportHistory;
    @JsonProperty("EmiratesIdHistory")
    public EmiratesIdHistory emiratesIdHistory;
    @JsonProperty("AddressHistory")
    public ArrayList<AddressHistory> addressHistory;
    @JsonProperty("ContactHistory")
    public ArrayList<ContactHistory> contactHistory;
}

class EnquiredSubject {
    @JsonProperty("Individual")
    public Individual individual;
}

class NameEN {
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("LastName")
    public String lastName;
}

class UpdateInfo {
    @JsonProperty("ProviderNo")
    public String providerNo;
    @JsonProperty("DateOfUpdate")
    public String dateOfUpdate;
}

class FirstNameENData {
    @JsonProperty("FirstNameEN")
    public String firstNameEN;
    @JsonProperty("ActualFlag")
    public String actualFlag;
}

class FirstNameENHistory {
    @JsonProperty("UpdateInfo")
    public UpdateInfo updateInfo;
    @JsonProperty("FirstNameENData")
    public FirstNameENData firstNameENData;
}

class LastNameENData {
    @JsonProperty("LastNameEN")
    public String lastNameEN;
    @JsonProperty("ActualFlag")
    public String actualFlag;
}

class LastNameENHistory {
    @JsonProperty("UpdateInfo")
    public UpdateInfo updateInfo;
    @JsonProperty("LastNameENData")
    public LastNameENData lastNameENData;
}

class FullNameENData {
    @JsonProperty("FullNameEN")
    public String fullNameEN;
    @JsonProperty("ActualFlag")
    public String actualFlag;
}

class FullNameENHistory {
    @JsonProperty("UpdateInfo")
    public UpdateInfo updateInfo;
    @JsonProperty("FullNameENData")
    public FullNameENData fullNameENData;
}

class GenderData {
    @JsonProperty("Gender")
    public String gender;
    @JsonProperty("ActualFlag")
    public String actualFlag;
}

class GenderHistory {
    @JsonProperty("UpdateInfo")
    public UpdateInfo updateInfo;
    @JsonProperty("GenderData")
    public GenderData genderData;
}

class DOBData {
    @JsonProperty("DOB")
    public String dOB;
    @JsonProperty("ActualFlag")
    public String actualFlag;
}

class DOBHistory {
    @JsonProperty("UpdateInfo")
    public UpdateInfo updateInfo;
    @JsonProperty("DOBData")
    public DOBData dOBData;
}

class NationalityData {
    @JsonProperty("Nationality")
    public String nationality;
    @JsonProperty("ActualFlag")
    public String actualFlag;
}

class NationalityHistory {
    @JsonProperty("UpdateInfo")
    public Object updateInfo;
    @JsonProperty("NationalityData")
    public NationalityData nationalityData;
}

class TitleData {
    @JsonProperty("Title")
    public String title;
    @JsonProperty("ActualFlag")
    public String actualFlag;
}

class TitleHistory {
    @JsonProperty("UpdateInfo")
    public UpdateInfo updateInfo;
    @JsonProperty("TitleData")
    public TitleData titleData;
}

class ResidentFlagData {
    @JsonProperty("ResidentFlag")
    public String residentFlag;
    @JsonProperty("ActualFlag")
    public String actualFlag;
}

class ResidentFlagHistory {
    @JsonProperty("UpdateInfo")
    public UpdateInfo updateInfo;
    @JsonProperty("ResidentFlagData")
    public ResidentFlagData residentFlagData;
}

class PassportData {
    @JsonProperty("PassportNo")
    public String passportNo;
    @JsonProperty("ActualFlag")
    public String actualFlag;
    @JsonProperty("PassportExpiryDate")
    public String passportExpiryDate;
}

class PassportHistory {
    @JsonProperty("UpdateInfo")
    public Object updateInfo;
    @JsonProperty("PassportData")
    public PassportData passportData;
}

class EmiratesIdData {
    @JsonProperty("EmiratesId")
    public String emiratesId;
    @JsonProperty("ActualFlag")
    public String actualFlag;
}

class EmiratesIdHistory {
    @JsonProperty("UpdateInfo")
    public ArrayList<UpdateInfo> updateInfo;
    @JsonProperty("EmiratesIdData")
    public EmiratesIdData emiratesIdData;
}

class AddressData {
    @JsonProperty("Emirate")
    public String emirate;
    @JsonProperty("Address")
    public String address;
    @JsonProperty("POBox")
    public String pOBox;
    @JsonProperty("ActualFlag")
    public String actualFlag;
    @JsonProperty("PlotNo")
    public String plotNo;
}

class AddressHistory {
    @JsonProperty("UpdateInfo")
    public Object updateInfo;
    @JsonProperty("AddressData")
    public AddressData addressData;
}

class ContactData {
    @JsonProperty("ContactType")
    public String contactType;
    @JsonProperty("Contact")
    public String contact;
    @JsonProperty("ActualFlag")
    public String actualFlag;
}

class ContactHistory {
    @JsonProperty("UpdateInfo")
    public Object updateInfo;
    @JsonProperty("ContactData")
    public ContactData contactData;
}

class MatchedSubject {
    @JsonProperty("CBSubjectId")
    public String cBSubjectId;
    @JsonProperty("ProviderSubjectNo")
    public String providerSubjectNo;
    @JsonProperty("Individual")
    public Individual individual;
}

class NumbersSummary {
    @JsonProperty("TotalNo")
    public String totalNo;
    @JsonProperty("DataProvidersNo")
    public String dataProvidersNo;
    @JsonProperty("RequestNo")
    public String requestNo;
    @JsonProperty("DeclinedNo")
    public String declinedNo;
    @JsonProperty("RejectedNo")
    public String rejectedNo;
    @JsonProperty("NotTakenUpNo")
    public String notTakenUpNo;
    @JsonProperty("ActiveNo")
    public String activeNo;
    @JsonProperty("ClosedNo")
    public String closedNo;
}

class KeyValuesSummary {
    @JsonProperty("TotalBalance")
    public String totalBalance;
    @JsonProperty("TotalOverdue")
    public String totalOverdue;
    @JsonProperty("DefaultAccountsNumber")
    public String defaultAccountsNumber;
    @JsonProperty("TotalOutstandingTelcoUtilities")
    public String totalOutstandingTelcoUtilities;
}

class ContractsSummary {
    @JsonProperty("TotalExposure")
    public String totalExposure;
    @JsonProperty("TotalExposureNonFunded")
    public String totalExposureNonFunded;
    @JsonProperty("CreditUtilizationRate")
    public String creditUtilizationRate;
    @JsonProperty("MaxCurrentPaymentDelay")
    public String maxCurrentPaymentDelay;
    @JsonProperty("MaxCurrentPaymentDelayContractType")
    public String maxCurrentPaymentDelayContractType;
    @JsonProperty("MaxPaymentDelay24M")
    public String maxPaymentDelay24M;
    @JsonProperty("MaxPaymentDelay24MContractType")
    public String maxPaymentDelay24MContractType;
    @JsonProperty("WorstStatus24M")
    public String worstStatus24M;
    @JsonProperty("OldestContractOpenDate")
    public String oldestContractOpenDate;
    @JsonProperty("NewestContractOpenDate")
    public String newestContractOpenDate;
    @JsonProperty("Applications90D")
    public String applications90D;
    @JsonProperty("TotalBalanceGuaranteed")
    public String totalBalanceGuaranteed;
    @JsonProperty("TotalOverdueGuaranteed")
    public String totalOverdueGuaranteed;
}

class NumbersSummaryTelcoUtilities {
    @JsonProperty("TotalNo")
    public String totalNo;
    @JsonProperty("DataProvidersNo")
    public String dataProvidersNo;
    @JsonProperty("RequestNo")
    public String requestNo;
    @JsonProperty("DeclinedNo")
    public String declinedNo;
    @JsonProperty("RejectedNo")
    public String rejectedNo;
    @JsonProperty("NotTakenUpNo")
    public String notTakenUpNo;
    @JsonProperty("ActiveNo")
    public String activeNo;
    @JsonProperty("ClosedNo")
    public String closedNo;
}

class TotalSummaries {
    @JsonProperty("NumbersSummary")
    public NumbersSummary numbersSummary;
    @JsonProperty("KeyValuesSummary")
    public KeyValuesSummary keyValuesSummary;
    @JsonProperty("ContractsSummary")
    public ContractsSummary contractsSummary;
    @JsonProperty("NumbersSummaryTelcoUtilities")
    public NumbersSummaryTelcoUtilities numbersSummaryTelcoUtilities;
}

class Holder {
    @JsonProperty("TotalNo")
    public String totalNo;
    @JsonProperty("DataProvidersNo")
    public String dataProvidersNo;
    @JsonProperty("RequestNo")
    public String requestNo;
    @JsonProperty("DeclinedNo")
    public String declinedNo;
    @JsonProperty("RejectedNo")
    public String rejectedNo;
    @JsonProperty("NotTakenUpNo")
    public String notTakenUpNo;
    @JsonProperty("ActiveNo")
    public String activeNo;
    @JsonProperty("ClosedNo")
    public String closedNo;
    @JsonProperty("PaymentAmount")
    public String paymentAmount;
    @JsonProperty("Balance")
    public String balance;
    @JsonProperty("OverdueAmount")
    public String overdueAmount;
    @JsonProperty("CreditLimit")
    public String creditLimit;
}

class Guarantor {
    @JsonProperty("TotalNo")
    public String totalNo;
    @JsonProperty("DataProvidersNo")
    public String dataProvidersNo;
    @JsonProperty("RequestNo")
    public String requestNo;
    @JsonProperty("DeclinedNo")
    public String declinedNo;
    @JsonProperty("RejectedNo")
    public String rejectedNo;
    @JsonProperty("NotTakenUpNo")
    public String notTakenUpNo;
    @JsonProperty("ActiveNo")
    public String activeNo;
    @JsonProperty("ClosedNo")
    public String closedNo;
    @JsonProperty("PaymentAmount")
    public String paymentAmount;
    @JsonProperty("Balance")
    public String balance;
    @JsonProperty("OverdueAmount")
    public String overdueAmount;
    @JsonProperty("CreditLimit")
    public String creditLimit;
}

class Summary {
    @JsonProperty("Holder")
    public Holder holder;
    @JsonProperty("Guarantor")
    public Guarantor guarantor;
}

class FinancialSummary {
    @JsonProperty("Holder")
    public Holder holder;
    @JsonProperty("Guarantor")
    public Guarantor guarantor;
}

class CommonData {
    @JsonProperty("CBContractId")
    public String cBContractId;
    @JsonProperty("ProviderNo")
    public String providerNo;
    @JsonProperty("ProviderContractNo")
    public String providerContractNo;
    @JsonProperty("ReferenceDate")
    public String referenceDate;
    @JsonProperty("ContractType")
    public String contractType;
    @JsonProperty("ActiveFlag")
    public String activeFlag;
    @JsonProperty("Role")
    public String role;
    @JsonProperty("OpenDate")
    public String openDate;
    @JsonProperty("ClosedDate")
    public String closedDate;
    @JsonProperty("WorstStatus")
    public String worstStatus;
    @JsonProperty("WorstStatusDate")
    public String worstStatusDate;
    @JsonProperty("MaxOverdueAmount")
    public String maxOverdueAmount;
    @JsonProperty("MaxOverdueAmountDate")
    public String maxOverdueAmountDate;
    @JsonProperty("OriginalCurrency")
    public String originalCurrency;
    @JsonProperty("CBApplicationId")
    public String cBApplicationId;
    @JsonProperty("ProviderApplicationNo")
    public String providerApplicationNo;
    @JsonProperty("ContractCategory")
    public String contractCategory;
    @JsonProperty("Phase")
    public String phase;
    @JsonProperty("EnquiryDate")
    public String enquiryDate;
    @JsonProperty("LastUpdateDate")
    public String lastUpdateDate;
}

class History {
    @JsonProperty("ReferenceDate")
    public String referenceDate;
    @JsonProperty("Balance")
    public String balance;
    @JsonProperty("OverdueAmount")
    public String overdueAmount;
    @JsonProperty("DaysPaymentDelay")
    public String daysPaymentDelay;
    @JsonProperty("ContractStatus")
    public String contractStatus;
    @JsonProperty("CreditLimit")
    public String creditLimit;
    @JsonProperty("UtilizationRate")
    public String utilizationRate;
    @JsonProperty("PaymentBehaviour")
    public String paymentBehaviour;
    @JsonProperty("MinimumPaymentFlag")
    public String minimumPaymentFlag;
    @JsonProperty("CardUsedFlag")
    public String cardUsedFlag;
    @JsonProperty("AmountSpent")
    public String amountSpent;
    @JsonProperty("PaymentDueDate")
    public String paymentDueDate;
    @JsonProperty("StatementDueAmount")
    public String statementDueAmount;
    @JsonProperty("ActualPaymentAmount")
    public String actualPaymentAmount;
    @JsonProperty("BilledAmount")
    public String billedAmount;
}

class Contract {
    @JsonProperty("CommonData")
    public CommonData commonData;
    @JsonProperty("TotalAmount")
    public String totalAmount;
    @JsonProperty("NoOfInstallments")
    public String noOfInstallments;
    @JsonProperty("NoOfRemainingInstallments")
    public String noOfRemainingInstallments;
    @JsonProperty("PaymentAmount")
    public String paymentAmount;
    @JsonProperty("PaymentFrequency")
    public String paymentFrequency;
    @JsonProperty("MaxDaysPaymentDelay")
    public String maxDaysPaymentDelay;
    @JsonProperty("MaxDaysPaymentDelayDate")
    public String maxDaysPaymentDelayDate;
    @JsonProperty("History")
    public ArrayList<History> history;
    @JsonProperty("SecuredContractFlag")
    public String securedContractFlag;
    @JsonProperty("FraudFlag")
    public String fraudFlag;
    @JsonProperty("IslamicContractFlag")
    public String islamicContractFlag;
    @JsonProperty("MinimumPaymentPercentage")
    public String minimumPaymentPercentage;
    @JsonProperty("CommunicationType")
    public String communicationType;
    @JsonProperty("HolderIsNotLiable")
    public String holderIsNotLiable;
    @JsonProperty("NoOfServices")
    public NoOfServices noOfServices;
}

class Installments {
    @JsonProperty("Summary")
    public Summary summary;
    @JsonProperty("FinancialSummary")
    public FinancialSummary financialSummary;
    @JsonProperty("Contract")
    public ArrayList<Contract> contract;
}

class NotInstallments {
    @JsonProperty("Summary")
    public Summary summary;
    @JsonProperty("FinancialSummary")
    public FinancialSummary financialSummary;
    @JsonProperty("Contract")
    public Contract contract;
}

class CreditCards {
    @JsonProperty("Summary")
    public Summary summary;
    @JsonProperty("FinancialSummary")
    public FinancialSummary financialSummary;
    @JsonProperty("Contract")
    public ArrayList<Contract> contract;
}

class NoOfServices {
    @JsonProperty("Mobile")
    public String mobile;
    @JsonProperty("FixedLine")
    public String fixedLine;
    @JsonProperty("Other")
    public String other;
}

class Services {
    @JsonProperty("Summary")
    public Summary summary;
    @JsonProperty("FinancialSummary")
    public FinancialSummary financialSummary;
    @JsonProperty("Contract")
    public ArrayList<Contract> contract;
}

class Utilities {
    @JsonProperty("Summary")
    public Summary summary;
}

class Application {
    @JsonProperty("CommonData")
    public CommonData commonData;
    @JsonProperty("TotalAmount")
    public String totalAmount;
    @JsonProperty("NoOfInstallments")
    public String noOfInstallments;
    @JsonProperty("CreditLimit")
    public String creditLimit;
}

class ContractData {
    @JsonProperty("TotalSummaries")
    public TotalSummaries totalSummaries;
    @JsonProperty("Installments")
    public Installments installments;
    @JsonProperty("NotInstallments")
    public NotInstallments notInstallments;
    @JsonProperty("CreditCards")
    public CreditCards creditCards;
    @JsonProperty("Services")
    public Services services;
    @JsonProperty("Utilities")
    public Utilities utilities;
    @JsonProperty("Application")
    public ArrayList<Application> application;
}

class EmploymentInfo {
    @JsonProperty("Name")
    public String name;
    @JsonProperty("DateOfEmployment")
    public String dateOfEmployment;
    @JsonProperty("GrossAnnualIncome")
    public String grossAnnualIncome;
    @JsonProperty("EmploymentType")
    public String employmentType;
    @JsonProperty("ActualFlag")
    public String actualFlag;
}

class EmploymentHistory {
    @JsonProperty("UpdateInfo")
    public ArrayList<UpdateInfo> updateInfo;
    @JsonProperty("EmploymentInfo")
    public EmploymentInfo employmentInfo;
}

class OtherIncomeData {
    @JsonProperty("Source")
    public String source;
    @JsonProperty("GrossAnnualAmount")
    public String grossAnnualAmount;
}

class OtherIncome {
    @JsonProperty("UpdateInfo")
    public UpdateInfo updateInfo;
    @JsonProperty("OtherIncomeData")
    public OtherIncomeData otherIncomeData;
}

class PaymentOrder {
    @JsonProperty("ProviderNo")
    public String providerNo;
    @JsonProperty("Type")
    public String type;
    @JsonProperty("IBAN")
    public String iBAN;
    @JsonProperty("Number")
    public String number;
    @JsonProperty("Amount")
    public String amount;
    @JsonProperty("ReasonCode")
    public String reasonCode;
    @JsonProperty("ReturnDate")
    public String returnDate;
    @JsonProperty("Severity")
    public String severity;
    @JsonProperty("ReferenceDate")
    public String referenceDate;
}

class Data {
    @JsonProperty("Index")
    public String index;
    @JsonProperty("Range")
    public String range;
}

class Score {
    @JsonProperty("Data")
    public Data data;
    @JsonProperty("PaymentOrderFlag")
    public String paymentOrderFlag;
}

class Response {
    @JsonProperty("MatchedSubject")
    public MatchedSubject matchedSubject;
    @JsonProperty("ContractData")
    public ContractData contractData;
    @JsonProperty("EmploymentHistory")
    public EmploymentHistory employmentHistory;
    @JsonProperty("OtherIncome")
    public OtherIncome otherIncome;
    @JsonProperty("PaymentOrder")
    public PaymentOrder paymentOrder;
    @JsonProperty("Score")
    public Score score;
}

class NAERES {
    @JsonProperty("ResponseId")
    public String responseId;
    @JsonProperty("NewApplication")
    public NewApplication newApplication;
    @JsonProperty("EnquiredSubject")
    public EnquiredSubject enquiredSubject;
    @JsonProperty("Response")
    public Response response;
}


