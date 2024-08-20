package DesignPatterns.Factory;

import DesignPatterns.Factory.componnet.button.AndroidButton;
import DesignPatterns.Factory.componnet.button.Button;
import DesignPatterns.Factory.componnet.dropdown.AndroidDropdown;
import DesignPatterns.Factory.componnet.dropdown.DropDown;
import DesignPatterns.Factory.componnet.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropdown();
    }
}
