/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.rapleaf.hank.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HostDomainPartitionMetadata implements org.apache.thrift.TBase<HostDomainPartitionMetadata, HostDomainPartitionMetadata._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HostDomainPartitionMetadata");

  private static final org.apache.thrift.protocol.TField CURRENT_VERSION_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("current_version_number", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DELETABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("deletable", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HostDomainPartitionMetadataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HostDomainPartitionMetadataTupleSchemeFactory());
  }

  public int current_version_number; // optional
  public boolean deletable; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CURRENT_VERSION_NUMBER((short)1, "current_version_number"),
    DELETABLE((short)2, "deletable");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CURRENT_VERSION_NUMBER
          return CURRENT_VERSION_NUMBER;
        case 2: // DELETABLE
          return DELETABLE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CURRENT_VERSION_NUMBER_ISSET_ID = 0;
  private static final int __DELETABLE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.CURRENT_VERSION_NUMBER};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CURRENT_VERSION_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("current_version_number", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DELETABLE, new org.apache.thrift.meta_data.FieldMetaData("deletable", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HostDomainPartitionMetadata.class, metaDataMap);
  }

  public HostDomainPartitionMetadata() {
  }

  public HostDomainPartitionMetadata(
    boolean deletable)
  {
    this();
    this.deletable = deletable;
    set_deletable_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HostDomainPartitionMetadata(HostDomainPartitionMetadata other) {
    __isset_bitfield = other.__isset_bitfield;
    this.current_version_number = other.current_version_number;
    this.deletable = other.deletable;
  }

  public HostDomainPartitionMetadata deepCopy() {
    return new HostDomainPartitionMetadata(this);
  }

  @Override
  public void clear() {
    set_current_version_number_isSet(false);
    this.current_version_number = 0;
    set_deletable_isSet(false);
    this.deletable = false;
  }

  public int get_current_version_number() {
    return this.current_version_number;
  }

  public HostDomainPartitionMetadata set_current_version_number(int current_version_number) {
    this.current_version_number = current_version_number;
    set_current_version_number_isSet(true);
    return this;
  }

  public void unset_current_version_number() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CURRENT_VERSION_NUMBER_ISSET_ID);
  }

  /** Returns true if field current_version_number is set (has been assigned a value) and false otherwise */
  public boolean is_set_current_version_number() {
    return EncodingUtils.testBit(__isset_bitfield, __CURRENT_VERSION_NUMBER_ISSET_ID);
  }

  public void set_current_version_number_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CURRENT_VERSION_NUMBER_ISSET_ID, value);
  }

  public boolean is_deletable() {
    return this.deletable;
  }

  public HostDomainPartitionMetadata set_deletable(boolean deletable) {
    this.deletable = deletable;
    set_deletable_isSet(true);
    return this;
  }

  public void unset_deletable() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DELETABLE_ISSET_ID);
  }

  /** Returns true if field deletable is set (has been assigned a value) and false otherwise */
  public boolean is_set_deletable() {
    return EncodingUtils.testBit(__isset_bitfield, __DELETABLE_ISSET_ID);
  }

  public void set_deletable_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DELETABLE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CURRENT_VERSION_NUMBER:
      if (value == null) {
        unset_current_version_number();
      } else {
        set_current_version_number((Integer)value);
      }
      break;

    case DELETABLE:
      if (value == null) {
        unset_deletable();
      } else {
        set_deletable((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CURRENT_VERSION_NUMBER:
      return Integer.valueOf(get_current_version_number());

    case DELETABLE:
      return Boolean.valueOf(is_deletable());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CURRENT_VERSION_NUMBER:
      return is_set_current_version_number();
    case DELETABLE:
      return is_set_deletable();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HostDomainPartitionMetadata)
      return this.equals((HostDomainPartitionMetadata)that);
    return false;
  }

  public boolean equals(HostDomainPartitionMetadata that) {
    if (that == null)
      return false;

    boolean this_present_current_version_number = true && this.is_set_current_version_number();
    boolean that_present_current_version_number = true && that.is_set_current_version_number();
    if (this_present_current_version_number || that_present_current_version_number) {
      if (!(this_present_current_version_number && that_present_current_version_number))
        return false;
      if (this.current_version_number != that.current_version_number)
        return false;
    }

    boolean this_present_deletable = true;
    boolean that_present_deletable = true;
    if (this_present_deletable || that_present_deletable) {
      if (!(this_present_deletable && that_present_deletable))
        return false;
      if (this.deletable != that.deletable)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_current_version_number = true && (is_set_current_version_number());
    builder.append(present_current_version_number);
    if (present_current_version_number)
      builder.append(current_version_number);

    boolean present_deletable = true;
    builder.append(present_deletable);
    if (present_deletable)
      builder.append(deletable);

    return builder.toHashCode();
  }

  public int compareTo(HostDomainPartitionMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    HostDomainPartitionMetadata typedOther = (HostDomainPartitionMetadata)other;

    lastComparison = Boolean.valueOf(is_set_current_version_number()).compareTo(typedOther.is_set_current_version_number());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_current_version_number()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.current_version_number, typedOther.current_version_number);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_deletable()).compareTo(typedOther.is_set_deletable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_deletable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deletable, typedOther.deletable);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HostDomainPartitionMetadata(");
    boolean first = true;

    if (is_set_current_version_number()) {
      sb.append("current_version_number:");
      sb.append(this.current_version_number);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("deletable:");
    sb.append(this.deletable);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'deletable' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HostDomainPartitionMetadataStandardSchemeFactory implements SchemeFactory {
    public HostDomainPartitionMetadataStandardScheme getScheme() {
      return new HostDomainPartitionMetadataStandardScheme();
    }
  }

  private static class HostDomainPartitionMetadataStandardScheme extends StandardScheme<HostDomainPartitionMetadata> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HostDomainPartitionMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CURRENT_VERSION_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.current_version_number = iprot.readI32();
              struct.set_current_version_number_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DELETABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.deletable = iprot.readBool();
              struct.set_deletable_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.is_set_deletable()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'deletable' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, HostDomainPartitionMetadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.is_set_current_version_number()) {
        oprot.writeFieldBegin(CURRENT_VERSION_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.current_version_number);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DELETABLE_FIELD_DESC);
      oprot.writeBool(struct.deletable);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HostDomainPartitionMetadataTupleSchemeFactory implements SchemeFactory {
    public HostDomainPartitionMetadataTupleScheme getScheme() {
      return new HostDomainPartitionMetadataTupleScheme();
    }
  }

  private static class HostDomainPartitionMetadataTupleScheme extends TupleScheme<HostDomainPartitionMetadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HostDomainPartitionMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.deletable);
      BitSet optionals = new BitSet();
      if (struct.is_set_current_version_number()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.is_set_current_version_number()) {
        oprot.writeI32(struct.current_version_number);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HostDomainPartitionMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.deletable = iprot.readBool();
      struct.set_deletable_isSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.current_version_number = iprot.readI32();
        struct.set_current_version_number_isSet(true);
      }
    }
  }

}

