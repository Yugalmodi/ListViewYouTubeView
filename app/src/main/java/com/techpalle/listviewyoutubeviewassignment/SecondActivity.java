package com.techpalle.listviewyoutubeviewassignment;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> al1;
    MyAdapter adapter;
    String s;

    public class MyAdapter extends BaseAdapter{
        TextView tv1, tv2, tv3;
        Button button;
        @Override
        public int getCount() {
            return al1.size();
        }

        @Override
        public Object getItem(int i) {
            return al1.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            s = al1.get(i);
            View v = getLayoutInflater().inflate(R.layout.row, null);
            tv1 = (TextView) v.findViewById(R.id.row_tv1);
            tv2 = (TextView) v.findViewById(R.id.row_tv2);
            tv3 = (TextView) v.findViewById(R.id.row_tv3);
            button = (Button) v.findViewById(R.id.row_button);
            tv1.setText(""+ ++i +".");
            tv2.setText(s.substring(0, s.indexOf("/")));
            tv3.setText("duration  "+s.substring(s.lastIndexOf("/")+1, s.length()));
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //for getting position of click
                    int pos = listView.getPositionForView(view);

                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    intent.putExtra("key", s.substring(s.indexOf("/")+1, s.lastIndexOf("/")));
                    startActivity(intent);
                }
            });
            return v;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView = (ListView) findViewById(R.id.lv);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        String value = b.getString("key");

        switch (value){
            case "Csharp for freshers":
                al1 = new ArrayList<String>();
                String[] csharp_freshers_demo_videos = {
                        "C# program compilation/ltgDdukzQ7I/18:47",
                        "C# data types/L_gFuuSp4V0/17:53",
                        "C# class/l1C4FZGCab0/10:48",
                        "C# class as virtual entity/HSdIq3k51bg/9:15",
                        "Objects in c#/SM_QqUdMXY0/22:14",
                        "Debugging in visual studio/8hXH5HxQfFU/10:41",
                        "C# Arrays/CLnA6OAlNPk/24:50",
                        "Declaring and Modifying data in c# arrays/O2QI3YFupxM/9:06",
                        "Arrays Assignment/Zt85ireWQWw/7:49",
                        "Loops/u_k75WcEpHM/5:51",
                };
                for (int i =0; i<csharp_freshers_demo_videos.length; i++)
                    {   al1.add(csharp_freshers_demo_videos[i]);
                    }
                adapter = new MyAdapter();
                listView.setAdapter(adapter);
                break;

            case "Csharp for professionals":
                al1 = new ArrayList<String>();
                String[] csharp_exp_demo_videos = {
                        "C# program compilation/ltgDdukzQ7I/18:47",
                        "Debugging in visual studio/8hXH5HxQfFU/10:41",
                        "Inheritence/TOBLe0qoA_o/9:24",
                        "Inheritence Part 2/T7G8NFXDXFE/24:07",
                        "base keyword/WaAbIMz2dqg/22:08",
                        "Overriding Intro/w6ldKhR4YUs/23:31",
                        "overriding an override method/fdPslUmRqm0/12:52",
                        "Static Variables/zvk_hS4vEOw/9:27",
                        "what is the use of properties in c#/UdiU6sp68Tc/16:16",
                        "c# properties/5nHmt5Zi7l8/15:03",
                };
                for (int i =0; i<csharp_exp_demo_videos.length; i++)
                {   al1.add(csharp_exp_demo_videos[i]);
                }
                adapter = new MyAdapter();
                listView.setAdapter(adapter);
                break;

            case "SQL Server(t-sql)":
                al1 = new ArrayList<String>();
                String[] sql_server_freshers_demo_videos = {
                        "SQLServer Overview/Kdc84lpF4GM/16:25",
                        "Normalization/7Dc7_I48ZTg/14:30",
                        "Orderby clause/quuwLXzZl3g/6:59",
                        "Delete drop and truncate statements/yZNyUzSMsT8/6:58",
                        "Aggregate Functions/2IYykxAXaB8/13:54",
                        "Group by clause/qx0j5iWajqg/20:22",
                        "Joins and Inner Join with simple explanation/i0vwTFFHTU8/33:02",
                        "stored procedure/jmZsXlAYe7Y/17:11",
                        "User defined functions in sql/8cJFtDESxiQ/9:01",
                        "Indexes/hrVpqW_Bh2o/21:09"
                };
                for (int i =0; i<sql_server_freshers_demo_videos.length; i++)
                {   al1.add(sql_server_freshers_demo_videos[i]);
                }
                adapter = new MyAdapter();
                listView.setAdapter(adapter);
                break;
        }
    }
}