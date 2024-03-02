package swiggy.model;

import swiggy.SwiggyPaymentService;

import java.util.UUID;

public class PhonePayService implements SwiggyPaymentService {
    public PaymentResponse payment (PaymentRequest request){
        PaymentRequest paymentInitiationRequest = new PaymentRequest("SWIGGY"+ UUID.randomUUID().toString(), request.getAmt(),
                request.getTxnDate(), "9999", false);
        SBIBankService sbiBankService = new SBIBankService();

        return sbiBankService.transfer(paymentInitiationRequest);

    }
}
