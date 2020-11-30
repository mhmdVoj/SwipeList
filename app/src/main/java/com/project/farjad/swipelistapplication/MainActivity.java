package com.project.farjad.swipelistapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.project.mhmd.voj.swipelsit.library.MyButtonClickListener;
import com.project.mhmd.voj.swipelsit.library.SwipeListHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcl_main;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcl_main = findViewById(R.id.rcl_main);
        adapter = new ListAdapter(generateList());
        rcl_main.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        rcl_main.setAdapter(adapter);
        new SwipeListHelper(this,rcl_main,200){
            @Override
            public void instantiateMyButton(RecyclerView.ViewHolder viewHolder, List<ButtonSwipe> buffer) {
                ButtonSwipe buttonSwipe = new ButtonSwipe(MainActivity.this,
                        "Remove",
                        0,
                        40,
                        Color.parseColor("#f05454"),
                        new MyButtonClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(MainActivity.this, "Remove", Toast.LENGTH_SHORT).show();
                            }
                        }
                );
                ButtonSwipe buttonSwipeIcon = new ButtonSwipe(MainActivity.this,
                        "Favorite",
                        R.drawable.ic_baseline_favorite_24,
                        40,
                        Color.parseColor("#5aa469"),
                        new MyButtonClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(MainActivity.this, "Favorite", Toast.LENGTH_SHORT).show();
                            }
                        }
                );

                buffer.add(buttonSwipe);
                buffer.add(buttonSwipeIcon);
            }
        };
    }

    private List<Item> generateList() {
        List<Item> items = new ArrayList<>();

        Item item = new Item();
        item.setName("Parrot");
        item.setDate("2020/5/12 : 22:16");
        item.setImg(R.drawable.parrot);

        Item item1 = new Item();
        item1.setName("Eagle");
        item1.setDate("2020/8/23 : 22:16");
        item1.setImg(R.drawable.eagle);

        Item item2 = new Item();
        item2.setName("Cheetah");
        item2.setDate("2019/7/14 : 14:16");
        item2.setImg(R.drawable.cheetah);

        Item item3 = new Item();
        item3.setName("Flamingo");
        item3.setDate("2018/11/17 : 15:59");
        item3.setImg(R.drawable.flamingo);

        Item item4 = new Item();
        item4.setName("Gorilla");
        item4.setDate("2016/9/01 : 10:10");
        item4.setImg(R.drawable.gorilla);

        Item item5 = new Item();
        item5.setName("Koala");
        item5.setDate("2020/10/19 : 21:36");
        item5.setImg(R.drawable.koala);

        Item item6 = new Item();
        item6.setName("Fox");
        item6.setDate("2021/1/03 : 06:22");
        item6.setImg(R.drawable.fox);

        Item item7 = new Item();
        item7.setName("Horse");
        item7.setDate("2018/4/09 : 09:22");
        item7.setImg(R.drawable.horse);

        Item item8 = new Item();
        item8.setName("Camel");
        item8.setDate("2020/9/15 : 12:44");
        item8.setImg(R.drawable.camel);

        items.add(item);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        return items;

    }
}