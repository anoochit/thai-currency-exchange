package net.redlinesoft.app.currencyexchange;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import android.graphics.drawable.Drawable;

public class CurrencyItem {

	Drawable icon;
	String title_short;
	String title_long;
	Double rate;
	
	public Drawable getIcon() {
		return icon;
	}
	public void setIcon(Drawable icon) {
		this.icon = icon;
	}
	public String getTitle_short() {
		return title_short;
	}
	public void setTitle_short(String title_short) {		
		this.title_short = title_short;
	}
	public String getTitle_long() {
		return title_long;
	}
	public void setTitle_long(String title_long) {
		this.title_long = title_long;
	}
	public Double getRate() {
		DecimalFormat df2 = new DecimalFormat( "##.##" );
		double convrate = new Double(df2.format(rate)).doubleValue();
		return convrate;
	}
	public void setRate(Double double1) {
		this.rate = double1;
	}
	

	
}
