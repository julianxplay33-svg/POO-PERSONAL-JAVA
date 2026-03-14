public class animales {

    public static void main(String[] args) {

        Animal a1 = new Perro();
        Animal a2 = new Gato();
        Animal a3 = new Caballo();
        Animal a4 = new Mono();
        Animal a5 = new Dinosaurio();

        a1.sonido();
        a2.sonido();
        a3.sonido();
        a4.sonido();
        a5.sonido();
    }
}

class Animal {
    void sonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    void sonido() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {
    void sonido() {
        System.out.println("El gato maúlla");
    }
}

class Caballo extends Animal {
    void sonido() {
        System.out.println("El caballo relincha");
    }
}

class Mono extends Animal {
    void sonido() {
        System.out.println("El mono gruñe");
    }
}

class Dinosaurio extends Animal {
    void sonido() {
        System.out.println("El dinosaurio ruge");
    }
}
