package sg.edu.rp.c346.s19047241.p02_holidays;

import android.graphics.drawable.Drawable;

public class Holidays {
    private String holidayName;
    private String holidayDate;
    private int holidayImage;
    private String category;

    public Holidays(String holidayName, String holidayDate, int holidayImage, String category) {
        this.holidayName = holidayName;
        this.holidayDate = holidayDate;
        this.holidayImage = holidayImage;
        this.category = category;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public String getHolidayDate() {
        return holidayDate;
    }

    public int getHolidayImage() {
        return holidayImage;
    }

    public String getCategory() {
        return category;
    }
}
