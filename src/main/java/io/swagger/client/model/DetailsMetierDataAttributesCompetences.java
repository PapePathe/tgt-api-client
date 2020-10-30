/*
 * TAAG-AT/Api/v1/Etudiants
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
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
import io.swagger.client.model.DetailsMetierDataAttributesCompetencesData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DetailsMetierDataAttributesCompetences
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-30T17:21:14.807Z[GMT]")
public class DetailsMetierDataAttributesCompetences {
  @SerializedName("data")
  private List<DetailsMetierDataAttributesCompetencesData> data = null;

  public DetailsMetierDataAttributesCompetences data(List<DetailsMetierDataAttributesCompetencesData> data) {
    this.data = data;
    return this;
  }

  public DetailsMetierDataAttributesCompetences addDataItem(DetailsMetierDataAttributesCompetencesData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<DetailsMetierDataAttributesCompetencesData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<DetailsMetierDataAttributesCompetencesData> getData() {
    return data;
  }

  public void setData(List<DetailsMetierDataAttributesCompetencesData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailsMetierDataAttributesCompetences detailsMetierDataAttributesCompetences = (DetailsMetierDataAttributesCompetences) o;
    return Objects.equals(this.data, detailsMetierDataAttributesCompetences.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailsMetierDataAttributesCompetences {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
