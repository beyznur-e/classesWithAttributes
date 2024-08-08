public class Product {

    public Product(int id, String name, String description, double price, int  stockAmount){ //Constructor
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }
    public Product(){ //Boş bir constructor oluşturduk ve bu şekilde overloading yaptık.Bunu oluşturmamızın sebebi mainde ürün bilgi ataması yaparken 2 şekilde de yapabilmek.

    }

    //attribute | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;


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
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        //Kodun kullanıcı tarafından ayarlanmasını istemiyoruz o yüzden set yapmadık.
        return this.name.substring(0,1) + id;
    }

}
