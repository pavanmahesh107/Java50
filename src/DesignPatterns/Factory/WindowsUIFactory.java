package DesignPatterns.Factory;

import DesignPatterns.Factory.componnet.button.Button;
import DesignPatterns.Factory.componnet.button.WindowsButton;
import DesignPatterns.Factory.componnet.dropdown.DropDown;
import DesignPatterns.Factory.componnet.dropdown.WindowsDropdown;
import DesignPatterns.Factory.componnet.menu.Menu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropdown();
    }
}
