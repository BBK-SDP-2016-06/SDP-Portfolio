package adapter;

public class PayDToXpayAdapter implements Xpay{

    private PayD payD;
    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;

    public PayDToXpayAdapter(PayD payD) {
        this.payD = payD;
        populateFields();
    }

    private void populateFields() {
        setCreditCardNo(this.payD.getCustCardNo());
        setCustomerName(this.payD.getCardOwnerName());
        String s = this.payD.getCardExpMonthDate();
        setCardExpMonth(s.substring(0, s.indexOf('/')));
        setCardExpYear(s.substring(s.indexOf('/') + 1));
        setCardCVVNo(this.payD.getCVVNo().shortValue());
        setAmount(this.payD.getTotalAmount());
    }

    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String getCardExpMonth() {
        return cardExpMonth;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return cardExpYear;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    @Override
    public Short getCardCVVNo() {
        return cardCVVNo;
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }

    @Override
    public Double getAmout() {
        return amount;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
