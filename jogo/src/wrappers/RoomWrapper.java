package wrappers;

public class RoomWrapper {

    private boolean isCabinetOpen;
    private boolean hasKey;
    private boolean doorOpen;

    public RoomWrapper() {
        this.isCabinetOpen = false;
        this.hasKey = false;
        this.doorOpen = false;
    }

    public String examineCabinet() {
        return "Você vê um armário velho. Parece que pode estar trancado.";
    }

    public String openCabinet() {
        if (!isCabinetOpen) {
            isCabinetOpen = true;
            return "Você abriu o armário e encontrou um pé de cabra e uma marreta.";
        } else {
            return "O armário já está aberto.";
        }
    }

    public String examineDoor() {
        if (!doorOpen) {
            return "A porta é de metal pesado e está trancada.";
        } else {
            return "A porta já está aberta.";
        }
    }

    public String useKey() {
        if (hasKey) {
            doorOpen = true;
            return "Você usou a chave para abrir a porta!";
        } else {
            return "Você não tem a chave para abrir a porta.";
        }
    }

    public void findKey() {
        this.hasKey = true;
    }
}
