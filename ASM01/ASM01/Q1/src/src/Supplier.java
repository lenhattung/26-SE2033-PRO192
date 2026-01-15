/*
 * Click nbfs//nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Supplier {

    private int id;
    private String name;
    private String address;
    private String phone;
    private boolean status;

    public Supplier() {
        setId(0);
        setName("");
        setAddress("");
        setPhone("");
    }

    public Supplier(int id, String name, String address, String phone) {
        setId(id);
        setName(name);
        setAddress(address);
        setPhone(phone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 5 && name.length() <= 50) {
            this.name = name;
            this.status = true;
        } else {
            this.name = "no name";
            this.status=false;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        boolean isValid = false;
        if (phone != null) {
            if (phone.startsWith("0")) {
                if (phone.length() == 9 || phone.length() == 10) {
                    isValid = true;
                }
            }
        }
        this.phone = (isValid) ? phone : "000.000.0000";
    }

    public boolean isStatus() {
        return status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", status=" + status + '}';
    }

}
