public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ImageProxy("house1.jpg");

        image.displayThumbnail(); 
        image.displayFullImage(); 

        System.out.println("---");

        AgentImageUploader agent1 = new AgentImageUploader(true);
        agent1.uploadImage("villa.png");

        AgentImageUploader guest = new AgentImageUploader(false);
        guest.uploadImage("fake.png");
    }
}

