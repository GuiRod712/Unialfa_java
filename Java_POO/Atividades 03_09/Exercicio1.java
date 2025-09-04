class Animal {
    public String nome;
    public String peso;
    public String raca;

    public void emitirSom() {
        System.out.println("O animal faz um som genérico.");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }
}
class Camelo extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O Camelo blatera: brãããã!");
    }
}
class Cavalo extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O Cavalo relincha: IHHHH RARARA!");
    }
}
class Tubarao extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O tubarão emite onda sonora: shhhh !");
    }
}
public class Heranca2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.emitirSom();

        Cachorro c = new Cachorro();
        c.nome = "Rex";
        c.emitirSom();
        c.peso = "15";
        c.raca = "Husky";
        System.out.println("Nome do cachorro: " + c.nome + ", Peso: " + c.peso + "kg, Raça: " + c.raca);


        Gato g = new Gato();
        g.nome = "Mimi";
        g.emitirSom();
        g.peso = "5";
        g.raca = "Siames";
        System.out.println("Nome do gato: " + g.nome + ", Peso: " + g.peso + "kg, Raça: " + g.raca);
        
        
        Camelo cm = new Camelo();
        cm.nome = "Roger";
        cm.emitirSom();
        cm.peso = "112";
        cm.raca = "Desertico";
        System.out.println("Nome do Camelo: " + cm.nome + ", Peso: " + cm.peso + "kg, Raça: " + cm.raca);
        
        Cavalo cv = new Cavalo();
        cv.nome = "Lux";
        cv.emitirSom();
        cv.peso = "150";
        cv.raca = "Arabe";
        System.out.println("Nome do cavalo: " + cv.nome + ", Peso: " + cv.peso + "kg, Raça: " + cv.raca);



    }
}
