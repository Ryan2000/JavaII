import java.math.BigDecimal;

import com.opencsv.bean.CsvBind;

public class ContactsBean {
	
	@CsvBind private int policyId;
	@CsvBind private String statecode;
	@CsvBind private String county;
	@CsvBind private String eq_Site_Limit;
	@CsvBind private String hu_Site_Limit;
	@CsvBind private String fl_Site_Limit;
	@CsvBind private String fr_Site_Limit;
	@CsvBind private String tiv_2011;
	@CsvBind private String tiv_2012;
	@CsvBind private String eq_Site_Deductible;
	@CsvBind private String hu_Site_Deductible;
	@CsvBind private String fl_Site_Deductible;
	@CsvBind private String fr_Site_Deductible;
	@CsvBind private String point_Latitude;
	@CsvBind private String point_Longitude;
	@CsvBind private String line;
	@CsvBind private String construction;
	@CsvBind private String point_Granularity;
	
	
	public ContactsBean(){
		
	}


	public ContactsBean(int policyId, String statecode, String county, String eq_Site_Limit, String hu_Site_Limit,
			String fl_Site_Limit, String fr_Site_Limit, String tiv_2011, String tiv_2012, String eq_Site_Deductible,
			String hu_Site_Deductible, String fl_Site_Deductible, String fr_Site_Deductible, String point_Latitude,
			String point_Longitude, String line, String construction, String point_Granularity) {
		super();
		this.policyId = policyId;
		this.statecode = statecode;
		this.county = county;
		this.eq_Site_Limit = eq_Site_Limit;
		this.hu_Site_Limit = hu_Site_Limit;
		this.fl_Site_Limit = fl_Site_Limit;
		this.fr_Site_Limit = fr_Site_Limit;
		this.tiv_2011 = tiv_2011;
		this.tiv_2012 = tiv_2012;
		this.eq_Site_Deductible = eq_Site_Deductible;
		this.hu_Site_Deductible = hu_Site_Deductible;
		this.fl_Site_Deductible = fl_Site_Deductible;
		this.fr_Site_Deductible = fr_Site_Deductible;
		this.point_Latitude = point_Latitude;
		this.point_Longitude = point_Longitude;
		this.line = line;
		this.construction = construction;
		this.point_Granularity = point_Granularity;
	}


	public int getPolicyId() {
		return policyId;
	}


	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}


	public String getStatecode() {
		return statecode;
	}


	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}


	public String getCounty() {
		return county;
	}


	public void setCounty(String county) {
		this.county = county;
	}


	public String getEq_Site_Limit() {
		return eq_Site_Limit;
	}


	public void setEq_Site_Limit(String eq_Site_Limit) {
		this.eq_Site_Limit = eq_Site_Limit;
	}


	public String getHu_Site_Limit() {
		return hu_Site_Limit;
	}


	public void setHu_Site_Limit(String hu_Site_Limit) {
		this.hu_Site_Limit = hu_Site_Limit;
	}


	public String getFl_Site_Limit() {
		return fl_Site_Limit;
	}


	public void setFl_Site_Limit(String fl_Site_Limit) {
		this.fl_Site_Limit = fl_Site_Limit;
	}


	public String getFr_Site_Limit() {
		return fr_Site_Limit;
	}


	public void setFr_Site_Limit(String fr_Site_Limit) {
		this.fr_Site_Limit = fr_Site_Limit;
	}


	public String getTiv_2011() {
		return tiv_2011;
	}


	public void setTiv_2011(String tiv_2011) {
		this.tiv_2011 = tiv_2011;
	}

	public String getTiv_2012() {
		return tiv_2012;
	}


	public void setTiv_2012(String tiv_2011) {
		this.tiv_2011 = tiv_2012;
	}

	public String getEq_Site_Deductible() {
		return eq_Site_Deductible;
	}


	public void setEq_Site_Deductible(String eq_Site_Deductible) {
		this.eq_Site_Deductible = eq_Site_Deductible;
	}


	public String getHu_Site_Deductible() {
		return hu_Site_Deductible;
	}


	public void setHu_Site_Deductible(String hu_Site_Deductible) {
		this.hu_Site_Deductible = hu_Site_Deductible;
	}


	public String getFl_Site_Deductible() {
		return fl_Site_Deductible;
	}


	public void setFl_Site_Deductible(String fl_Site_Deductible) {
		this.fl_Site_Deductible = fl_Site_Deductible;
	}


	public String getFr_Site_Deductible() {
		return fr_Site_Deductible;
	}


	public void setFr_Site_Deductible(String fr_Site_Deductible) {
		this.fr_Site_Deductible = fr_Site_Deductible;
	}


	public String getPoint_Latitude() {
		return point_Latitude;
	}


	public void setPoint_Latitude(String point_Latitude) {
		this.point_Latitude = point_Latitude;
	}


	public String getPoint_Longitude() {
		return point_Longitude;
	}


	public void setPoint_Longitude(String point_Longitude) {
		this.point_Longitude = point_Longitude;
	}


	public String getLine() {
		return line;
	}


	public void setLine(String line) {
		this.line = line;
	}


	public String getConstruction() {
		return construction;
	}


	public void setConstruction(String construction) {
		this.construction = construction;
	}


	public String getPoint_Granularity() {
		return point_Granularity;
	}


	public void setPoint_Granularity(String point_Granularity) {
		this.point_Granularity = point_Granularity;
	}


	@Override
	public String toString() {
		return "ContactsBean [policyId=" + policyId + ", statecode=" + statecode + ", county=" + county
				+ ", eq_Site_Limit=" + eq_Site_Limit + ", hu_Site_Limit=" + hu_Site_Limit + ", fl_Site_Limit="
				+ fl_Site_Limit + ", fr_Site_Limit=" + fr_Site_Limit + ", tiv_2011=" + tiv_2011
				+ ", tiv_2012=" + tiv_2012
				+ ", eq_Site_Deductible=" + eq_Site_Deductible + ", hu_Site_Deductible=" + hu_Site_Deductible
				+ ", fl_Site_Deductible=" + fl_Site_Deductible + ", fr_Site_Deductible=" + fr_Site_Deductible
				+ ", point_Latitude=" + point_Latitude + ", point_Longitude=" + point_Longitude + ", line=" + line
				+ ", construction=" + construction + ", point_Granularity=" + point_Granularity + "]";
	}


	
	
	
	
	
	
	
	
	
	
/*	@CsvBind private int seq;
	@CsvBind private String first;
	@CsvBind private String last;
	@CsvBind private int age;
	@CsvBind private String street;
	@CsvBind private String city;
	@CsvBind private String state;
	@CsvBind private int zip;
	@CsvBind private String dollar;
	@CsvBind private String pick;*/
	
/*	public ContactsBean(){
		
	}*/

	/*public ContactsBean(int seq, String first, String last, int age, String street, String city, String state, int zip,
			String dollar, String pick) {
		super();
		this.seq = seq;
		this.first = first;
		this.last = last;
		this.age = age;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.dollar = dollar;
		this.pick = pick;
	}

	public int getSeq() {
		return seq;
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	public int getAge() {
		return age;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}

	public String getDollar() {
		return dollar;
	}

	public String getPick() {
		return pick;
	}

	@Override
	public String toString() {
		return "ContactsBean [seq=" + seq + ", first=" + first + ", last=" + last + ", age=" + age + ", street="
				+ street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", dollar=" + dollar + ", pick="
				+ pick + "]";
	}*/

	
	

}
