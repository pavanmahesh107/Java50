package DesignPatterns.Factory;

public class UIFactoryFactory {
    
    // Helper class to UiFactroy to maintain OCP & SRP but not completely.
    public static UIFactory getUIFactoryForplatform(Supportedplatforms platform){
        if(platform.equals(Supportedplatforms.ANDROID)){
            return new AndroidUIFactory();
        } else if (platform.equals(Supportedplatforms.IOS)) {
            return new IOSUIFactory();
        } else if (platform.equals(Supportedplatforms.WINDOWS)) {
            return new WindowsUIFactory();
        }
        return null;
    }
}
