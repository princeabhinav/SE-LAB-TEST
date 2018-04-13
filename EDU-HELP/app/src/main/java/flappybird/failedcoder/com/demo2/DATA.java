package flappybird.failedcoder.com.demo2;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

public class DATA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.Bdisplay1) {
            download();
        } else if (v.getId() == R.id.Bdisplay2) {
            download1();
        } else if (v.getId() == R.id.Bdisplay3) {
            download1();
        } else if (v.getId() == R.id.Bdisplay4) {
            download2();
        } else if (v.getId() == R.id.Bdisplay6) {
            download3();
        }
    }
    public void download()
    {
        new DownloadFile().execute("https://www.cs.cmu.edu/~rjsimmon/15122-f14/lec/11-linkedlist.pdf","linkedlist.pdf");
    }

    public void view12()
    {
        File pdfFile = new File(Environment.getExternalStorageDirectory() + "/CODING/" + "linkedlist.pdf");  // -> filename = maven.pdf
        if(!pdfFile.exists()){
            Toast.makeText(DATA.this, "Dont exists Downloading.......", Toast.LENGTH_SHORT).show();
            download();
            pdfFile = new File(Environment.getExternalStorageDirectory() + "/CODING/" + "linkedlist.pdf");  // -> filename = maven.pdf
        }
        Uri path = Uri.fromFile(pdfFile);
        Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
        pdfIntent.setDataAndType(path, "application/pdf");
        pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        try {
            startActivity(pdfIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(DATA.this, "No Application available to view PDF Downloading...", Toast.LENGTH_SHORT).show();
        }
    }

    public void download3()
    {
        new DownloadFile3().execute("https://web.stanford.edu/class/archive/cs/cs106b/cs106b.1126/lectures/24/Slides24.pdf","graph.pdf");
    }

    public void view123()
    {
        File pdfFile = new File(Environment.getExternalStorageDirectory() + "/CODING/" + "graph.pdf");  // -> filename = maven.pdf
        if(!pdfFile.exists()){
            Toast.makeText(DATA.this, "Dont exists Downloading.......", Toast.LENGTH_SHORT).show();
            download();
            pdfFile = new File(Environment.getExternalStorageDirectory() + "/CODING/" + "graph.pdf");  // -> filename = maven.pdf
        }
        Uri path = Uri.fromFile(pdfFile);
        Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
        pdfIntent.setDataAndType(path, "application/pdf");
        pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        try {
            startActivity(pdfIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(DATA.this, "No Application available to view PDF Downloading...", Toast.LENGTH_SHORT).show();
        }
    }
    public void download1()
    {
        new DownloadFile1().execute("https://www.cs.cmu.edu/~rjsimmon/15122-s13/09-queuestack.pdf","queuestack.pdf");
    }

    public void view121()
    {
        File pdfFile = new File(Environment.getExternalStorageDirectory() + "/CODING/" + "queuestack.pdf");  // -> filename = maven.pdf
        if(!pdfFile.exists()){
            Toast.makeText(DATA.this, "Dont exists Downloading.......", Toast.LENGTH_SHORT).show();
            download();
            pdfFile = new File(Environment.getExternalStorageDirectory() + "/CODING/" + "queuestack.pdf");  // -> filename = maven.pdf
        }
        Uri path = Uri.fromFile(pdfFile);
        Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
        pdfIntent.setDataAndType(path, "application/pdf");
        pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        try {
            startActivity(pdfIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(DATA.this, "No Application available to view PDF Downloading...", Toast.LENGTH_SHORT).show();
        }
    }
    public void download2()
    {
        new DownloadFile2().execute("http://oz.nthu.edu.tw/~d947207/chap9_tree.pdf","tree.pdf");
    }

    public void view122()
    {
        File pdfFile = new File(Environment.getExternalStorageDirectory() + "/CODING/" + "tree.pdf");  // -> filename = maven.pdf
        if(!pdfFile.exists()){
            Toast.makeText(DATA.this, "Dont exists Downloading.......", Toast.LENGTH_SHORT).show();
            download();
            pdfFile = new File(Environment.getExternalStorageDirectory() + "/CODING/" + "tree.pdf");  // -> filename = maven.pdf
        }
        Uri path = Uri.fromFile(pdfFile);
        Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
        pdfIntent.setDataAndType(path, "application/pdf");
        pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        try {
            startActivity(pdfIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(DATA.this, "No Application available to view PDF Downloading...", Toast.LENGTH_SHORT).show();
        }
    }

    private class DownloadFile extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... strings) {

            String fileUrl = strings[0];   // -> http://maven.apache.org/maven-1.x/maven.pdf
            String fileName = strings[1];  // -> maven.pdf
            String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
            File folder = new File(extStorageDirectory, "CODING");
            folder.mkdir();

            File pdfFile = new File(folder, fileName);

            try{
                pdfFile.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
            FileDownloader.downloadFile(fileUrl, pdfFile);
            view12();
            return null;
        }
    }
    private class DownloadFile1 extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... strings) {

            String fileUrl = strings[0];   // -> http://maven.apache.org/maven-1.x/maven.pdf
            String fileName = strings[1];  // -> maven.pdf
            String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
            File folder = new File(extStorageDirectory, "CODING");
            folder.mkdir();

            File pdfFile = new File(folder, fileName);

            try{
                pdfFile.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
            FileDownloader.downloadFile(fileUrl, pdfFile);
            view121();
            return null;
        }
    }
    private class DownloadFile2 extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... strings) {

            String fileUrl = strings[0];   // -> http://maven.apache.org/maven-1.x/maven.pdf
            String fileName = strings[1];  // -> maven.pdf
            String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
            File folder = new File(extStorageDirectory, "CODING");
            folder.mkdir();

            File pdfFile = new File(folder, fileName);

            try{
                pdfFile.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
            FileDownloader.downloadFile(fileUrl, pdfFile);
            view122();
            return null;
        }
    }
    private class DownloadFile3 extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... strings) {

            String fileUrl = strings[0];   // -> http://maven.apache.org/maven-1.x/maven.pdf
            String fileName = strings[1];  // -> maven.pdf
            String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
            File folder = new File(extStorageDirectory, "CODING");
            folder.mkdir();

            File pdfFile = new File(folder, fileName);

            try{
                pdfFile.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
            FileDownloader.downloadFile(fileUrl, pdfFile);

            view123();
            return null;
        }
    }

}
