package mchmistry.titisseya.mchemstry;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sofyadina on 20-Feb-15.
 */
public class database extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis";

    public database(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("soal", "Apa nama unsur dari gambar di samping?");
        values.put("pil_a", "Zonk");
        values.put("pil_b","Zinc");
        values.put("pil_c", "Zebra");
        values.put("jwban","1");
        values.put("img", R.drawable.zn);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Gambar dibawah ini merupakan rumus dari materi? ");
        values.put("pil_a", "Besaran dan satuan");
        values.put("pil_b","Trigonometri");
        values.put("pil_c", "Konsep Mol");
        values.put("jwban","2");
        values.put("img", R.drawable.mol);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa nama percobaan dari gambar di samping?");
        values.put("pil_a", "Elektro");
        values.put("pil_b","Elekrokimia.");
        values.put("pil_c", "Elektrolit");
        values.put("jwban","1");
        values.put("img", R.drawable.elektrokimia);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa nama kegiatan dari gambar di samping?");
        values.put("pil_a", "Reaksi Kimia");
        values.put("pil_b","Sistem Periodik");
        values.put("pil_c", "Kimia");
        values.put("jwban","0");
        values.put("img", R.drawable.reaksikimia);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa nama diagram dari gambar di samping?");
        values.put("pil_a", "Laju reaksi");
        values.put("pil_b","Materi dan Perubahan");
        values.put("pil_c", "Elektrokimia");
        values.put("jwban","1");
        values.put("img", R.drawable.perubahanmateri);
        db.insert("tbl_soal", "soal", values);

    }

    public List<kuis> getSoal(){
        List<kuis> listSoal = new ArrayList<kuis>();
        String query = "select * from tbl_soal";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                kuis s = new kuis();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setJwban(cursor.getInt(5));
                s.setGambar(cursor.getInt(6));
                listSoal.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        onCreate(db);

    }

}
