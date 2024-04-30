package Module_6.ComposerApp;

import java.util.ArrayList;
import java.util.List;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */
public class MemComposerDao implements ComposerDao {


    private List<Composer> composers = new ArrayList<>();

    public MemComposerDao() {

        Composer composer1 = new Composer(1,"composer1","genre1");
        Composer composer2 = new Composer(2,"composer2","genre2");
        Composer composer3 = new Composer(3,"composer3","genre3");
        Composer composer4 = new Composer(4,"composer4","genre4");
        Composer composer5 = new Composer(5,"composer5","genre5");

        composers.add(composer1);
        composers.add(composer2);
        composers.add(composer3);
        composers.add(composer4);
        composers.add(composer5);

    }

    /**
     *
     * @return all composers
     */
    @Override
    public List<Composer> findAll() {
        return composers;
    }

    /**
     *
     * @param key -> Input provided by the user on console
     * @return a particular product
     */
    @Override
    public Composer findBy(Integer key) {
        return composers.stream().
                filter(eachComposer->key == eachComposer.getId())
                .findAny()
                .orElse(new Composer(0,"default","default"));
    }

    /**
     *
     * @param entity -> Input provided by the user.
     *               Creates a new Composer object
     */@Override
    public void insert(Composer entity) {
        composers.add(entity);
    }
}
