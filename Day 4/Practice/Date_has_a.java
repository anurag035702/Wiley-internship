
public class Date_has_a {
int dd, mm,yy;

public Date_has_a(int dd, int mm, int yy) {
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;
}
public String displayDate() {
	return dd+"/"+mm+"/"+yy;
}

public boolean checkdate() {
	if(this.dd>31)
		return false;
	return true;
}
}
