package self.mohekkus.gridlayoutapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> mdata;
    Integer dataCount = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mdata = new ArrayList<>();
        for (int i = 0; i < dataCount; i ++) {
            mdata.add("data\nposition: \n" + i);
        }

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setAdapter(new CustomAdapter(mdata));

        recyclerView.setLayoutManager(
                new GridLayoutManager(this, 4)
        );
//        recyclerView.setLayoutManager(
//                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        );
//        recyclerView.setLayoutManager(
//                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        );
    }
}

