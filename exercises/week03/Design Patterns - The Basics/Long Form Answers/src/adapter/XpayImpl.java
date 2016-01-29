package adapter;

@lombok.Data
public class XpayImpl implements Xpay {

    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;

}
