package swiggy.model;

import java.util.Date;

public class PaymentRequest {
    private String txId;
    private double amt;
    private Date txnDate;
    private String merchantId;
    private boolean isMerchantDebit;


    public PaymentRequest( double amt, Date txnDate){

        this.amt = amt;
        this.txnDate = txnDate;
    }

    public PaymentRequest(String txId, double amt, Date txnDate, String merchantId, boolean isMerchantDebit) {
        this.txId = txId;
        this.amt = amt;
        this.txnDate = txnDate;
        this.merchantId = merchantId;
        this.isMerchantDebit = isMerchantDebit;
    }

    public String getTxId() {
        return txId;
    }

    public double getAmt() {
        return amt;
    }

    public Date getTxnDate() {
        return txnDate;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public boolean isMerchantDebit() {
        return isMerchantDebit;
    }
}
