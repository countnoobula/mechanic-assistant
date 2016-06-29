package core;

import core.gui.MWindow;

public class Engine {
    private static Engine instance;
    private MWindow window;
    
    private Engine() {
        
    }
    
    public static Engine getInstance() {
        if(instance == null) {
            instance = new Engine();
        }
        return instance;
    }
    
    public void start() {
        window = new MWindow();
        window.setVisible(true);
    }
    
    // AFAAMGC41AR106340
    public CarInfo decodeVIN(String vin) {
        vin = vin.toUpperCase();
        if(vin.length() != 17 || vin.contains("I") || vin.contains("O") || vin.contains("Q")) {
            return null;
        }
        
        CarInfo carInfo = new CarInfo();
        carInfo.setCountry(getCountry(vin.substring(0, 3)));
        
        return carInfo;
    }
    
    public String getCountry(String vin) {
        String country = "";
        
        // @todo
        System.out.println("Fetching country for: " + vin);
        
        return country;
    }
}
