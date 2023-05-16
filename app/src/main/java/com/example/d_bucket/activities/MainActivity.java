package com.example.d_bucket.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.d_bucket.R;
import com.example.d_bucket.adapters.CategoryAdapter;
import com.example.d_bucket.adapters.ProductAdapter;
import com.example.d_bucket.databinding.ActivityMainBinding;
import com.example.d_bucket.model.Category;
import com.example.d_bucket.model.Product;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories;

    ProductAdapter productAdapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initCategories();
        initProducts();
        initSlider();
    }

    private void initSlider() {
        binding.carousel.addData(new CarouselItem("https://images.freekaamaal.com/store_desc_images/1515145891.jpg","Some Caption Here"));
        binding.carousel.addData(new CarouselItem("https://thumbs.dreamstime.com/b/grocery-shopping-promotional-sale-banner-grocery-shopping-promotional-sale-banner-fast-shopping-cart-full-fresh-colorful-food-168812706.jpg","Some Caption Here"));
        binding.carousel.addData(new CarouselItem("http://images.shopclues.com/images/mailer/holispecial/holispecial_update.jpg","Some Caption here"));
    }

    void initCategories(){
        categories = new ArrayList<>();
        categories.add(new Category("Oil & Ghee","https://www.vegberry.com/Upload/Oils_Ghee_Vinegar_e43f4aed.jpg","#18ab4e","Some Description",1));
        categories.add(new Category("Rice & Flours","https://www.world-grain.com/ext/resources/Article-Images/2020/08/riceflour_photo-cred-Adobe-stock_E.jpg?height=635&t=1596809976&width=1200","#fb0504","Some Description",1));
        categories.add(new Category("Snacks & Namkeen","https://sigarammart.com/wp-content/uploads/2021/10/00-Snacks-Namkeen.jpg","#4186ff","Some Description",1));
        categories.add(new Category("Stationary","https://grammarclassblog.files.wordpress.com/2017/08/wp-image-1655742633.png","#BF360C","Some Description",1));
        categories.add(new Category("Masala & Pulses","https://5.imimg.com/data5/YH/EM/MY-562159/pulses-and-organic-spices-500x500.jpg","#ff870e","Some Description",1));
        categories.add(new Category("Stitching Materials","https://img3.exportersindia.com/product_images/bc-full/dir_53/1588937/tailoring-material-2209837.jpg","#ff6f52","Some Description",1));
        categories.add(new Category("Cosmetics","https://images.unsplash.com/photo-1596462502278-27bfdc403348?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8Y29zbWV0aWN8ZW58MHx8MHx8&w=1000&q=80","#fe438e","Some Description",1));
        categories.add(new Category("Chocolates & Cookies","https://cdn.igp.com/f_auto,q_auto,t_prodm/products/p-assorted-chocolate-biscuit-hamper-80499-m.jpg","#ff870e","Some Description",1));
        categoryAdapter = new CategoryAdapter(this, categories);

        GridLayoutManager layoutManager = new GridLayoutManager(this,4);
        binding.categoriesList.setLayoutManager(layoutManager);
        binding.categoriesList.setAdapter(categoryAdapter);
    }

    void initProducts(){
        products = new ArrayList<>();
        products.add(new Product("Ghee","https://bohrakirana.com/image/cache/catalog/image/picture/new/pic/saras-187x270.jpg","",12,12,1,1));
        products.add(new Product("Rice","https://www.spenlo.com/image/cache/catalog/products/India-Gate/India-Gate-Rozzana-Basmati-Rice-1kg-700x700.jpg","",12,12,1,1));
        products.add(new Product("Garam Masala","https://lsmedia.linker-cdn.net/255724/2020/3490734.jpg?d=390x390","",12,12,1,1));
        products.add(new Product("Maggie","https://www.bigbasket.com/media/uploads/p/l/266160_21-maggi-masala-instant-noodles-vegetarian.jpg","",12,12,1,1));
        products.add(new Product("Notebook","https://5.imimg.com/data5/SELLER/Default/2020/12/CA/CP/TN/116649500/student-notebook-500x500.jpg","",12,12,1,1));
        products.add(new Product("Chalk","https://images.meesho.com/images/products/103530576/ik0ww_512.jpg","",12,12,1,1));
        products.add(new Product("Rose Water","https://www.gortsa.com/cache/large/product/18954/uIWt5dlgZ7RKwulBWlb7jterjYoZDUQUlLYGdmqX.jpeg","",12,12,1,1));
        products.add(new Product("Parle","https://www.bigbasket.com/media/uploads/p/l/20004285-2_17-parle-g-gold-gluco-biscuits.jpg","",12,12,1,1));
        productAdapter = new ProductAdapter(this, products);

        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        binding.productList.setLayoutManager(layoutManager);
        binding.productList.setAdapter(productAdapter);
    }
}