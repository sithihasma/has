package com.niit.BEDao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.BEmodel.Friend;



@Repository("friendDAO")
public class FriendDaoimpl implements FriendDAO {

	@Autowired
	SessionFactory sessionFactory;

	public FriendDaoimpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean createFriend(Friend friend) {
		try {
			sessionFactory.getCurrentSession().save(friend);
			return true;
		} catch (Exception e) {
			System.out.println("exception arised " + e);
			return false;
		}
	}

	public List<Friend> getAllFriendRequest(String username) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Friend where username=:uname");
		query.setParameter("uname", username);
		List<Friend> listFriends = query.list();
		return listFriends;
	}

	public List<Friend> getApprovedFriends(String username) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Friend where username=:uname and status='A'");
		query.setParameter("uname", username);
		List<Friend> listFriends = query.list();
		return listFriends;
	}

	public Friend getFriend(int friendId) {
		Session session = sessionFactory.openSession();
		Friend friend = (Friend) session.get(Friend.class, friendId);
		return friend;
	}

	@Transactional
	public boolean rejectFriendRequest(Friend friend) {
		try {
			friend.setStatus("R");
			sessionFactory.getCurrentSession().update(friend);
			return true;
		} catch (Exception e) {
			System.out.println("exception arised" + e);
			return false;
		}
	}

	@Transactional
	public boolean approveFriendRequest(Friend friend) {
		try {
			friend.setStatus("A");
			sessionFactory.getCurrentSession().update(friend);
			return true;
		} catch (Exception e) {
			System.out.println("exception arised" + e);
			return false;
		}
	}
	public Friend getFriends(String username, String friendid) {

		List<Friend> friend = null;
		
		String SQL = "FROM Friend where currentUser ='" + username + "' and friendName like '" + friendid + "%'";
	
		friend = sessionFactory.getCurrentSession().createQuery(SQL).list();
		if (!friend.isEmpty()) {
			return friend.get(0);
		}
		return null;
	}


}

