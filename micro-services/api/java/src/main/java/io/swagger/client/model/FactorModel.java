/*
 * QES Quant Service API
 * QES Quant Service API provides easy access to Risk/Optimization API 
 *
 * OpenAPI spec version: 0.0.4
 * Contact: luo.qes@wolferesearch.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FactorModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-22T20:31:04.892Z")
public class FactorModel {
  @SerializedName("ID")
  private String ID = null;

  @SerializedName("CATEGORY")
  private String CATEGORY = null;

  @SerializedName("SUBCATEGORY")
  private String SUBCATEGORY = null;

  @SerializedName("DESCRIPTION")
  private String DESCRIPTION = null;

  public FactorModel ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Unique Indentifier
   * @return ID
  **/
  @ApiModelProperty(value = "Unique Indentifier")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public FactorModel CATEGORY(String CATEGORY) {
    this.CATEGORY = CATEGORY;
    return this;
  }

   /**
   * Unique Name
   * @return CATEGORY
  **/
  @ApiModelProperty(value = "Unique Name")
  public String getCATEGORY() {
    return CATEGORY;
  }

  public void setCATEGORY(String CATEGORY) {
    this.CATEGORY = CATEGORY;
  }

  public FactorModel SUBCATEGORY(String SUBCATEGORY) {
    this.SUBCATEGORY = SUBCATEGORY;
    return this;
  }

   /**
   * Applicable Sector
   * @return SUBCATEGORY
  **/
  @ApiModelProperty(value = "Applicable Sector")
  public String getSUBCATEGORY() {
    return SUBCATEGORY;
  }

  public void setSUBCATEGORY(String SUBCATEGORY) {
    this.SUBCATEGORY = SUBCATEGORY;
  }

  public FactorModel DESCRIPTION(String DESCRIPTION) {
    this.DESCRIPTION = DESCRIPTION;
    return this;
  }

   /**
   * Descriptive Text
   * @return DESCRIPTION
  **/
  @ApiModelProperty(value = "Descriptive Text")
  public String getDESCRIPTION() {
    return DESCRIPTION;
  }

  public void setDESCRIPTION(String DESCRIPTION) {
    this.DESCRIPTION = DESCRIPTION;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactorModel factorModel = (FactorModel) o;
    return Objects.equals(this.ID, factorModel.ID) &&
        Objects.equals(this.CATEGORY, factorModel.CATEGORY) &&
        Objects.equals(this.SUBCATEGORY, factorModel.SUBCATEGORY) &&
        Objects.equals(this.DESCRIPTION, factorModel.DESCRIPTION);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, CATEGORY, SUBCATEGORY, DESCRIPTION);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactorModel {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    CATEGORY: ").append(toIndentedString(CATEGORY)).append("\n");
    sb.append("    SUBCATEGORY: ").append(toIndentedString(SUBCATEGORY)).append("\n");
    sb.append("    DESCRIPTION: ").append(toIndentedString(DESCRIPTION)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

