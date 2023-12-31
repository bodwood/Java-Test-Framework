package drivers.strategies;

import utils.Constants;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy){
        switch(strategy){
            case Constants.CHROME:
                return new Chrome();
            case Constants.FIREFOX:
                return new Firefox();
            case Constants.PHANTOM_JS:
                return new PhantomJs();
            default:
                return null;
        }
    }
}
