package access;

public class Access {
    public String publicData = "Dữ liệu public";

    protected String protectedData = "Dữ liệu protected";

    String packageData = "Dữ liệu package-private";

    private String privateData = "Dữ liệu private";

    public void displayData() {
        System.out.println("Public Data: " + publicData);
        System.out.println("Protected Data: " + protectedData);
        System.out.println("Package Data: " + packageData);
        System.out.println("Private Data: " + privateData);
    }
}


