package com.zhoujc.domain;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 小区实体类
 *
 * @author 25975
 */

@Data
@Table(name = "tb_community")
public class Community implements Serializable {

  @Id
  private Integer id;
  private String code;
  private String name;
  private String address;
  private double area;
  private Integer total_buildings;
  private Integer total_households;
  private Integer greening_rate;
  private String thumbnail;
  private String developer;
  private String estate_company;
  private Date create_time;
  private Date update_time;
  private String status;

}
