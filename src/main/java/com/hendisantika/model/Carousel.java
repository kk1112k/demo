package com.hendisantika.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-ecommerce
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 7/30/22
 * Time: 20:24
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carousel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;
}
