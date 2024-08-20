package DesignPatterns.Factory.componnet.dropdown;

public class IOSDropdown implements DropDown{
    @Override
    public void clickDropdown() {
        System.out.println("Clicking IOS dropdown");
    }
}
