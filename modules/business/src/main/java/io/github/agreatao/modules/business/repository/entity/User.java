package io.github.agreatao.modules.business.repository.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "tb_user")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class User implements Serializable {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    @Column(name = "name")
    private String name;


    @Column(name = "sex", length = 1, columnDefinition = "Integer default 1")
    private Integer sex;

    @JsonFormat(pattern = "YYYY-MM-dd")
    @Column(name = "birth")
    private Date birth;


    @Column(name = "phone", length = 13, nullable = false)
    private String phone;

    @Column(name = "password", length = 512)
    private String password;

}
