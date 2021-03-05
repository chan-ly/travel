package cn.itcast.travel.service;

import cn.itcast.travel.domain.Favorite;

public interface FavoriteService {
    boolean isFavorite(String rid, int uid);
    void add(String rid, int uid);
}
