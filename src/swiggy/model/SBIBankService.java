package swiggy.model;

import java.util.Date;
import java.util.UUID;

public class SBIBankService {

    private String accountNo = "0987";
    private double amt = 6000;
    private String merchantAccountNo = "9999";
    private double merchantAmt = 3000;


    public PaymentResponse transfer(PaymentRequest request) {
        System.out.println(request.getTxId());
        if (request.isMerchantDebit()) {
            merchantAmt = merchantAmt - request.getAmt();
            amt = amt + request.getAmt();
        } else {
            amt = amt - request.getAmt();
            merchantAmt = merchantAmt + request.getAmt();
        }

        PaymentResponse response = new PaymentResponse(UUID.randomUUID().toString(),"Success",new Date());
        return response;
    }
}
