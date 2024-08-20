package DesignPatterns.Factory;

public class Flutter {

    private String platform;

    // Non-factory pattern methods

    public void refreshUI(){
        System.out.println("Refreshing UI");
    }

    public void setTheme(){
        System.out.println("Setting the Theme");
    }

    public static UIFactory getUIFactory(Supportedplatforms platform){
        return UIFactoryFactory.getUIFactoryForplatform(platform);
    }
}
