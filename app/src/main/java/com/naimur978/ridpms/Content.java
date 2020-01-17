package com.naimur978.ridpms;

import java.io.File;

public class Content {
    String name;
    String location;
    int thumbnail;

    private static int pdf_i=R.drawable.pdf_icon;
    private static int image_i=R.drawable.image_icon;


    Content(File file)
    {
        this.name=file.getName();
        this.location=file.getAbsolutePath();
        String tem=file.getName().substring(file.getName().lastIndexOf(".")).toLowerCase();
        if(tem.equals("pdf"))
        {

            this.thumbnail=pdf_i;
        }
        else  if(tem.equals("img") || tem.equals("jpg") || tem.equals("png") || tem.equals("jpeg") )
        {
            this.thumbnail=image_i;
        }
    }


    Content(File file, int thumbnail)
    {


        this.name=file.getName();
        this.location=file.getAbsolutePath();
        this.thumbnail=thumbnail;


    }

    Content(String name, String location, int thumbnail) {
        this.name = name;
        this.location=location;
        this.thumbnail=thumbnail;
    }
}