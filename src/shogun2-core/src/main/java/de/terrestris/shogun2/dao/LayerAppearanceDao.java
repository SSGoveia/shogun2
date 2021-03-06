package de.terrestris.shogun2.dao;

import org.springframework.stereotype.Repository;

import de.terrestris.shogun2.model.layer.appearance.LayerAppearance;

@Repository("layerAppearanceDao")
public class LayerAppearanceDao<E extends LayerAppearance> extends
    GenericHibernateDao<E, Integer> {

    /**
     * Public default constructor for this DAO.
     */
    @SuppressWarnings("unchecked")
    public LayerAppearanceDao() {
        super((Class<E>) LayerAppearance.class);
    }

    /**
     * Constructor that has to be called by subclasses.
     *
     * @param clazz
     */
    protected LayerAppearanceDao(Class<E> clazz) {
        super(clazz);
    }

}
