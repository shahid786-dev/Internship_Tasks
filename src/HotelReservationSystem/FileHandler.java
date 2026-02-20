package HotelReservationSystem;

import java.io.*;
import java.util.*;

public class FileHandler {

    public static void saveReservation(Reservation reservation) {
        try (FileWriter fw = new FileWriter("reservations.txt", true)) {
            fw.write(reservation.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving reservation.");
        }
    }

    public static List<String> readReservations() {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("reservations.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading reservations.");
        }
        return list;
    }
}

