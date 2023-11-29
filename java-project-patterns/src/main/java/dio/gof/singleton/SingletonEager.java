package dio.gof.singleton;

/**
 * Singleton "apressado"
 */
public class SingletonEager {
    //singleton "apressado" já instancia a váriavel, ao contrário do "preguiçoso"
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){
        super(); //não necessário declarar
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
