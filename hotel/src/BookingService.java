import static javax.management.Query.and;

public class BookingService {

    private boolean check(Room[] rooms) {
        int countFreeRooms = 0;
        for (Room r : rooms) {
            if (r.isFree()) {
                countFreeRooms += 1;
            }
        }
        if (countFreeRooms == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void book(Hotel hotel, Client client, int numberOfPerson) {
        Room[] rooms = hotel.getRooms();
        String name = client.getName();
        boolean success = false;
        if (check(rooms)) {
            for (Room r : rooms) {
                if ((r.getNumberOfPerson() == numberOfPerson) && (r.isFree())) {
                    System.out.println("Нашелся свободный номер");
                    success = true;
                    if (client.getBill().getAmount() >= r.getCost()) {
                        Bill clientBill = client.getBill();
                        clientBill.setAmount(clientBill.getAmount() - r.getCost());
                        r.setFree(false);
                        System.out.println("Успешно забронил " + name);
                    } else {
                        System.out.println("Недостаточно средств для бронирования у " + name);
                    }
                }
            }
            if (!success) {
                System.out.println("Не нашлось подходящего для " + name);
            }
        } else {
            System.out.println("Свободных номеров в отеле " + hotel.getName() + " нет");
        }
    }
}
