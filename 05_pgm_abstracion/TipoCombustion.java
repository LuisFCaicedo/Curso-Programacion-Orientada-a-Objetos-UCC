public class TipoCombustion extends vehiculo {

    public TipoCombustion() {
        super();
        setTipo("Combustion");
    }

    @Override
    public void startingEngine(){
        System.out.println("โ Check Fuel...โฝ");
        for (int i = 0; i < 3 ; i++) {
            System.out.println("ยกยก๐ฅ Spark...๐ฅ!!");
            try {
                Thread.sleep(1000-(i*200));
            } catch (InterruptedException e) {
                System.err.println("๐:"+ e);
            }
        }
        System.out.println("Started...๐");
    }

    @Override
    public void stopingEngine() {
        System.out.println("โ Check Engine ๐");
        for (int i = 0; i < 2 ; i++) {
            System.out.println("ยกยก๐ Stoping Engine...๐!!");
            try {
                Thread.sleep(1000-(i*400));
            } catch (InterruptedException e) {
                System.err.println("๐:"+ e);
            }
        }
        System.out.println("Stoped...๐");        
    }

    public String toString() {
        return "Objeto TipoCombustion []";
    }
}