package com.hoangtrongminhduc.html5.dev.testmutiplerecycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CourseRVAdapter adapter;
    private RecyclerView recyclerView;
    private List<Nugget> mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses_fragment);

        recyclerView = (RecyclerView)findViewById(R.id.vertical_courses_list);

        mList = new ArrayList<>();


        List<String> supplierNames = Arrays.asList("sup1", "sup2", "sup3");
        Nugget nugget1 = new Nugget("thu 1", supplierNames);
        Nugget nugget2 = new Nugget("thu 2", supplierNames);
        Nugget nugget3 = new Nugget("thu 3", supplierNames);
        mList.add(nugget1);
        mList.add(nugget2);
        mList.add(nugget3);
        adapter = new CourseRVAdapter(MainActivity.this, mList);
        adapter.notifyDataSetChanged();
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);



//// Setting RecyclerView
//        coursesRecyclerView.setHasFixedSize(true);
//        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
//        coursesRecyclerView.setLayoutManager(llm);
//// nuggetsList is an ArrayList of Custom Objects, in this case  Nugget.class
//        adapter = new CourseRVAdapter(getActivity(), nuggetsList);
//        coursesRecyclerView.setAdapter(adapter);
    }
}
