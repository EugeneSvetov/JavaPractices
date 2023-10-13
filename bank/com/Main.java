import com.entities.Account;
import com.entities.Bill;
import com.entities.Person;
import com.services.DepositService;
import com.services.PaymentService;
import com.services.TransferService;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        DepositService depositService = new DepositService();
        TransferService transferService = new TransferService();

        Person CubearaPerson = new Person("кубара", "мурадова", "+78662063800");
        Bill CubearaBill = new Bill(5500);
        Account CubearaAccount = new Account(CubearaBill, CubearaPerson);

        Person LizaPerson = new Person("лиза", "мазурок", "+79662060380");
        Bill LizaBill = new Bill(1550);
        Account LizaAccount = new Account(LizaBill, LizaPerson);


        paymentService.pay(CubearaAccount, 500);
        depositService.deposit(CubearaAccount, 5000);
        transferService.transfer(LizaAccount, CubearaAccount, 4000);


        paymentService.pay(LizaAccount, 500);
        depositService.deposit(LizaAccount, 5000);
        transferService.transfer(CubearaAccount, LizaAccount, 4000);


    }
}