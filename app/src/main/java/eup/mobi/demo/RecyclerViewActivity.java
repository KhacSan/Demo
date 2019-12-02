package eup.mobi.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity implements ItemClick {


    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);


        recyclerView = findViewById(R.id.recy);

        ArrayList<String> list = new ArrayList<>();
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");
        list.add("item");

        recyclerView.setAdapter(new RecyAdapter(list,this));

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                layoutManager.findLastVisibleItemPosition();

            }
        });
    }

    @Override
    public void onItemClick(String str) {
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }
}
