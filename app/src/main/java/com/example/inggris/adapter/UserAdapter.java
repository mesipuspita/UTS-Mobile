package com.example.inggris.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.inggris.R;
import com.example.inggris.model.UserModel;

import java.text.BreakIterator;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private final Context context;
    private final List<UserModel> userModelList;

    public UserAdapter(Context context, List<UserModel> userModelList) {
        this.context = context;
        this.userModelList = userModelList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.cardview, null);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        UserModel userModel = userModelList.get(position);
        Log.d("MainActivity", "username " + userModel.getNamasantri());
        holder.txttingkatan.setText("Tingkat: " + userModel.getTingkatan());
        holder.txthafalansurat.setText("Hafalan Surat : " + userModel.getHafalansurat());
        holder.txtbacaaalquran.setText("Bacaan Al'Quran : " + userModel.getBacaalquran());
        holder.txthafalansholat.setText("Hafalan Sholat : " + userModel.getHafalansholat());
        //holder.txttanggal.setTextAlignment("Hafalan Sholat : " + userModel.getTanggal());

    }

    @Override
    public int getItemCount() {
        return userModelList.size();
    }
}

class UserViewHolder extends RecyclerView.ViewHolder {
    public View txttanggal;
    TextView txtidsantri, txtnamasntri, txttingkatan, txthafalansurat, txtbacaaalquran, txthafalansholat;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        txtidsantri = itemView.findViewById(R.id.cv_id);
        txtnamasntri = itemView.findViewById(R.id.cv_nama);
        txttingkatan = itemView.findViewById(R.id.cv_tingkat);
        txthafalansurat = itemView.findViewById(R.id.cv_hafalan_surat);
        txtbacaaalquran = itemView.findViewById(R.id.cv_bacaan_alquran);
        txthafalansholat = itemView.findViewById(R.id.cv_hafalan_solat);
        txttanggal = itemView.findViewById(R.id.cv_tanggal);

    }
}