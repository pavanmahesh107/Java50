package DesignPatterns.Factory;

import DesignPatterns.Factory.componnet.button.Button;
import DesignPatterns.Factory.componnet.button.IOSButton;
import DesignPatterns.Factory.componnet.dropdown.DropDown;
import DesignPatterns.Factory.componnet.dropdown.IOSDropdown;
import DesignPatterns.Factory.componnet.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropdown();
    }
}
