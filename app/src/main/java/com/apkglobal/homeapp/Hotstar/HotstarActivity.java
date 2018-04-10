package com.apkglobal.homeapp.Hotstar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.String;

import com.apkglobal.homeapp.MainActivity;
import com.apkglobal.homeapp.R;
import com.apkglobal.homeapp.SplashActivity;

import java.util.ArrayList;
import java.util.List;

public class HotstarActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

   /* private TextView mTextMessage;*/

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent i1 = new Intent(HotstarActivity.this, MainActivity.class);
                    startActivity(i1);
                    return true;
                case R.id.navigation_dashboard:
                    Intent i2 = new Intent(getApplicationContext(),HotstarActivity.class);
                    startActivity(i2);
                    return true;
                case R.id.navigation_notifications:
                    Intent i3 = new Intent(getApplicationContext(),SplashActivity.class);
                    startActivity(i3);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotstar);

        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //-----------2 means no. of columns--

        layoutManager = new GridLayoutManager(this,2);

        //--------Attach layout---------------------

        recyclerView.setLayoutManager(layoutManager);

        CardAdapter cardAdapter = new CardAdapter();
        recyclerView.setAdapter(cardAdapter);


       /* mTextMessage = (TextView) findViewById(R.id.tv_name);*/
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    private class CardAdapter extends RecyclerView.Adapter<MeraHolder> {

        List<Data> dataList;

        //----------transfering data ---constructor--------

        public CardAdapter()
        {
            super();
            dataList = new ArrayList<Data>();

            Data data = new Data();
            data.setName("SONY TV");
            data.setImage(R.drawable.anonymous);
            dataList.add(data);

             data = new Data();
            data.setName("SAB TV");
            data.setImage(R.drawable.anonymous);
            dataList.add(data);

            data = new Data();
            data.setName("ZEE TV");
            data.setImage(R.drawable.anonymous);
            dataList.add(data);

            data = new Data();
            data.setName("MAX TV");
            data.setImage(R.drawable.anonymous);
            dataList.add(data);

            data = new Data();
            data.setName("HBO");
            data.setImage(R.drawable.anonymous);
            dataList.add(data);

            data = new Data();
            data.setName("WB");
            data.setImage(R.drawable.anonymous);
            dataList.add(data);

            data = new Data();
            data.setName("AXN");
            data.setImage(R.drawable.anonymous);
            dataList.add(data);

            data = new Data();
            data.setName("FOX");
            data.setImage(R.drawable.anonymous);
            dataList.add(data);

        }


        @Override
        public MeraHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_icon,parent,false);

            MeraHolder meraHolder = new MeraHolder(view);
            return meraHolder;
        }

        @Override
        public void onBindViewHolder(final MeraHolder holder, final int position) {

	            final Data data = dataList.get(position);
	            holder.iv_image.setImageResource(data.getImage());
	            holder.tv_name.setText(data.getName());
	           final String str = data.getName().toString();

	            holder.iv_image.setOnClickListener(new View.OnClickListener() {
	                @Override
	                public void onClick(View view) {
	                    switch(position)
	                    {
	                        case 0:
	                            Toast.makeText(getApplicationContext(),"Welcome to " + str ,Toast.LENGTH_SHORT).show();
	                            break;

	                        case 1:
	                            Toast.makeText(getApplicationContext(),"Welcome to " + str ,Toast.LENGTH_SHORT).show();
	                            break;

	                        case 2:
	                            Toast.makeText(getApplicationContext(),"Welcome to " + str ,Toast.LENGTH_SHORT).show();
	                            break;

	                        case 3:
	                            Toast.makeText(getApplicationContext(),"Welcome to " + str ,Toast.LENGTH_SHORT).show();
	                            break;

	                        case 4:
	                            Toast.makeText(getApplicationContext(),"Welcome to " + str ,Toast.LENGTH_SHORT).show();
	                            break;

	                        case 5:
	                            Toast.makeText(getApplicationContext(),"Welcome to " + str ,Toast.LENGTH_SHORT).show();
	                            break;

	                        case 6:
	                            Toast.makeText(getApplicationContext(),"Welcome to " + str ,Toast.LENGTH_SHORT).show();
	                            break;

	                        case 7:
	                            Toast.makeText(getApplicationContext(),"Welcome to " + str ,Toast.LENGTH_SHORT).show();
	                            break;
	                    }
	                }
	            });


	        }

        @Override
        public int getItemCount() {
            return dataList.size();
        }
    }

    private class MeraHolder extends RecyclerView.ViewHolder {

        TextView tv_name;
        ImageView iv_image;

        public MeraHolder(View itemView) {
            super(itemView);

            tv_name = (TextView)itemView.findViewById(R.id.tv);
            iv_image = (ImageView)itemView.findViewById(R.id.iv);
        }
    }
}
