import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Room {
    private boolean hasKey;
    private boolean doorOpen;
    private Connection connection;  

    public Room(Connection connection) {
        this.hasKey = false;
        this.doorOpen = false;
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

    public boolean hasKey() {
        return hasKey;
    }

    public boolean isDoorOpen() {
        return doorOpen;
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