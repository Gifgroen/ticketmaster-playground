package com.gifgroen.ticketmaster.model.internal;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by karsten on 10/05/2017.
 */
public class Sales {
    @SerializedName("public")
    Public publicSales;
    Presale[] presales;

    @Override
    public String toString() {
        return "Sales{" +
                "publicSales=" + publicSales +
                ", presales=" + Arrays.toString(presales) +
                '}';
    }

    class Public {
        Date startDateTime;
        Date endDateTime;
        boolean startTBD;

        @Override
        public String toString() {
            return "Public{" +
                    "startDateTime='" + startDateTime + '\'' +
                    ", endDateTime='" + endDateTime + '\'' +
                    ", startTBD=" + startTBD +
                    '}';
        }
    }

    class Presale {
        String name;
        String description;
        String url;
        Date startDateTime;
        Date endDateTime;

        @Override
        public String toString() {
            return "Presale{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", url='" + url + '\'' +
                    ", startDateTime='" + startDateTime + '\'' +
                    ", endDateTime='" + endDateTime + '\'' +
                    '}';
        }
    }
}
