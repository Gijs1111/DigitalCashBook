package personal.gijsdewert.cashbook.models;

import org.w3c.dom.Text;
import personal.gijsdewert.cashbook.enums.TransactionCodes;
import personal.gijsdewert.cashbook.enums.TransactionType;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {

    private Long id;
    private Date transactionDate;
    private String description;
    private String account;
    private String contraAccount;
    private TransactionCodes transactionCode;
    private TransactionType transactionType;
    private BigDecimal amount;
    private String mutationType;
    private Text announcement;

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getContraAccount() {
        return contraAccount;
    }

    public void setContraAccount(String contraAccount) {
        this.contraAccount = contraAccount;
    }

    public TransactionCodes getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(TransactionCodes transactionCode) {
        this.transactionCode = transactionCode;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getMutationType() {
        return mutationType;
    }

    public void setMutationType(String mutationType) {
        this.mutationType = mutationType;
    }

    public Text getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Text announcement) {
        this.announcement = announcement;
    }
}
