import java.util.Date;

public class Loan {
    private int loadID;
    private int bookID;
    private int memberID;
    private Date checkoutDate;
    private Date dueDate;
    private Date returnDate;

    public int getLoadID() {
        return loadID;
    }
    public void setLoadID(int loadID) {
        this.loadID = loadID;
    }
    public int getBookID() {
        return bookID;
    }
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
    public int getMemberID() {
        return memberID;
    }
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
    public Date getCheckoutDate() {
        return checkoutDate;
    }
    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
    public Date getDueDate() {
        return dueDate;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void newLoan(Book book, Member memberID) {

    }
}
