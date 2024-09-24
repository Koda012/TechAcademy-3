package room;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Room {
    private Boolean hasKey;
    private Boolean doorOpen;
    private List<String> inventory;
    private Connection connection;

    public Room(Connection connection) {
        this.hasKey = false;
        this.doorOpen = false;
        this.inventory = new ArrayList<>();
        this.connection = connection;
    }

    public void lookAround() {
        System.out.println(getPhrase("look_around"));
    }

    public void examineBed() {
        System.out.println(getPhrase("examine_bed"));
    }

    public void examineStone() {
        if (!hasKey) {
            System.out.println(getPhrase("found_key"));
        } else {
            System.out.println(getPhrase("already_has_key"));
        }
    }

    public void pickKey() {
        if (!hasKey) {
            hasKey = true;
            inventory.add("Chave");
            System.out.println(getPhrase("pick_key"));
        } else {
            System.out.println(getPhrase("already_picked_key"));
        }
    }

    public void examineDoor() {
        System.out.println(getPhrase("examine_door"));
    }

    public boolean useKey() {
        if (hasKey) {
            System.out.println(getPhrase("use_key_success"));
            doorOpen = true;
            return true;
        } else {
            System.out.println(getPhrase("use_key_fail"));
            return false;
        }
    }

    public Boolean hasKey() {
        return hasKey;
    }

    public void setHasKey(Boolean hasKey) {
        this.hasKey = hasKey;
    }

    public Boolean isDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(Boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public String getDescription() {
        return "Cela de pedra com uma cama e uma porta de ferro.";
    }

    private String getPhrase(String phraseKey) {
        String phrase = "Frase não encontrada.";
        try {
            String query = "SELECT phrase FROM game_frases WHERE phrase_key = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, phraseKey);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                phrase = rs.getString("phrase");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar a frase: " + e.getMessage());
        }
        return phrase;
    }
}
