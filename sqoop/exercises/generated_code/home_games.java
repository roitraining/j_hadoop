// ORM class for table 'home_games'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Nov 14 15:34:18 MST 2018
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

public class home_games extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        home_games.this.year = (Integer)value;
      }
    });
    setters.put("league", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        home_games.this.league = (String)value;
      }
    });
    setters.put("team", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        home_games.this.team = (String)value;
      }
    });
    setters.put("park", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        home_games.this.park = (String)value;
      }
    });
    setters.put("first", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        home_games.this.first = (java.sql.Date)value;
      }
    });
    setters.put("last", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        home_games.this.last = (java.sql.Date)value;
      }
    });
    setters.put("games", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        home_games.this.games = (Integer)value;
      }
    });
    setters.put("openings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        home_games.this.openings = (Integer)value;
      }
    });
    setters.put("attendance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        home_games.this.attendance = (Integer)value;
      }
    });
  }
  public home_games() {
    init0();
  }
  private Integer year;
  public Integer get_year() {
    return year;
  }
  public void set_year(Integer year) {
    this.year = year;
  }
  public home_games with_year(Integer year) {
    this.year = year;
    return this;
  }
  private String league;
  public String get_league() {
    return league;
  }
  public void set_league(String league) {
    this.league = league;
  }
  public home_games with_league(String league) {
    this.league = league;
    return this;
  }
  private String team;
  public String get_team() {
    return team;
  }
  public void set_team(String team) {
    this.team = team;
  }
  public home_games with_team(String team) {
    this.team = team;
    return this;
  }
  private String park;
  public String get_park() {
    return park;
  }
  public void set_park(String park) {
    this.park = park;
  }
  public home_games with_park(String park) {
    this.park = park;
    return this;
  }
  private java.sql.Date first;
  public java.sql.Date get_first() {
    return first;
  }
  public void set_first(java.sql.Date first) {
    this.first = first;
  }
  public home_games with_first(java.sql.Date first) {
    this.first = first;
    return this;
  }
  private java.sql.Date last;
  public java.sql.Date get_last() {
    return last;
  }
  public void set_last(java.sql.Date last) {
    this.last = last;
  }
  public home_games with_last(java.sql.Date last) {
    this.last = last;
    return this;
  }
  private Integer games;
  public Integer get_games() {
    return games;
  }
  public void set_games(Integer games) {
    this.games = games;
  }
  public home_games with_games(Integer games) {
    this.games = games;
    return this;
  }
  private Integer openings;
  public Integer get_openings() {
    return openings;
  }
  public void set_openings(Integer openings) {
    this.openings = openings;
  }
  public home_games with_openings(Integer openings) {
    this.openings = openings;
    return this;
  }
  private Integer attendance;
  public Integer get_attendance() {
    return attendance;
  }
  public void set_attendance(Integer attendance) {
    this.attendance = attendance;
  }
  public home_games with_attendance(Integer attendance) {
    this.attendance = attendance;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof home_games)) {
      return false;
    }
    home_games that = (home_games) o;
    boolean equal = true;
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    equal = equal && (this.league == null ? that.league == null : this.league.equals(that.league));
    equal = equal && (this.team == null ? that.team == null : this.team.equals(that.team));
    equal = equal && (this.park == null ? that.park == null : this.park.equals(that.park));
    equal = equal && (this.first == null ? that.first == null : this.first.equals(that.first));
    equal = equal && (this.last == null ? that.last == null : this.last.equals(that.last));
    equal = equal && (this.games == null ? that.games == null : this.games.equals(that.games));
    equal = equal && (this.openings == null ? that.openings == null : this.openings.equals(that.openings));
    equal = equal && (this.attendance == null ? that.attendance == null : this.attendance.equals(that.attendance));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof home_games)) {
      return false;
    }
    home_games that = (home_games) o;
    boolean equal = true;
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    equal = equal && (this.league == null ? that.league == null : this.league.equals(that.league));
    equal = equal && (this.team == null ? that.team == null : this.team.equals(that.team));
    equal = equal && (this.park == null ? that.park == null : this.park.equals(that.park));
    equal = equal && (this.first == null ? that.first == null : this.first.equals(that.first));
    equal = equal && (this.last == null ? that.last == null : this.last.equals(that.last));
    equal = equal && (this.games == null ? that.games == null : this.games.equals(that.games));
    equal = equal && (this.openings == null ? that.openings == null : this.openings.equals(that.openings));
    equal = equal && (this.attendance == null ? that.attendance == null : this.attendance.equals(that.attendance));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.year = JdbcWritableBridge.readInteger(1, __dbResults);
    this.league = JdbcWritableBridge.readString(2, __dbResults);
    this.team = JdbcWritableBridge.readString(3, __dbResults);
    this.park = JdbcWritableBridge.readString(4, __dbResults);
    this.first = JdbcWritableBridge.readDate(5, __dbResults);
    this.last = JdbcWritableBridge.readDate(6, __dbResults);
    this.games = JdbcWritableBridge.readInteger(7, __dbResults);
    this.openings = JdbcWritableBridge.readInteger(8, __dbResults);
    this.attendance = JdbcWritableBridge.readInteger(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.year = JdbcWritableBridge.readInteger(1, __dbResults);
    this.league = JdbcWritableBridge.readString(2, __dbResults);
    this.team = JdbcWritableBridge.readString(3, __dbResults);
    this.park = JdbcWritableBridge.readString(4, __dbResults);
    this.first = JdbcWritableBridge.readDate(5, __dbResults);
    this.last = JdbcWritableBridge.readDate(6, __dbResults);
    this.games = JdbcWritableBridge.readInteger(7, __dbResults);
    this.openings = JdbcWritableBridge.readInteger(8, __dbResults);
    this.attendance = JdbcWritableBridge.readInteger(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(year, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(league, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(park, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(first, 5 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(last, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(games, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(openings, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(attendance, 9 + __off, 4, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(year, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(league, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(park, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(first, 5 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(last, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(games, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(openings, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(attendance, 9 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.year = null;
    } else {
    this.year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.league = null;
    } else {
    this.league = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team = null;
    } else {
    this.team = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.park = null;
    } else {
    this.park = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.first = null;
    } else {
    this.first = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.last = null;
    } else {
    this.last = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.games = null;
    } else {
    this.games = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.openings = null;
    } else {
    this.openings = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.attendance = null;
    } else {
    this.attendance = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
    if (null == this.league) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, league);
    }
    if (null == this.team) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team);
    }
    if (null == this.park) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, park);
    }
    if (null == this.first) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.first.getTime());
    }
    if (null == this.last) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last.getTime());
    }
    if (null == this.games) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.games);
    }
    if (null == this.openings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.openings);
    }
    if (null == this.attendance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.attendance);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
    if (null == this.league) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, league);
    }
    if (null == this.team) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team);
    }
    if (null == this.park) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, park);
    }
    if (null == this.first) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.first.getTime());
    }
    if (null == this.last) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last.getTime());
    }
    if (null == this.games) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.games);
    }
    if (null == this.openings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.openings);
    }
    if (null == this.attendance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.attendance);
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
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(league==null?"null":league, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team==null?"null":team, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(park==null?"null":park, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first==null?"null":"" + first, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last==null?"null":"" + last, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(games==null?"null":"" + games, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(openings==null?"null":"" + openings, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(attendance==null?"null":"" + attendance, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(league==null?"null":league, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team==null?"null":team, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(park==null?"null":park, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first==null?"null":"" + first, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last==null?"null":"" + last, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(games==null?"null":"" + games, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(openings==null?"null":"" + openings, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(attendance==null?"null":"" + attendance, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.league = null; } else {
      this.league = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.team = null; } else {
      this.team = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.park = null; } else {
      this.park = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first = null; } else {
      this.first = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last = null; } else {
      this.last = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.games = null; } else {
      this.games = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.openings = null; } else {
      this.openings = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.attendance = null; } else {
      this.attendance = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.league = null; } else {
      this.league = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.team = null; } else {
      this.team = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.park = null; } else {
      this.park = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first = null; } else {
      this.first = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last = null; } else {
      this.last = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.games = null; } else {
      this.games = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.openings = null; } else {
      this.openings = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.attendance = null; } else {
      this.attendance = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    home_games o = (home_games) super.clone();
    o.first = (o.first != null) ? (java.sql.Date) o.first.clone() : null;
    o.last = (o.last != null) ? (java.sql.Date) o.last.clone() : null;
    return o;
  }

  public void clone0(home_games o) throws CloneNotSupportedException {
    o.first = (o.first != null) ? (java.sql.Date) o.first.clone() : null;
    o.last = (o.last != null) ? (java.sql.Date) o.last.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("year", this.year);
    __sqoop$field_map.put("league", this.league);
    __sqoop$field_map.put("team", this.team);
    __sqoop$field_map.put("park", this.park);
    __sqoop$field_map.put("first", this.first);
    __sqoop$field_map.put("last", this.last);
    __sqoop$field_map.put("games", this.games);
    __sqoop$field_map.put("openings", this.openings);
    __sqoop$field_map.put("attendance", this.attendance);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("year", this.year);
    __sqoop$field_map.put("league", this.league);
    __sqoop$field_map.put("team", this.team);
    __sqoop$field_map.put("park", this.park);
    __sqoop$field_map.put("first", this.first);
    __sqoop$field_map.put("last", this.last);
    __sqoop$field_map.put("games", this.games);
    __sqoop$field_map.put("openings", this.openings);
    __sqoop$field_map.put("attendance", this.attendance);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
