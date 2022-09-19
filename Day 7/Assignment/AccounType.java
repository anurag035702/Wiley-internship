
public enum AccounType {
SAVINGS(5),CURRENT(6);
int interest;

private AccounType(int interest) {
	this.interest = interest;
}
public int findInterest() {
	return this.interest;
}

}
