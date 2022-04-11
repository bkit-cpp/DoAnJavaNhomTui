
public class MauSac {
private String forecolor;
private String background;
private boolean opaque;
public MauSac() {
	
}
public MauSac(String forecolor,String background, boolean opaque)
{
	this.forecolor=forecolor;
	this.background=background;
	this.opaque=opaque;
}
public String getForecolor() {
	return forecolor;
}
public void setForecolor(String forecolor) {
	this.forecolor = forecolor;
}
public String getBackground() {
	return background;
}
public void setBackground(String background) {
	this.background = background;
}
public boolean isOpaque() {
	return opaque;
}
public void setOpaque(boolean opaque) {
	this.opaque = opaque;
}
}
