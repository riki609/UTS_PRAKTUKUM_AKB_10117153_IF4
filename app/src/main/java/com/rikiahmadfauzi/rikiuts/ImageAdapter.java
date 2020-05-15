package com.rikiahmadfauzi.rikiuts;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    //List Konten Gambar yang akan ditampilkan pada GridView
    static int[] gambar = {R.drawable.gambar1, R.drawable.gambar2, R.drawable.gambar3,
            R.drawable.gambar4, R.drawable.gambar5, R.drawable.gambar6,
            R.drawable.gambar7, R.drawable.gambar8, R.drawable.gambar9,
            R.drawable.gambar10};


    private Context mContext;

    //Membuat Contructor, dengan parameter Context, Untuk menghubungkan Adapter dengan GridView
    ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        //Menghitung Jumlah/Panjang dari Daftar Konten
        return gambar.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    //Membuat ImageView baru untuk setiap item yang direferensikan oleh Adaptor
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        //Jika tidak di daur ulang
        if (convertView == null) {
            //Menginisialisasi beberapa atribut
            imageView = new ImageView(mContext);
            //Mengatur Panjang dan Lebar pada ImageView
            imageView.setLayoutParams(new GridView.LayoutParams(120, 120));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //Mengatur Padding
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        //Mengset Image dari Resource/Sumber berdasarkan posisinya
        imageView.setImageResource(gambar[position]);
        return imageView;
    }
}

