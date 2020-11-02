// ORM class for table 'AlphabeticalProducts'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Sep 26 22:25:31 UTC 2020
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

public class AlphabeticalProducts extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("ProductID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AlphabeticalProducts.this.ProductID = (Long)value;
      }
    });
    setters.put("ProductName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AlphabeticalProducts.this.ProductName = (String)value;
      }
    });
    setters.put("SupplierID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AlphabeticalProducts.this.SupplierID = (Long)value;
      }
    });
    setters.put("CategoryID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AlphabeticalProducts.this.CategoryID = (Integer)value;
      }
    });
    setters.put("QuantityPerUnit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AlphabeticalProducts.this.QuantityPerUnit = (String)value;
      }
    });
    setters.put("UnitPrice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AlphabeticalProducts.this.UnitPrice = (Double)value;
      }
    });
    setters.put("UnitsInStock", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AlphabeticalProducts.this.UnitsInStock = (Integer)value;
      }
    });
    setters.put("UnitsOnOrder", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AlphabeticalProducts.this.UnitsOnOrder = (Integer)value;
      }
    });
    setters.put("ReorderLevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AlphabeticalProducts.this.ReorderLevel = (Integer)value;
      }
    });
    setters.put("Discontinued", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AlphabeticalProducts.this.Discontinued = (String)value;
      }
    });
  }
  public AlphabeticalProducts() {
    init0();
  }
  private Long ProductID;
  public Long get_ProductID() {
    return ProductID;
  }
  public void set_ProductID(Long ProductID) {
    this.ProductID = ProductID;
  }
  public AlphabeticalProducts with_ProductID(Long ProductID) {
    this.ProductID = ProductID;
    return this;
  }
  private String ProductName;
  public String get_ProductName() {
    return ProductName;
  }
  public void set_ProductName(String ProductName) {
    this.ProductName = ProductName;
  }
  public AlphabeticalProducts with_ProductName(String ProductName) {
    this.ProductName = ProductName;
    return this;
  }
  private Long SupplierID;
  public Long get_SupplierID() {
    return SupplierID;
  }
  public void set_SupplierID(Long SupplierID) {
    this.SupplierID = SupplierID;
  }
  public AlphabeticalProducts with_SupplierID(Long SupplierID) {
    this.SupplierID = SupplierID;
    return this;
  }
  private Integer CategoryID;
  public Integer get_CategoryID() {
    return CategoryID;
  }
  public void set_CategoryID(Integer CategoryID) {
    this.CategoryID = CategoryID;
  }
  public AlphabeticalProducts with_CategoryID(Integer CategoryID) {
    this.CategoryID = CategoryID;
    return this;
  }
  private String QuantityPerUnit;
  public String get_QuantityPerUnit() {
    return QuantityPerUnit;
  }
  public void set_QuantityPerUnit(String QuantityPerUnit) {
    this.QuantityPerUnit = QuantityPerUnit;
  }
  public AlphabeticalProducts with_QuantityPerUnit(String QuantityPerUnit) {
    this.QuantityPerUnit = QuantityPerUnit;
    return this;
  }
  private Double UnitPrice;
  public Double get_UnitPrice() {
    return UnitPrice;
  }
  public void set_UnitPrice(Double UnitPrice) {
    this.UnitPrice = UnitPrice;
  }
  public AlphabeticalProducts with_UnitPrice(Double UnitPrice) {
    this.UnitPrice = UnitPrice;
    return this;
  }
  private Integer UnitsInStock;
  public Integer get_UnitsInStock() {
    return UnitsInStock;
  }
  public void set_UnitsInStock(Integer UnitsInStock) {
    this.UnitsInStock = UnitsInStock;
  }
  public AlphabeticalProducts with_UnitsInStock(Integer UnitsInStock) {
    this.UnitsInStock = UnitsInStock;
    return this;
  }
  private Integer UnitsOnOrder;
  public Integer get_UnitsOnOrder() {
    return UnitsOnOrder;
  }
  public void set_UnitsOnOrder(Integer UnitsOnOrder) {
    this.UnitsOnOrder = UnitsOnOrder;
  }
  public AlphabeticalProducts with_UnitsOnOrder(Integer UnitsOnOrder) {
    this.UnitsOnOrder = UnitsOnOrder;
    return this;
  }
  private Integer ReorderLevel;
  public Integer get_ReorderLevel() {
    return ReorderLevel;
  }
  public void set_ReorderLevel(Integer ReorderLevel) {
    this.ReorderLevel = ReorderLevel;
  }
  public AlphabeticalProducts with_ReorderLevel(Integer ReorderLevel) {
    this.ReorderLevel = ReorderLevel;
    return this;
  }
  private String Discontinued;
  public String get_Discontinued() {
    return Discontinued;
  }
  public void set_Discontinued(String Discontinued) {
    this.Discontinued = Discontinued;
  }
  public AlphabeticalProducts with_Discontinued(String Discontinued) {
    this.Discontinued = Discontinued;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AlphabeticalProducts)) {
      return false;
    }
    AlphabeticalProducts that = (AlphabeticalProducts) o;
    boolean equal = true;
    equal = equal && (this.ProductID == null ? that.ProductID == null : this.ProductID.equals(that.ProductID));
    equal = equal && (this.ProductName == null ? that.ProductName == null : this.ProductName.equals(that.ProductName));
    equal = equal && (this.SupplierID == null ? that.SupplierID == null : this.SupplierID.equals(that.SupplierID));
    equal = equal && (this.CategoryID == null ? that.CategoryID == null : this.CategoryID.equals(that.CategoryID));
    equal = equal && (this.QuantityPerUnit == null ? that.QuantityPerUnit == null : this.QuantityPerUnit.equals(that.QuantityPerUnit));
    equal = equal && (this.UnitPrice == null ? that.UnitPrice == null : this.UnitPrice.equals(that.UnitPrice));
    equal = equal && (this.UnitsInStock == null ? that.UnitsInStock == null : this.UnitsInStock.equals(that.UnitsInStock));
    equal = equal && (this.UnitsOnOrder == null ? that.UnitsOnOrder == null : this.UnitsOnOrder.equals(that.UnitsOnOrder));
    equal = equal && (this.ReorderLevel == null ? that.ReorderLevel == null : this.ReorderLevel.equals(that.ReorderLevel));
    equal = equal && (this.Discontinued == null ? that.Discontinued == null : this.Discontinued.equals(that.Discontinued));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AlphabeticalProducts)) {
      return false;
    }
    AlphabeticalProducts that = (AlphabeticalProducts) o;
    boolean equal = true;
    equal = equal && (this.ProductID == null ? that.ProductID == null : this.ProductID.equals(that.ProductID));
    equal = equal && (this.ProductName == null ? that.ProductName == null : this.ProductName.equals(that.ProductName));
    equal = equal && (this.SupplierID == null ? that.SupplierID == null : this.SupplierID.equals(that.SupplierID));
    equal = equal && (this.CategoryID == null ? that.CategoryID == null : this.CategoryID.equals(that.CategoryID));
    equal = equal && (this.QuantityPerUnit == null ? that.QuantityPerUnit == null : this.QuantityPerUnit.equals(that.QuantityPerUnit));
    equal = equal && (this.UnitPrice == null ? that.UnitPrice == null : this.UnitPrice.equals(that.UnitPrice));
    equal = equal && (this.UnitsInStock == null ? that.UnitsInStock == null : this.UnitsInStock.equals(that.UnitsInStock));
    equal = equal && (this.UnitsOnOrder == null ? that.UnitsOnOrder == null : this.UnitsOnOrder.equals(that.UnitsOnOrder));
    equal = equal && (this.ReorderLevel == null ? that.ReorderLevel == null : this.ReorderLevel.equals(that.ReorderLevel));
    equal = equal && (this.Discontinued == null ? that.Discontinued == null : this.Discontinued.equals(that.Discontinued));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ProductID = JdbcWritableBridge.readLong(1, __dbResults);
    this.ProductName = JdbcWritableBridge.readString(2, __dbResults);
    this.SupplierID = JdbcWritableBridge.readLong(3, __dbResults);
    this.CategoryID = JdbcWritableBridge.readInteger(4, __dbResults);
    this.QuantityPerUnit = JdbcWritableBridge.readString(5, __dbResults);
    this.UnitPrice = JdbcWritableBridge.readDouble(6, __dbResults);
    this.UnitsInStock = JdbcWritableBridge.readInteger(7, __dbResults);
    this.UnitsOnOrder = JdbcWritableBridge.readInteger(8, __dbResults);
    this.ReorderLevel = JdbcWritableBridge.readInteger(9, __dbResults);
    this.Discontinued = JdbcWritableBridge.readString(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ProductID = JdbcWritableBridge.readLong(1, __dbResults);
    this.ProductName = JdbcWritableBridge.readString(2, __dbResults);
    this.SupplierID = JdbcWritableBridge.readLong(3, __dbResults);
    this.CategoryID = JdbcWritableBridge.readInteger(4, __dbResults);
    this.QuantityPerUnit = JdbcWritableBridge.readString(5, __dbResults);
    this.UnitPrice = JdbcWritableBridge.readDouble(6, __dbResults);
    this.UnitsInStock = JdbcWritableBridge.readInteger(7, __dbResults);
    this.UnitsOnOrder = JdbcWritableBridge.readInteger(8, __dbResults);
    this.ReorderLevel = JdbcWritableBridge.readInteger(9, __dbResults);
    this.Discontinued = JdbcWritableBridge.readString(10, __dbResults);
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
    JdbcWritableBridge.writeLong(ProductID, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(ProductName, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(SupplierID, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(CategoryID, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(QuantityPerUnit, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(UnitPrice, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(UnitsInStock, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(UnitsOnOrder, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(ReorderLevel, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(Discontinued, 10 + __off, 1, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(ProductID, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(ProductName, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(SupplierID, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(CategoryID, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(QuantityPerUnit, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(UnitPrice, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(UnitsInStock, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(UnitsOnOrder, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(ReorderLevel, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(Discontinued, 10 + __off, 1, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ProductID = null;
    } else {
    this.ProductID = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.ProductName = null;
    } else {
    this.ProductName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SupplierID = null;
    } else {
    this.SupplierID = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.CategoryID = null;
    } else {
    this.CategoryID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.QuantityPerUnit = null;
    } else {
    this.QuantityPerUnit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UnitPrice = null;
    } else {
    this.UnitPrice = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.UnitsInStock = null;
    } else {
    this.UnitsInStock = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.UnitsOnOrder = null;
    } else {
    this.UnitsOnOrder = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ReorderLevel = null;
    } else {
    this.ReorderLevel = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Discontinued = null;
    } else {
    this.Discontinued = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ProductID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ProductID);
    }
    if (null == this.ProductName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProductName);
    }
    if (null == this.SupplierID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.SupplierID);
    }
    if (null == this.CategoryID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CategoryID);
    }
    if (null == this.QuantityPerUnit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, QuantityPerUnit);
    }
    if (null == this.UnitPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.UnitPrice);
    }
    if (null == this.UnitsInStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.UnitsInStock);
    }
    if (null == this.UnitsOnOrder) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.UnitsOnOrder);
    }
    if (null == this.ReorderLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ReorderLevel);
    }
    if (null == this.Discontinued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Discontinued);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ProductID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ProductID);
    }
    if (null == this.ProductName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProductName);
    }
    if (null == this.SupplierID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.SupplierID);
    }
    if (null == this.CategoryID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CategoryID);
    }
    if (null == this.QuantityPerUnit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, QuantityPerUnit);
    }
    if (null == this.UnitPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.UnitPrice);
    }
    if (null == this.UnitsInStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.UnitsInStock);
    }
    if (null == this.UnitsOnOrder) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.UnitsOnOrder);
    }
    if (null == this.ReorderLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ReorderLevel);
    }
    if (null == this.Discontinued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Discontinued);
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
    __sb.append(FieldFormatter.escapeAndEnclose(ProductID==null?"null":"" + ProductID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductName==null?"null":ProductName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SupplierID==null?"null":"" + SupplierID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CategoryID==null?"null":"" + CategoryID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QuantityPerUnit==null?"null":QuantityPerUnit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitPrice==null?"null":"" + UnitPrice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitsInStock==null?"null":"" + UnitsInStock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitsOnOrder==null?"null":"" + UnitsOnOrder, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ReorderLevel==null?"null":"" + ReorderLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Discontinued==null?"null":Discontinued, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ProductID==null?"null":"" + ProductID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductName==null?"null":ProductName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SupplierID==null?"null":"" + SupplierID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CategoryID==null?"null":"" + CategoryID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QuantityPerUnit==null?"null":QuantityPerUnit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitPrice==null?"null":"" + UnitPrice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitsInStock==null?"null":"" + UnitsInStock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitsOnOrder==null?"null":"" + UnitsOnOrder, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ReorderLevel==null?"null":"" + ReorderLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Discontinued==null?"null":Discontinued, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductID = null; } else {
      this.ProductID = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ProductName = null; } else {
      this.ProductName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SupplierID = null; } else {
      this.SupplierID = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CategoryID = null; } else {
      this.CategoryID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.QuantityPerUnit = null; } else {
      this.QuantityPerUnit = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitsInStock = null; } else {
      this.UnitsInStock = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitsOnOrder = null; } else {
      this.UnitsOnOrder = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ReorderLevel = null; } else {
      this.ReorderLevel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Discontinued = null; } else {
      this.Discontinued = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductID = null; } else {
      this.ProductID = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ProductName = null; } else {
      this.ProductName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SupplierID = null; } else {
      this.SupplierID = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CategoryID = null; } else {
      this.CategoryID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.QuantityPerUnit = null; } else {
      this.QuantityPerUnit = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitsInStock = null; } else {
      this.UnitsInStock = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitsOnOrder = null; } else {
      this.UnitsOnOrder = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ReorderLevel = null; } else {
      this.ReorderLevel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Discontinued = null; } else {
      this.Discontinued = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    AlphabeticalProducts o = (AlphabeticalProducts) super.clone();
    return o;
  }

  public void clone0(AlphabeticalProducts o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("ProductID", this.ProductID);
    __sqoop$field_map.put("ProductName", this.ProductName);
    __sqoop$field_map.put("SupplierID", this.SupplierID);
    __sqoop$field_map.put("CategoryID", this.CategoryID);
    __sqoop$field_map.put("QuantityPerUnit", this.QuantityPerUnit);
    __sqoop$field_map.put("UnitPrice", this.UnitPrice);
    __sqoop$field_map.put("UnitsInStock", this.UnitsInStock);
    __sqoop$field_map.put("UnitsOnOrder", this.UnitsOnOrder);
    __sqoop$field_map.put("ReorderLevel", this.ReorderLevel);
    __sqoop$field_map.put("Discontinued", this.Discontinued);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ProductID", this.ProductID);
    __sqoop$field_map.put("ProductName", this.ProductName);
    __sqoop$field_map.put("SupplierID", this.SupplierID);
    __sqoop$field_map.put("CategoryID", this.CategoryID);
    __sqoop$field_map.put("QuantityPerUnit", this.QuantityPerUnit);
    __sqoop$field_map.put("UnitPrice", this.UnitPrice);
    __sqoop$field_map.put("UnitsInStock", this.UnitsInStock);
    __sqoop$field_map.put("UnitsOnOrder", this.UnitsOnOrder);
    __sqoop$field_map.put("ReorderLevel", this.ReorderLevel);
    __sqoop$field_map.put("Discontinued", this.Discontinued);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}