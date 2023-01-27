package org.example;

public class Movie {
    public static final int REGULAR = 0;
    public static final int CHILDRENS = 1;
    public static final int NEW_RELEASE = 2;
    private String _title;
    private int _categoryCode;
    public Movie(String title, int categoryCode) {
        _title = title;
        _categoryCode = categoryCode;
    }

    public String get_title() {
        return _title;
    }

    public int get_categoryCode() {
        return _categoryCode;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public void set_categoryCode(int _categoryCode) {
        this._categoryCode = _categoryCode;
    }
}
