package com.transfer.transferbank.entity;

public class TransferInquiryDto {
    
    private String fromAccount;
    private String toAccount;
    private String ipAddress;
    private String amount;
    private String currency;
    private String adminFee;
    private String bankDestinantionCode;

    public TransferInquiryDto(){

    }

    public TransferInquiryDto(String fromAccount, String toAccount, String ipAddress, String amount, String currency, String adminFee, String bankDestinantionCode) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.ipAddress = ipAddress;
        this.amount = amount;
        this.currency = currency;
        this.adminFee = adminFee;
        this.bankDestinantionCode = bankDestinantionCode;
    }

    public String getFromAccount() {
        return fromAccount;
    }
    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }
    public String getToAccount() {
        return toAccount;
    }
    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }
    public String getIpAddress() {
        return ipAddress;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getAdminFee() {
        return adminFee;
    }
    public void setAdminFee(String adminFee) {
        this.adminFee = adminFee;
    }
    public String getBankDestinantionCode() {
        return bankDestinantionCode;
    }
    public void setBankDestinantionCode(String bankDestinantionCode) {
        this.bankDestinantionCode = bankDestinantionCode;
    }


    


}
