public class AgentImageUploader {
    private boolean loggedIn;

    public AgentImageUploader(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public void uploadImage(String imageName) {
        if (loggedIn) {
            System.out.println("Agent uploaded: " + imageName);
        } else {
            System.out.println("Access denied. Please log in to upload images.");
        }
    }
}
