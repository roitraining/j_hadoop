// ORM class for table 'orders'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Sep 26 21:57:40 UTC 2020
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class orders extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("OrderID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.OrderID = (Long)value;
      }
    });
    setters.put("CustomerID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.CustomerID = (String)value;
      }
    });
    setters.put("EmployeeID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.EmployeeID = (Long)value;
      }
    });
    setters.put("OrderDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.OrderDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("RequiredDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.RequiredDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("ShippedDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.ShippedDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("ShipVia", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.ShipVia = (Long)value;
      }
    });
    setters.put("Freight", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.Freight = (Double)value;
      }
    });
    setters.put("ShipName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.ShipName = (String)value;
      }
    });
    setters.put("ShipAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.ShipAddress = (String)value;
      }
    });
    setters.put("ShipCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.ShipCity = (String)value;
      }
    });
    setters.put("ShipRegion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.ShipRegion = (String)value;
      }
    });
    setters.put("ShipPostalCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.ShipPostalCode = (String)value;
      }
    });
    setters.put("ShipCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.ShipCountry = (String)value;
      }
    });
  }
  public orders() {
    init0();
  }
  private Long OrderID;
  public Long get_OrderID() {
    return OrderID;
  }
  public void set_OrderID(Long OrderID) {
    this.OrderID = OrderID;
  }
  public orders with_OrderID(Long OrderID) {
    this.OrderID = OrderID;
    return this;
  }
  private String CustomerID;
  public String get_CustomerID() {
    return CustomerID;
  }
  public void set_CustomerID(String CustomerID) {
    this.CustomerID = CustomerID;
  }
  public orders with_CustomerID(String CustomerID) {
    this.CustomerID = CustomerID;
    return this;
  }
  private Long EmployeeID;
  public Long get_EmployeeID() {
    return EmployeeID;
  }
  public void set_EmployeeID(Long EmployeeID) {
    this.EmployeeID = EmployeeID;
  }
  public orders with_EmployeeID(Long EmployeeID) {
    this.EmployeeID = EmployeeID;
    return this;
  }
  private java.sql.Timestamp OrderDate;
  public java.sql.Timestamp get_OrderDate() {
    return OrderDate;
  }
  public void set_OrderDate(java.sql.Timestamp OrderDate) {
    this.OrderDate = OrderDate;
  }
  public orders with_OrderDate(java.sql.Timestamp OrderDate) {
    this.OrderDate = OrderDate;
    return this;
  }
  private java.sql.Timestamp RequiredDate;
  public java.sql.Timestamp get_RequiredDate() {
    return RequiredDate;
  }
  public void set_RequiredDate(java.sql.Timestamp RequiredDate) {
    this.RequiredDate = RequiredDate;
  }
  public orders with_RequiredDate(java.sql.Timestamp RequiredDate) {
    this.RequiredDate = RequiredDate;
    return this;
  }
  private java.sql.Timestamp ShippedDate;
  public java.sql.Timestamp get_ShippedDate() {
    return ShippedDate;
  }
  public void set_ShippedDate(java.sql.Timestamp ShippedDate) {
    this.ShippedDate = ShippedDate;
  }
  public orders with_ShippedDate(java.sql.Timestamp ShippedDate) {
    this.ShippedDate = ShippedDate;
    return this;
  }
  private Long ShipVia;
  public Long get_ShipVia() {
    return ShipVia;
  }
  public void set_ShipVia(Long ShipVia) {
    this.ShipVia = ShipVia;
  }
  public orders with_ShipVia(Long ShipVia) {
    this.ShipVia = ShipVia;
    return this;
  }
  private Double Freight;
  public Double get_Freight() {
    return Freight;
  }
  public void set_Freight(Double Freight) {
    this.Freight = Freight;
  }
  public orders with_Freight(Double Freight) {
    this.Freight = Freight;
    return this;
  }
  private String ShipName;
  public String get_ShipName() {
    return ShipName;
  }
  public void set_ShipName(String ShipName) {
    this.ShipName = ShipName;
  }
  public orders with_ShipName(String ShipName) {
    this.ShipName = ShipName;
    return this;
  }
  private String ShipAddress;
  public String get_ShipAddress() {
    return ShipAddress;
  }
  public void set_ShipAddress(String ShipAddress) {
    this.ShipAddress = ShipAddress;
  }
  public orders with_ShipAddress(String ShipAddress) {
    this.ShipAddress = ShipAddress;
    return this;
  }
  private String ShipCity;
  public String get_ShipCity() {
    return ShipCity;
  }
  public void set_ShipCity(String ShipCity) {
    this.ShipCity = ShipCity;
  }
  public orders with_ShipCity(String ShipCity) {
    this.ShipCity = ShipCity;
    return this;
  }
  private String ShipRegion;
  public String get_ShipRegion() {
    return ShipRegion;
  }
  public void set_ShipRegion(String ShipRegion) {
    this.ShipRegion = ShipRegion;
  }
  public orders with_ShipRegion(String ShipRegion) {
    this.ShipRegion = ShipRegion;
    return this;
  }
  private String ShipPostalCode;
  public String get_ShipPostalCode() {
    return ShipPostalCode;
  }
  public void set_ShipPostalCode(String ShipPostalCode) {
    this.ShipPostalCode = ShipPostalCode;
  }
  public orders with_ShipPostalCode(String ShipPostalCode) {
    this.ShipPostalCode = ShipPostalCode;
    return this;
  }
  private String ShipCountry;
  public String get_ShipCountry() {
    return ShipCountry;
  }
  public void set_ShipCountry(String ShipCountry) {
    this.ShipCountry = ShipCountry;
  }
  public orders with_ShipCountry(String ShipCountry) {
    this.ShipCountry = ShipCountry;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof orders)) {
      return false;
    }
    orders that = (orders) o;
    boolean equal = true;
    equal = equal && (this.OrderID == null ? that.OrderID == null : this.OrderID.equals(that.OrderID));
    equal = equal && (this.CustomerID == null ? that.CustomerID == null : this.CustomerID.equals(that.CustomerID));
    equal = equal && (this.EmployeeID == null ? that.EmployeeID == null : this.EmployeeID.equals(that.EmployeeID));
    equal = equal && (this.OrderDate == null ? that.OrderDate == null : this.OrderDate.equals(that.OrderDate));
    equal = equal && (this.RequiredDate == null ? that.RequiredDate == null : this.RequiredDate.equals(that.RequiredDate));
    equal = equal && (this.ShippedDate == null ? that.ShippedDate == null : this.ShippedDate.equals(that.ShippedDate));
    equal = equal && (this.ShipVia == null ? that.ShipVia == null : this.ShipVia.equals(that.ShipVia));
    equal = equal && (this.Freight == null ? that.Freight == null : this.Freight.equals(that.Freight));
    equal = equal && (this.ShipName == null ? that.ShipName == null : this.ShipName.equals(that.ShipName));
    equal = equal && (this.ShipAddress == null ? that.ShipAddress == null : this.ShipAddress.equals(that.ShipAddress));
    equal = equal && (this.ShipCity == null ? that.ShipCity == null : this.ShipCity.equals(that.ShipCity));
    equal = equal && (this.ShipRegion == null ? that.ShipRegion == null : this.ShipRegion.equals(that.ShipRegion));
    equal = equal && (this.ShipPostalCode == null ? that.ShipPostalCode == null : this.ShipPostalCode.equals(that.ShipPostalCode));
    equal = equal && (this.ShipCountry == null ? that.ShipCountry == null : this.ShipCountry.equals(that.ShipCountry));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof orders)) {
      return false;
    }
    orders that = (orders) o;
    boolean equal = true;
    equal = equal && (this.OrderID == null ? that.OrderID == null : this.OrderID.equals(that.OrderID));
    equal = equal && (this.CustomerID == null ? that.CustomerID == null : this.CustomerID.equals(that.CustomerID));
    equal = equal && (this.EmployeeID == null ? that.EmployeeID == null : this.EmployeeID.equals(that.EmployeeID));
    equal = equal && (this.OrderDate == null ? that.OrderDate == null : this.OrderDate.equals(that.OrderDate));
    equal = equal && (this.RequiredDate == null ? that.RequiredDate == null : this.RequiredDate.equals(that.RequiredDate));
    equal = equal && (this.ShippedDate == null ? that.ShippedDate == null : this.ShippedDate.equals(that.ShippedDate));
    equal = equal && (this.ShipVia == null ? that.ShipVia == null : this.ShipVia.equals(that.ShipVia));
    equal = equal && (this.Freight == null ? that.Freight == null : this.Freight.equals(that.Freight));
    equal = equal && (this.ShipName == null ? that.ShipName == null : this.ShipName.equals(that.ShipName));
    equal = equal && (this.ShipAddress == null ? that.ShipAddress == null : this.ShipAddress.equals(that.ShipAddress));
    equal = equal && (this.ShipCity == null ? that.ShipCity == null : this.ShipCity.equals(that.ShipCity));
    equal = equal && (this.ShipRegion == null ? that.ShipRegion == null : this.ShipRegion.equals(that.ShipRegion));
    equal = equal && (this.ShipPostalCode == null ? that.ShipPostalCode == null : this.ShipPostalCode.equals(that.ShipPostalCode));
    equal = equal && (this.ShipCountry == null ? that.ShipCountry == null : this.ShipCountry.equals(that.ShipCountry));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.OrderID = JdbcWritableBridge.readLong(1, __dbResults);
    this.CustomerID = JdbcWritableBridge.readString(2, __dbResults);
    this.EmployeeID = JdbcWritableBridge.readLong(3, __dbResults);
    this.OrderDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.RequiredDate = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.ShippedDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.ShipVia = JdbcWritableBridge.readLong(7, __dbResults);
    this.Freight = JdbcWritableBridge.readDouble(8, __dbResults);
    this.ShipName = JdbcWritableBridge.readString(9, __dbResults);
    this.ShipAddress = JdbcWritableBridge.readString(10, __dbResults);
    this.ShipCity = JdbcWritableBridge.readString(11, __dbResults);
    this.ShipRegion = JdbcWritableBridge.readString(12, __dbResults);
    this.ShipPostalCode = JdbcWritableBridge.readString(13, __dbResults);
    this.ShipCountry = JdbcWritableBridge.readString(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.OrderID = JdbcWritableBridge.readLong(1, __dbResults);
    this.CustomerID = JdbcWritableBridge.readString(2, __dbResults);
    this.EmployeeID = JdbcWritableBridge.readLong(3, __dbResults);
    this.OrderDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.RequiredDate = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.ShippedDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.ShipVia = JdbcWritableBridge.readLong(7, __dbResults);
    this.Freight = JdbcWritableBridge.readDouble(8, __dbResults);
    this.ShipName = JdbcWritableBridge.readString(9, __dbResults);
    this.ShipAddress = JdbcWritableBridge.readString(10, __dbResults);
    this.ShipCity = JdbcWritableBridge.readString(11, __dbResults);
    this.ShipRegion = JdbcWritableBridge.readString(12, __dbResults);
    this.ShipPostalCode = JdbcWritableBridge.readString(13, __dbResults);
    this.ShipCountry = JdbcWritableBridge.readString(14, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(OrderID, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(CustomerID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(EmployeeID, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(OrderDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(RequiredDate, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ShippedDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(ShipVia, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(Freight, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(ShipName, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ShipAddress, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ShipCity, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ShipRegion, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ShipPostalCode, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ShipCountry, 14 + __off, 12, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(OrderID, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(CustomerID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(EmployeeID, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(OrderDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(RequiredDate, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ShippedDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(ShipVia, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(Freight, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(ShipName, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ShipAddress, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ShipCity, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ShipRegion, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ShipPostalCode, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ShipCountry, 14 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.OrderID = null;
    } else {
    this.OrderID = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.CustomerID = null;
    } else {
    this.CustomerID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EmployeeID = null;
    } else {
    this.EmployeeID = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.OrderDate = null;
    } else {
    this.OrderDate = new Timestamp(__dataIn.readLong());
    this.OrderDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.RequiredDate = null;
    } else {
    this.RequiredDate = new Timestamp(__dataIn.readLong());
    this.RequiredDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ShippedDate = null;
    } else {
    this.ShippedDate = new Timestamp(__dataIn.readLong());
    this.ShippedDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ShipVia = null;
    } else {
    this.ShipVia = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Freight = null;
    } else {
    this.Freight = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.ShipName = null;
    } else {
    this.ShipName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ShipAddress = null;
    } else {
    this.ShipAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ShipCity = null;
    } else {
    this.ShipCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ShipRegion = null;
    } else {
    this.ShipRegion = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ShipPostalCode = null;
    } else {
    this.ShipPostalCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ShipCountry = null;
    } else {
    this.ShipCountry = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.OrderID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.OrderID);
    }
    if (null == this.CustomerID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CustomerID);
    }
    if (null == this.EmployeeID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EmployeeID);
    }
    if (null == this.OrderDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.OrderDate.getTime());
    __dataOut.writeInt(this.OrderDate.getNanos());
    }
    if (null == this.RequiredDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.RequiredDate.getTime());
    __dataOut.writeInt(this.RequiredDate.getNanos());
    }
    if (null == this.ShippedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ShippedDate.getTime());
    __dataOut.writeInt(this.ShippedDate.getNanos());
    }
    if (null == this.ShipVia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ShipVia);
    }
    if (null == this.Freight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Freight);
    }
    if (null == this.ShipName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShipName);
    }
    if (null == this.ShipAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShipAddress);
    }
    if (null == this.ShipCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShipCity);
    }
    if (null == this.ShipRegion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShipRegion);
    }
    if (null == this.ShipPostalCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShipPostalCode);
    }
    if (null == this.ShipCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShipCountry);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.OrderID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.OrderID);
    }
    if (null == this.CustomerID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CustomerID);
    }
    if (null == this.EmployeeID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EmployeeID);
    }
    if (null == this.OrderDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.OrderDate.getTime());
    __dataOut.writeInt(this.OrderDate.getNanos());
    }
    if (null == this.RequiredDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.RequiredDate.getTime());
    __dataOut.writeInt(this.RequiredDate.getNanos());
    }
    if (null == this.ShippedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ShippedDate.getTime());
    __dataOut.writeInt(this.ShippedDate.getNanos());
    }
    if (null == this.ShipVia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ShipVia);
    }
    if (null == this.Freight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Freight);
    }
    if (null == this.ShipName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShipName);
    }
    if (null == this.ShipAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShipAddress);
    }
    if (null == this.ShipCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShipCity);
    }
    if (null == this.ShipRegion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShipRegion);
    }
    if (null == this.ShipPostalCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShipPostalCode);
    }
    if (null == this.ShipCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShipCountry);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(OrderID==null?"null":"" + OrderID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerID==null?"null":CustomerID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EmployeeID==null?"null":"" + EmployeeID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OrderDate==null?"null":"" + OrderDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RequiredDate==null?"null":"" + RequiredDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShippedDate==null?"null":"" + ShippedDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipVia==null?"null":"" + ShipVia, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Freight==null?"null":"" + Freight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipName==null?"null":ShipName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipAddress==null?"null":ShipAddress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipCity==null?"null":ShipCity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipRegion==null?"null":ShipRegion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipPostalCode==null?"null":ShipPostalCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipCountry==null?"null":ShipCountry, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(OrderID==null?"null":"" + OrderID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerID==null?"null":CustomerID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EmployeeID==null?"null":"" + EmployeeID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OrderDate==null?"null":"" + OrderDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RequiredDate==null?"null":"" + RequiredDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShippedDate==null?"null":"" + ShippedDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipVia==null?"null":"" + ShipVia, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Freight==null?"null":"" + Freight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipName==null?"null":ShipName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipAddress==null?"null":ShipAddress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipCity==null?"null":ShipCity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipRegion==null?"null":ShipRegion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipPostalCode==null?"null":ShipPostalCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipCountry==null?"null":ShipCountry, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OrderID = null; } else {
      this.OrderID = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CustomerID = null; } else {
      this.CustomerID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EmployeeID = null; } else {
      this.EmployeeID = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OrderDate = null; } else {
      this.OrderDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RequiredDate = null; } else {
      this.RequiredDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ShippedDate = null; } else {
      this.ShippedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ShipVia = null; } else {
      this.ShipVia = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Freight = null; } else {
      this.Freight = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShipName = null; } else {
      this.ShipName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShipAddress = null; } else {
      this.ShipAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShipCity = null; } else {
      this.ShipCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShipRegion = null; } else {
      this.ShipRegion = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShipPostalCode = null; } else {
      this.ShipPostalCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShipCountry = null; } else {
      this.ShipCountry = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OrderID = null; } else {
      this.OrderID = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CustomerID = null; } else {
      this.CustomerID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EmployeeID = null; } else {
      this.EmployeeID = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OrderDate = null; } else {
      this.OrderDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RequiredDate = null; } else {
      this.RequiredDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ShippedDate = null; } else {
      this.ShippedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ShipVia = null; } else {
      this.ShipVia = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Freight = null; } else {
      this.Freight = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShipName = null; } else {
      this.ShipName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShipAddress = null; } else {
      this.ShipAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShipCity = null; } else {
      this.ShipCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShipRegion = null; } else {
      this.ShipRegion = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShipPostalCode = null; } else {
      this.ShipPostalCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShipCountry = null; } else {
      this.ShipCountry = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    orders o = (orders) super.clone();
    o.OrderDate = (o.OrderDate != null) ? (java.sql.Timestamp) o.OrderDate.clone() : null;
    o.RequiredDate = (o.RequiredDate != null) ? (java.sql.Timestamp) o.RequiredDate.clone() : null;
    o.ShippedDate = (o.ShippedDate != null) ? (java.sql.Timestamp) o.ShippedDate.clone() : null;
    return o;
  }

  public void clone0(orders o) throws CloneNotSupportedException {
    o.OrderDate = (o.OrderDate != null) ? (java.sql.Timestamp) o.OrderDate.clone() : null;
    o.RequiredDate = (o.RequiredDate != null) ? (java.sql.Timestamp) o.RequiredDate.clone() : null;
    o.ShippedDate = (o.ShippedDate != null) ? (java.sql.Timestamp) o.ShippedDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("OrderID", this.OrderID);
    __sqoop$field_map.put("CustomerID", this.CustomerID);
    __sqoop$field_map.put("EmployeeID", this.EmployeeID);
    __sqoop$field_map.put("OrderDate", this.OrderDate);
    __sqoop$field_map.put("RequiredDate", this.RequiredDate);
    __sqoop$field_map.put("ShippedDate", this.ShippedDate);
    __sqoop$field_map.put("ShipVia", this.ShipVia);
    __sqoop$field_map.put("Freight", this.Freight);
    __sqoop$field_map.put("ShipName", this.ShipName);
    __sqoop$field_map.put("ShipAddress", this.ShipAddress);
    __sqoop$field_map.put("ShipCity", this.ShipCity);
    __sqoop$field_map.put("ShipRegion", this.ShipRegion);
    __sqoop$field_map.put("ShipPostalCode", this.ShipPostalCode);
    __sqoop$field_map.put("ShipCountry", this.ShipCountry);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("OrderID", this.OrderID);
    __sqoop$field_map.put("CustomerID", this.CustomerID);
    __sqoop$field_map.put("EmployeeID", this.EmployeeID);
    __sqoop$field_map.put("OrderDate", this.OrderDate);
    __sqoop$field_map.put("RequiredDate", this.RequiredDate);
    __sqoop$field_map.put("ShippedDate", this.ShippedDate);
    __sqoop$field_map.put("ShipVia", this.ShipVia);
    __sqoop$field_map.put("Freight", this.Freight);
    __sqoop$field_map.put("ShipName", this.ShipName);
    __sqoop$field_map.put("ShipAddress", this.ShipAddress);
    __sqoop$field_map.put("ShipCity", this.ShipCity);
    __sqoop$field_map.put("ShipRegion", this.ShipRegion);
    __sqoop$field_map.put("ShipPostalCode", this.ShipPostalCode);
    __sqoop$field_map.put("ShipCountry", this.ShipCountry);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
