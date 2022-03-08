package com.example.lab4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViewProduct extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(R.drawable.ca_nau_lau," Cá nấu lẩu", "Shop Devang"));
        products.add(new Product(R.drawable.do_choi_dang_mo_hinh," Đồ chơi mô hình", "Shop Devang"));

        products.add(new Product(R.drawable.ga_bo_toi," Gà bơ tỏi", "Shop Devang"));
        products.add(new Product(R.drawable.hieu_long_con_tre," Sách hiểu lòng con trẻ", "Shop Devang"));

        products.add(new Product(R.drawable.xa_can_cau," Xe cần cẩu", "Shop Devang"));
        products.add(new Product(R.drawable.trump_1," Donal Trump thiên tài lãnh đạo", "Shop Devang"));

        products.add(new Product(R.drawable.lanh_dao_gian_don," Lãnh đạo giản đơn", "Shop Devang"));

        ListView listView = findViewById(R.id.myListView);

        ListViewProductAdapter adapter = new ListViewProductAdapter(this,R.layout.custom_list_view_activity,products);

        listView.setAdapter(adapter);
    }
}
