package org.example;

import org.flywaydb.core.Flyway;

public class DatabaseMigrationServise {
    public static void main(String[] args) {
        // Create the Flyway instance and point it to the database
        Flyway flyway = Flyway
                .configure()
                .dataSource("jdbc:h2:./test1", null, null)
                .load();

        // Start the migration
        flyway.migrate();
    }
}