package com.example.a14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        PersonAdapter adapter = new PersonAdapter();

        adapter.addItem(new Person("미션임파서블:고스트프로토콜","3564000명","15646574명", "1위"));
        adapter.addItem(new Person("마이웨이","2457411명","13498567명","2위"));
        adapter.addItem(new Person("셜록홈즈:그림자게임","1935644명","13356485명","3위"));

        recyclerView.setAdapter(adapter);
    }

    //오류난다면 이 아래로 삭제

    public void makeRequest() {
        String url = editText.getText().toString();

        StringRequest request = new StringRequest(
                Request.Method.Get,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        println("응답 -> " +response) {
                            processResponse(response);
                        }

                    }
                }

    }

    public void processResponse(String response)
    {
        Gson gson = new Gson();
        MovieList movieList = gson.fromJson(response, MovieList.class);
        println("영화 정보의 수 : " + movieList.boxOfficeResult.dailyBoxOfficeList.size());

    }

    public void processResponse(String response)
    {
        Gson gson = new Gson();
        MovieLsit movieLsit = gson.fromJson(response, MovieList.class);
        println("영화 정보의 수 : " + movieList.movieList.boxOfficeResult.dailyBoxOfficeList.size());
    }

}
