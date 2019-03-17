package Currency.Converter3;

import java.util.List;

import Currency.Converter3.DataSet.Body.Cube.Rate;
/**
 * Search XML jaxb response for the conversion rate
 *
 */
public class ExchangeRateUtil {
	
	 public static Result findExchangeRate( DataSet.Body.Cube cube, String... moneda)  {
	    	Result rs =new Result();
	    	List<Rate> rates =cube.getRate();
	        for (DataSet.Body.Cube.Rate rate : rates)   {
	    	   if (rate.getCurrency().equals(moneda[0])) {
	    		   rs.setMoneda1("1 "+moneda[0]);
	    		   rs.setDate(cube.getDate().toString());
	    		   if (moneda.length==1) {
	    		      rs.setMoneda2(rate.getValue() +" RON");
	    		   }
	    		   else {
	    			   rs.setMoneda2(rate.getValue() +" "+moneda[1]);
	    		   }
	    	      return rs;
	    	   }
	        }
	        rs.setMoneda1("Invalid currency "+moneda[0]);
	        return rs;
	 }
}
