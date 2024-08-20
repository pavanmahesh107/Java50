package DesignPatterns.Factory.componnet.button;

public class AndroidButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing android button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking android button");
    }
}
