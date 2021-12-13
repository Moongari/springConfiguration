public class MyClassSingleton {

    //static Singleton instance
    private static volatile MyClassSingleton instance;

    //private contructor for Singleton
    private MyClassSingleton(){}


    //return a singleton instance of MyClassSingleton

    public static MyClassSingleton getInstance(){

        if( instance== null){
            synchronized (MyClassSingleton.class){
                if(instance== null){
                    instance = new MyClassSingleton();
                }
            }
        }
        return instance;
    }

    public void afficher(){
        System.out.println("je suis singleton");
    }
}
