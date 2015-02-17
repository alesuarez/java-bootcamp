package com.carshop.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import com.carshop.model.Usuario;
import com.carshop.util.HibernateUtil;

public class UsuarioDAO {

	private Session session;

	public Usuario verificarDatos(Usuario usuario) throws Exception {
		Usuario us = null;

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			String hql = "FROM Usuario WHERE Nombre = '" + usuario.getNombre()
					+ "' and clave = '" + usuario.getClave() + "'";
			Query query = session.createQuery(hql);

			if (!query.list().isEmpty()) {
				us = (Usuario) query.list().get(0);
			}

		} catch (Exception e) {
			throw e;
		}

		return us;
	}
}

