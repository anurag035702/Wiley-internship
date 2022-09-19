
public class Address {
 int flatnumber;
 String flatname;
 String roadname;
 String cityName;
public Address(int flatnumber, String flatname, String roadname, String cityName) {
	this.flatnumber = flatnumber;
	this.flatname = flatname;
	this.roadname = roadname;
	this.cityName = cityName;
}
@Override
public String toString() {
	return "Address [flatnumber=" + flatnumber + ", flatname=" + flatname + ", roadname=" + roadname + ", cityName="
			+ cityName + "]";
}
}
