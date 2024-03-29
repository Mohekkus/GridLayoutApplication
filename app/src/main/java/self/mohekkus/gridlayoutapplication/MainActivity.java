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
        // Adapter
        recyclerView.setAdapter(new CustomAdapter(mdata));

        // Data Grid
        recyclerView.setLayoutManager(
                new GridLayoutManager(this, 4)
        );
        // Data Horizontal
//        recyclerView.setLayoutManager(
//                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        );
        // Data Vertical
//        recyclerView.setLayoutManager(
//                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        );
    }
}

