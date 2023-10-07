public class Main {
    public static void main(String[] args) {
        Bill BillKirill = new Bill(10000);
        Client Kirill = new Client("Кирилл","Червячукин", "+79662060380","hzneznau@mail.ru", BillKirill);

        Bill BillNastya = new Bill(15000);
        Client Nastya = new Client("Настя","Анонова", "+89662060380","nepridumal@mail.ru", BillNastya);

        Room[] hotelRooms = new Room[]{new Room(7, 5000, true),
                                       new Room(2, 600, true),
                                       new Room(5, 2000, false)
        };
        Hotel Hotel = new Hotel("RICH", hotelRooms);
        BookingService bookingService = new BookingService();
        bookingService.book(Hotel, Kirill, 2);
        System.out.println("\n");
        bookingService.book(Hotel, Nastya, 7);

    }
}
