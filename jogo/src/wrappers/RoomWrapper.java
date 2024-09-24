package wrappers;

import room.Room;

public class RoomWrapper {
    private Room room;

    public RoomWrapper(Room room) {
        this.room = room;
    }


    public void handleCommand(String command) {
        switch (command) {
            case "OLHAR AO REDOR":
                room.lookAround();
                break;
            case "EXAMINAR CAMA":
                room.examineBed();
                break;
            case "EXAMINAR PEDRA":
                room.examineStone();
                break;
            case "PEGAR CHAVE":
                room.pickKey();
                break;
            case "EXAMINAR PORTA":
                room.examineDoor();
                break;
            case "USAR CHAVE NA PORTA":
                room.useKey();
                break;
            default:
                System.out.println("Comando não reconhecido.");
                break;
        }
    }


    public void showInventory() {
        System.out.println("Inventário: " + room.getInventory());
    }


    public void describeRoom() {
        System.out.println(room.getDescription());
    }
}
