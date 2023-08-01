public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy){
        switch(strategy){
            case "Chrome":
                return new Chrome();
            case "Firefox":
                return new Firefox();
            case "PhantomJs":
                return new PhantomJs();
            default:
                return null;
        }
    }
}
