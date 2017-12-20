class SerVivo {
    String getNome() {
        return "Meu nome";
    }

    void falar() {
        System.out.println("Falando...");
    }
}

class SerHumano extends SerVivo {
    void falar() {
        System.out.println("[SER HUMANO] Olá, tudo bem?");
    }
}

class Macaco extends SerVivo {
    void falar() {
        System.out.println("[MACACO] UH UH UH AH AH");
    }
}

class Pato extends SerVivo {
    void falar() {
        System.out.println("[PATO] Quack quack!");
    }
}

class Falador {
    void falar(SerVivo[] arraySV) {
        for(SerVivo servivo: arraySV) {
            servivo.falar();
        }
    }
}

class Jogo {
    public static void main(String[] args) {
        
        SerVivo caue = new SerHumano();
        SerVivo kako = new Macaco();
        SerVivo donald = new Pato();

        Falador falador = new Falador();

        SerVivo[] array = new SerVivo[3];

        array[0] = caue;
        array[1] = kako;
        array[2] = donald;
        
        falador.falar(array);
    }
}