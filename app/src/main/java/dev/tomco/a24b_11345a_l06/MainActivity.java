package dev.tomco.a24b_11345a_l06;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import dev.tomco.a24b_11345a_l06.Fragments.ListFragment;
import dev.tomco.a24b_11345a_l06.Fragments.MapFragment;

public class MainActivity extends AppCompatActivity {
    private FrameLayout main_FRAME_list;
    private FrameLayout main_FRAME_map;

    private ListFragment listFragment;
    private MapFragment mapFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        initViews();

    }

    private void findViews() {
        main_FRAME_list = findViewById(R.id.main_FRAME_list);
        main_FRAME_map = findViewById(R.id.main_FRAME_map);
    }

    private void initViews() {
        listFragment = new ListFragment();
        listFragment.setCallbackListItemClicked((lat, lon) -> {
            mapFragment.zoom(lat, lon);
        });
        getSupportFragmentManager().beginTransaction().add(R.id.main_FRAME_list, listFragment).commit();
        mapFragment = new MapFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main_FRAME_map, mapFragment).commit();

    }
}