public class Laptop {
    private int hdd_volume;
    private int ram_volume;
    private String os_type;
    private String color;
    public Laptop(int hdd_volume, int ram_volume, String os_type, String color) {
        this.hdd_volume = hdd_volume;
        this.ram_volume = ram_volume;
        this.os_type = os_type;
        this.color = color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + hdd_volume;
        result = prime * result + ((os_type == null) ? 0 : os_type.hashCode());
        result = prime * result + ram_volume;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (hdd_volume != other.hdd_volume)
            return false;
        if (os_type == null) {
            if (other.os_type != null)
                return false;
        } else if (!os_type.equals(other.os_type))
            return false;
        return ram_volume == other.ram_volume;
    }

    public int getHDDvolume() {
        return hdd_volume;
    }

    public void setHDDvolume(int volume) {
        this.hdd_volume = volume;
    }

    public int getRAMvolume() {
        return ram_volume;
    }

    public void setRAMvolume(int volume) {
        this.ram_volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOStype() {
        return os_type;
    }

    public void setOStype(String type) {
        this.os_type = type;
    }

    @Override
    public String toString() {
        return "module6.Laptop{color=" + color + ", hdd_volume=" + hdd_volume + ", " +
                "ram_volume=" + ram_volume+",  os_type=" + os_type+ "}";
    }
}