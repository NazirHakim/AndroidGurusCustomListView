package com.zealplex.androidguruscustomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int [] IMAGES ={R.drawable.annapurnaagarawal, R.drawable.buckyrobets, R.drawable.chrislei,
    R.drawable.jessicalin, R.drawable.katherinekuan, R.drawable.kunalchawla, R.drawable.lylafujiwara,
    R.drawable.robpercvial, R.drawable.sriyanksiddhartha, R.drawable.vivianaranha};

    String[] NAME ={"ANNAPURNA AGARWAL", "BUCKY ROBERTS", "CHRIS LEI", "JESSICA LIN", "KATHERINE KAUN",
                    "KUNAL CHAWLA", "LYLA FUJIWARA", "ROB PERCIVAL", "SRIYANK SIDDHARTHA", "VIVIAN ARANHA"};

    String[] DESCRIPTION ={"Material Design", "Master of Computer Science", "Master in Networking", "Master of Activity",
            "Managing Android Course", "Boost you to Improve", "Android Developer at Google", "Top Instrutor at Udemy",
    "Make you understand Logic", "Idea to get more Apps"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listview);

        CustomAdaptor customAdaptor = new CustomAdaptor();

        listView.setAdapter(customAdaptor);
    }

    public class CustomAdaptor extends BaseAdapter{


        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.customlayout, null);

            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textView_name = (TextView)view.findViewById(R.id.textView_name);
            TextView textView_description = (TextView)view.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAME[i]);
            textView_description.setText(DESCRIPTION[i]);

            return view;
        }
    }
}
