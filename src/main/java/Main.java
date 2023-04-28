import client.ClientService;
import org.example.DatabaseInitService;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connectionDb = DatabaseInitService.getInstanse().getConnection();
        ClientService clientService = new ClientService(connectionDb);
    }
}