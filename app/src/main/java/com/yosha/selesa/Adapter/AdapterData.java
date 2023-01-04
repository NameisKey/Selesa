package com.yosha.selesa.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.yosha.selesa.Activity.DetailActivity;
import com.yosha.selesa.Model.ModelTempatBersejarah;
import com.yosha.selesa.R;

import java.util.ArrayList;

public class AdapterData extends RecyclerView.Adapter<AdapterData.DataViewHolder> {
    private ArrayList<ModelTempatBersejarah> dataTempatBersejarah;
    private Context ctx;

    public AdapterData(ArrayList<ModelTempatBersejarah> dataTempatBersejarah, Context ctx) {
        this.dataTempatBersejarah = dataTempatBersejarah;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new DataViewHolder(varView);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        ModelTempatBersejarah tempatBersejarah = dataTempatBersejarah.get(position);

        holder.tvJudul.setText(tempatBersejarah.getNamaTempat());
        holder.tvDeskripsi.setText(tempatBersejarah.getDeskripsi());
        holder.tvKota.setText(tempatBersejarah.getKota());
        holder.tvLuas.setText(tempatBersejarah.getLuas());
        holder.tvTglDibangun.setText(tempatBersejarah.getTglDibangun());
        holder.tvVideoId.setText(tempatBersejarah.getVideoId());
        Glide
                .with(ctx)
                .load(tempatBersejarah.getFoto())
                .centerCrop()
                .into(holder.ivFoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xJudul, xDeskripsi, xKota, xLuas, xTglDibangun, xVideoId, xFoto;
                xJudul = dataTempatBersejarah.get(holder.getBindingAdapterPosition()).getNamaTempat();
                xDeskripsi = dataTempatBersejarah.get(holder.getBindingAdapterPosition()).getDeskripsi();
                xFoto = dataTempatBersejarah.get(holder.getBindingAdapterPosition()).getFoto();
                xKota = dataTempatBersejarah.get(holder.getBindingAdapterPosition()).getKota();
                xLuas = dataTempatBersejarah.get(holder.getBindingAdapterPosition()).getLuas();
                xTglDibangun = dataTempatBersejarah.get(holder.getBindingAdapterPosition()).getTglDibangun();
                xVideoId = dataTempatBersejarah.get(holder.getBindingAdapterPosition()).getVideoId();

                Intent intentKirim = new Intent(ctx, DetailActivity.class);
                intentKirim.putExtra("xJudul", xJudul);
                intentKirim.putExtra("xDeskripsi", xDeskripsi);
                intentKirim.putExtra("xFoto", xFoto);
                intentKirim.putExtra("xKota", xKota);
                intentKirim.putExtra("xLuas", xLuas);
                intentKirim.putExtra("xTglDibangun", xTglDibangun);
                intentKirim.putExtra("xVideoId", xVideoId);
                ctx.startActivity(intentKirim);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataTempatBersejarah.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder{
        TextView tvJudul, tvDeskripsi, tvKota, tvLuas, tvTglDibangun, tvVideoId;
        ImageView ivFoto;
        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tv_judul);
            tvDeskripsi = itemView.findViewById(R.id.tv_deskripsi);
            tvKota = itemView.findViewById(R.id.tv_kota);
            tvLuas = itemView.findViewById(R.id.tv_luas);
            tvTglDibangun = itemView.findViewById(R.id.tv_tgl_dibangun);
            tvVideoId = itemView.findViewById(R.id.tv_video_id);
            ivFoto = itemView.findViewById(R.id.iv_foto);
        }
    }
}
