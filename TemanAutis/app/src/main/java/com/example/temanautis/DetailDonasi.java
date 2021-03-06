package com.example.temanautis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.temanautis.Model.DataModel;
import com.example.temanautis.Model.DonasiModel;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

public class DetailDonasi extends AppCompatActivity {
    public DonasiModel dm;
    Button button;
    ImageView banner;
    TextView nama,tanggal,yayasan, keterangan;
    private String id,donasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_donasi);
        button = findViewById(R.id.donasi2);
        banner = findViewById(R.id.detail_banner);
        nama = findViewById(R.id.detail_nama);
        keterangan = findViewById(R.id.detail_keterangan);
        yayasan = findViewById(R.id.detail_yayasan);
        tanggal = findViewById(R.id.detail_tanggal);
        getDonasi();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailDonasi.this, Donasi.class);
                intent.putExtra("extra", id);
                intent.putExtra("nama", donasi);
                startActivity(intent);
            }
        });

    }

    private void getDonasi() {
        String data = getIntent().getStringExtra("extra");
        Gson gson = new Gson();
        dm = gson.fromJson(data, DonasiModel.class);
        nama.setText(dm.getNamaDonasi());
        yayasan.setText(dm.getNamaYayasan());
        tanggal.setText(dm.getTanggal());
        keterangan.setText(dm.getKeterangan());
        id = String.valueOf(dm.getId());
        donasi = dm.getNamaDonasi();
        String url = "https://wsjti.id/sipenyaut/public/images/"+dm.getBanner();
        Picasso.get()
                .load(url)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(banner);
    }
}