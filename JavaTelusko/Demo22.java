public class Demo22 {
    // 07:22:43 Object Class equals toString hashcode 
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Dell XPS 13";
        obj.price = 1200;
        System.out.println(obj);

        Laptop obj2 = new Laptop();
        obj2.model = "Dell XPS 13";
        obj2.price = 1200;

        // public String toString() {
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());
        System.out.println(obj.toString());

        System.out.println(obj.model.equals(obj2.model) && obj.price == obj2.price);    
      }
}

class Laptop 
{
    String model;
    int price;

    // override the parent class's toString() method to return the object's state
    public String toString() {
        return this.model + " - $" + this.price;
    }
    // public boolean equals(Laptop that) {
    //     return this.model.equals(that.model) && this.price == that.price;
    // }

    // autogenerate
    // right-click editor=> source action=>generate hashcode & equal
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
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
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    
    
}
