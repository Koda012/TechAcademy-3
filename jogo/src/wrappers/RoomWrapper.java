package wrappers;

import room.Room;

public class RoomWrapper {
    private Room room;

    public RoomWrapper(Room room) {
        this.room = room;
    }

    // Método que faz o jogador interagir com os objetos da sala
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

    // Wrapper para pegar o inventário da sala
    public void showInventory() {
        System.out.println("Inventário: " + room.getInventory());
    }

    // Wrapper para pegar a descrição da sala
    public void describeRoom() {
        System.out.println(room.getDescription());
    }
}
