package org.apache.hadoop.hive.ql.tools;

import lombok.Data;
import lombok.ToString;
import org.apache.hadoop.hive.ql.parse.ASTNode;

import java.util.Optional;

@ToString(includeFieldNames=true)
@Data(staticConstructor="of") public class IdParentValue {
    final Integer id;
    final Optional<Integer> parentId;
    final ASTNode node;

}
