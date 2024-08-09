public class School {
    private String name;
    private String address;
    private String lyceum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLyceum() {
        return lyceum;
    }

    public void setLyceum(String lyceum) {
        this.lyceum = lyceum;
    }

    public String getSchool(){
        return String.format("""
                name: %s
                address: %s
                lyceum: %s
                """, name, address, lyceum);
    }
}
