// ORM class for table 'order_details'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Sep 26 22:06:52 UTC 2020
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

public class order_details extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_details.this.ID = (Long)value;
      }
    });
    setters.put("OrderID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_details.this.OrderID = (Long)value;
      }
    });
    setters.put("ProductID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_details.this.ProductID = (Long)value;
      }
    });
    setters.put("UnitPrice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_details.this.UnitPrice = (Double)value;
      }
    });
    setters.put("Quantity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_details.this.Quantity = (Integer)value;
      }
    });
    setters.put("Discount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_details.this.Discount = (Float)value;
      }
    });
  }
  public order_details() {
    init0();
  }
  private Long ID;
  public Long get_ID() {
    return ID;
  }
  public void set_ID(Long ID) {
    this.ID = ID;
  }
  public order_details with_ID(Long ID) {
    this.ID = ID;
    return this;
  }
  private Long OrderID;
  public Long get_OrderID() {
    return OrderID;
  }
  public void set_OrderID(Long OrderID) {
    this.OrderID = OrderID;
  }
  public order_details with_OrderID(Long OrderID) {
    this.OrderID = OrderID;
    return this;
  }
  private Long ProductID;
  public Long get_ProductID() {
    return ProductID;
  }
  public void set_ProductID(Long ProductID) {
    this.ProductID = ProductID;
  }
  public order_details with_ProductID(Long ProductID) {
    this.ProductID = ProductID;
    return this;
  }
  private Double UnitPrice;
  public Double get_UnitPrice() {
    return UnitPrice;
  }
  public void set_UnitPrice(Double UnitPrice) {
    this.UnitPrice = UnitPrice;
  }
  public order_details with_UnitPrice(Double UnitPrice) {
    this.UnitPrice = UnitPrice;
    return this;
  }
  private Integer Quantity;
  public Integer get_Quantity() {
    return Quantity;
  }
  public void set_Quantity(Integer Quantity) {
    this.Quantity = Quantity;
  }
  public order_details with_Quantity(Integer Quantity) {
    this.Quantity = Quantity;
    return this;
  }
  private Float Discount;
  public Float get_Discount() {
    return Discount;
  }
  public void set_Discount(Float Discount) {
    this.Discount = Discount;
  }
  public order_details with_Discount(Float Discount) {
    this.Discount = Discount;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof order_details)) {
      return false;
    }
    order_details that = (order_details) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.OrderID == null ? that.OrderID == null : this.OrderID.equals(that.OrderID));
    equal = equal && (this.ProductID == null ? that.ProductID == null : this.ProductID.equals(that.ProductID));
    equal = equal && (this.UnitPrice == null ? that.UnitPrice == null : this.UnitPrice.equals(that.UnitPrice));
    equal = equal && (this.Quantity == null ? that.Quantity == null : this.Quantity.equals(that.Quantity));
    equal = equal && (this.Discount == null ? that.Discount == null : this.Discount.equals(that.Discount));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof order_details)) {
      return false;
    }
    order_details that = (order_details) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.OrderID == null ? that.OrderID == null : this.OrderID.equals(that.OrderID));
    equal = equal && (this.ProductID == null ? that.ProductID == null : this.ProductID.equals(that.ProductID));
    equal = equal && (this.UnitPrice == null ? that.UnitPrice == null : this.UnitPrice.equals(that.UnitPrice));
    equal = equal && (this.Quantity == null ? that.Quantity == null : this.Quantity.equals(that.Quantity));
    equal = equal && (this.Discount == null ? that.Discount == null : this.Discount.equals(that.Discount));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ID = JdbcWritableBridge.readLong(1, __dbResults);
    this.OrderID = JdbcWritableBridge.readLong(2, __dbResults);
    this.ProductID = JdbcWritableBridge.readLong(3, __dbResults);
    this.UnitPrice = JdbcWritableBridge.readDouble(4, __dbResults);
    this.Quantity = JdbcWritableBridge.readInteger(5, __dbResults);
    this.Discount = JdbcWritableBridge.readFloat(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ID = JdbcWritableBridge.readLong(1, __dbResults);
    this.OrderID = JdbcWritableBridge.readLong(2, __dbResults);
    this.ProductID = JdbcWritableBridge.readLong(3, __dbResults);
    this.UnitPrice = JdbcWritableBridge.readDouble(4, __dbResults);
    this.Quantity = JdbcWritableBridge.readInteger(5, __dbResults);
    this.Discount = JdbcWritableBridge.readFloat(6, __dbResults);
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
    JdbcWritableBridge.writeLong(ID, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(OrderID, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(ProductID, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(UnitPrice, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(Quantity, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeFloat(Discount, 6 + __off, 7, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(ID, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(OrderID, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(ProductID, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(UnitPrice, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(Quantity, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeFloat(Discount, 6 + __off, 7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ID = null;
    } else {
    this.ID = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.OrderID = null;
    } else {
    this.OrderID = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.ProductID = null;
    } else {
    this.ProductID = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.UnitPrice = null;
    } else {
    this.UnitPrice = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Quantity = null;
    } else {
    this.Quantity = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Discount = null;
    } else {
    this.Discount = Float.valueOf(__dataIn.readFloat());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ID);
    }
    if (null == this.OrderID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.OrderID);
    }
    if (null == this.ProductID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ProductID);
    }
    if (null == this.UnitPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.UnitPrice);
    }
    if (null == this.Quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Quantity);
    }
    if (null == this.Discount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Discount);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ID);
    }
    if (null == this.OrderID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.OrderID);
    }
    if (null == this.ProductID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ProductID);
    }
    if (null == this.UnitPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.UnitPrice);
    }
    if (null == this.Quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Quantity);
    }
    if (null == this.Discount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Discount);
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
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":"" + ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OrderID==null?"null":"" + OrderID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductID==null?"null":"" + ProductID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitPrice==null?"null":"" + UnitPrice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Quantity==null?"null":"" + Quantity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Discount==null?"null":"" + Discount, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":"" + ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OrderID==null?"null":"" + OrderID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductID==null?"null":"" + ProductID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitPrice==null?"null":"" + UnitPrice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Quantity==null?"null":"" + Quantity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Discount==null?"null":"" + Discount, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = Long.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductID = null; } else {
      this.ProductID = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitPrice = null; } else {
      this.UnitPrice = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Quantity = null; } else {
      this.Quantity = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Discount = null; } else {
      this.Discount = Float.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = Long.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductID = null; } else {
      this.ProductID = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitPrice = null; } else {
      this.UnitPrice = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Quantity = null; } else {
      this.Quantity = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Discount = null; } else {
      this.Discount = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    order_details o = (order_details) super.clone();
    return o;
  }

  public void clone0(order_details o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("OrderID", this.OrderID);
    __sqoop$field_map.put("ProductID", this.ProductID);
    __sqoop$field_map.put("UnitPrice", this.UnitPrice);
    __sqoop$field_map.put("Quantity", this.Quantity);
    __sqoop$field_map.put("Discount", this.Discount);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("OrderID", this.OrderID);
    __sqoop$field_map.put("ProductID", this.ProductID);
    __sqoop$field_map.put("UnitPrice", this.UnitPrice);
    __sqoop$field_map.put("Quantity", this.Quantity);
    __sqoop$field_map.put("Discount", this.Discount);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
