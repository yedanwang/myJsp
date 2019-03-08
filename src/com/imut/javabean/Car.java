package com.imut.javabean;

public class Car {
	  private String  id;
	  private String  driving_book_img ;
      private String  engine_img ;
      private String  buy_time ;
      private String  vehicle_type ;
      private int  mileage ;
      private int  price ;
      private String  status ;
      private String address; 
      private String condition;
      private String iphone;
      public String getId()
  	{
  		return id;
  	}
      public void setId( String id )
  	{
  		this.id = id;
  	}

      public String getDriving_book_img()
    {
    	return driving_book_img;
    }
       public void setDriving_book_img( String driving_book_img )
    {
    	this.driving_book_img = driving_book_img;
    }
       public String getEngine_img()
    {
      	return engine_img;
    }
       public void setEngine_img( String engine_img )
    {
      	this.engine_img = engine_img;
   	}
       public String getBuy_time()
   	{
       	return buy_time;
   	}
       public void setBuy_time( String buy_time )
   	{
       	this.buy_time = buy_time;
   	}
       public String getVehicle_type()
      	{
          	return vehicle_type;
      	}
          public void setVehicle_type( String vehicle_type )
      	{
          	this.vehicle_type = vehicle_type;
      	}  
          public int getMileage()
        {
             return mileage;
        }
          public void setMileage( int mileage )
        {
             this.mileage = mileage;
        }          
           public int getPrice()
       	{
             return price;
       	}
           public void setPrice( int price )
        {
             this.price = price;
        }      
           public String getStatus()
        {
             return status;
        }
           public void setStatus( String status )
        {
            this.status = status;
        }
          public String getAdress()
        {
         	return address;
        }
          public void setAdress( String address )
        {
         	this.address = address;
         }
       public String getCondition()
     	{
     		return condition;
     	}
         public void setCondition( String condition )
     	{
     		this.condition = condition;
     	}
         public String getIphone()
      	{
      		return iphone;
      	}
          public void setIphone( String iphone )
      	{
      		this.iphone = iphone;
      	}
}
