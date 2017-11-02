package indi.twc.design.proxy;

public class ProxyImage implements Image {
    private RealImage realImage;

    public ProxyImage(String fileName){
        realImage = new RealImage(fileName);
    }

    @Override
    public void display() {
        realImage.display();
    }
}
