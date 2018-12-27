package com.baizhi.service.impl;

import com.baizhi.dao.AlbumDao;
import com.baizhi.entity.Album;
import com.baizhi.entity.Chapter;
import com.baizhi.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 吉祥妙音功能Service实现
 */
@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    private AlbumDao albumDao;

    /**
     * 查询专辑与专辑章节
     *
     * @return List<Album>
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Album> queryAll() {
        return albumDao.queryAll();
    }

    /**
     * 查询一条专辑的详细信息
     *
     * @param id 编号
     * @return Album
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Album queryAlbum(String id) {
        return albumDao.queryAlbum(id);
    }

    /**
     * 添加一条专辑信息
     *
     * @param album 吉祥妙音实体类
     */
    @Override
    public void insert(Album album) {
        albumDao.insert(album);
    }

    /**
     * 添加一条专辑章节信息
     *
     * @param chapter 专辑章节实体类
     */
    @Override
    public void insert2(Chapter chapter) {
        albumDao.insert2(chapter);
    }
}
