/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.db.h2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.example.db.h2.tables.Author;
import org.jooq.example.db.h2.tables.Book;
import org.jooq.example.db.h2.tables.BookStore;
import org.jooq.example.db.h2.tables.BookToBookStore;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 553192922;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.AUTHOR</code>.
     */
    public final Author AUTHOR = org.jooq.example.db.h2.tables.Author.AUTHOR;

    /**
     * The table <code>PUBLIC.BOOK</code>.
     */
    public final Book BOOK = org.jooq.example.db.h2.tables.Book.BOOK;

    /**
     * The table <code>PUBLIC.BOOK_STORE</code>.
     */
    public final BookStore BOOK_STORE = org.jooq.example.db.h2.tables.BookStore.BOOK_STORE;

    /**
     * The table <code>PUBLIC.BOOK_TO_BOOK_STORE</code>.
     */
    public final BookToBookStore BOOK_TO_BOOK_STORE = org.jooq.example.db.h2.tables.BookToBookStore.BOOK_TO_BOOK_STORE;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.SYSTEM_SEQUENCE_D8B3D50F_9168_4860_A3E1_2FEB0B1B4BF0,
            Sequences.SYSTEM_SEQUENCE_F19F5CF8_8B3C_46C1_9B5D_658E565D472C,
            Sequences.S_AUTHOR_ID,
            Sequences.S_BOOK_ID);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Author.AUTHOR,
            Book.BOOK,
            BookStore.BOOK_STORE,
            BookToBookStore.BOOK_TO_BOOK_STORE);
    }
}
