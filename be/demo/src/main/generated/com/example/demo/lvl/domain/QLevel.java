package com.example.demo.lvl.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLevel is a Querydsl query type for Level
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLevel extends EntityPathBase<Level> {

    private static final long serialVersionUID = -1019383936L;

    public static final QLevel level1 = new QLevel("level1");

    public final NumberPath<Long> level = createNumber("level", Long.class);

    public QLevel(String variable) {
        super(Level.class, forVariable(variable));
    }

    public QLevel(Path<? extends Level> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLevel(PathMetadata metadata) {
        super(Level.class, metadata);
    }

}

