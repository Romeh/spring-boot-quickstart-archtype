package ${package}.${artifactId}.domain;

import java.io.Serializable;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import javax.persistence.*;
import java.util.Map;

/**
 * Created by id961900 on 09/08/2017.
 */
@Entity
@Table(name = "Applications")
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationItem implements Serializable {
    @Column(name = "alertContent", nullable = false)
    @ElementCollection(targetClass = String.class)
    private Map<String, String> applicationContent;
    @Column(name = "applicationCode", nullable = false)
    private String applicationCode;
    @Id
    @GeneratedValue
    @ApiModelProperty(notes = "the auto internal generated id by alert manager DB , not required to be entered by user into REST API ")
    private Long id;

}
