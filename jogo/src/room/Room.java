package room;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Room {

    private Connection connection;
    private int roomNumber;
    private boolean hasKey;
    private boolean hasHammer;
    private boolean hasCrowbar;
    private boolean doorOpen;
    private List<String> inventory;

    public Room(Connection connection, int roomNumber) {
        this.connection = connection;
        this.roomNumber = roomNumber;
        this.hasKey = false;
        this.hasHammer = false;
        this.hasCrowbar = false;
        this.doorOpen = false;
        this.inventory = new ArrayList<>();
    }

    public void lookAround() {
        System.out.println("Você está na sala " + roomNumber + ". Olhando ao redor, você vê um armário, uma cama, uma porta e uma pedra.");
    }

    public void examineBed() {
        System.out.println("Você examina a cama e encontra uma chave (pode ser que possa abrir o armario).");
    }

    public void examineCabinet() {
        System.out.println("Você examina o armário. Parece que está trancado.");
    }

    public void openCabinet() {
        if (!hasKey) {
            System.out.println("O armário está trancado. Você precisa de uma chave para abri-lo.");
        } else {
            System.out.println("Você usa a chave e abre o armário. Dentro, você encontra uma marreta e um pé de cabra.");
            hasHammer = true;
            hasCrowbar = true;
            inventory.add("marreta");
            inventory.add("pé de cabra");
        }
    }

    public void pickKey() {
        if (!hasKey) {
            hasKey = true;
            inventory.add("chave");
            System.out.println("Você pegou a chave.");
        } else {
            System.out.println("Você já pegou a chave.");
        }
    }

    public void examineStone() {
        System.out.println("Você examina a pedra e percebe que essa é pesada.");
    }

    public void examineDoor() {
        if (!doorOpen) {
            System.out.println("A porta está trancada. Talvez haja uma maneira de abri-la.");
        } else {
            System.out.println("A porta já está aberta.");
        }
    }

    public boolean useKeyOnStoneDoor() {
        if (hasKey) {
            doorOpen = true;
            System.out.println("Você usou a chave na porta e ela se abriu!");
            return true;
        } else {
            System.out.println("Você não tem a chave.");
            return false;
        }
    }

    public boolean useHammerOnWoodenDoor() {
        if (hasHammer) {
            doorOpen = true;
            System.out.println("Você usou a marreta e destruiu a porta de madeira!");
            return true;
        } else {
            System.out.println("Você não tem uma marreta.");
            return false;
        }
    }

    public boolean useCrowbarOnMetalDoor() {
        if (hasCrowbar) {
            doorOpen = true;
            System.out.println("Você usou o pé de cabra e forçou a porta de metal!");
            return true;
        } else {
            System.out.println("Você não tem um pé de cabra.");
            return false;
        }
    }

    public List<String> getInventory() {
        return inventory;
    }

    public boolean hasKey() {
        return hasKey;
    }

    public void setHasKey(boolean hasKey) {
        this.hasKey = hasKey;
    }

    public boolean hasHammer() {
        return hasHammer;
    }

    public void setHasHammer(boolean hasHammer) {
        this.hasHammer = hasHammer;
    }

    public boolean hasCrowbar() {
        return hasCrowbar;
    }

    public void setHasCrowbar(boolean hasCrowbar) {
        this.hasCrowbar = hasCrowbar;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }
}
