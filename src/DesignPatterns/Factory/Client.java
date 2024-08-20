package DesignPatterns.Factory;

import DesignPatterns.Factory.componnet.button.Button;
import DesignPatterns.Factory.componnet.dropdown.DropDown;

public class Client {
    public static void main(String[] args) {

        Flutter flutter = new Flutter();

        UIFactory uiFactory = flutter.getUIFactory(Supportedplatforms.ANDROID);

        Button button = uiFactory.createButton();
        button.clickButton();

        DropDown dropDown = uiFactory.createDropDown();
        dropDown.clickDropdown();
    }
}
