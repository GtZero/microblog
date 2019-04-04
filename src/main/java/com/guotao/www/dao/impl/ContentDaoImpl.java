package com.guotao.www.dao.impl;

import com.guotao.www.dao.ContentDao;
import com.guotao.www.entity.Content;
import com.guotao.www.entity.Role;
import com.guotao.www.entity.UserInformation;
import com.guotao.www.util.ConnectionUtil;
import com.guotao.www.util.PageBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * GuoT 19.3.27
 */
public class ContentDaoImpl implements ContentDao {
    /**
     * 通过博文编号，获取一篇完整博文信息
     * @param contentId
     * @return
     */
    @Override
    public Content getOneContent(String contentId) {
        Connection con = ConnectionUtil.getMysqlConnection();
        String sql = "select * from content where content_id = ? and is_delete = 0;";
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        Content content = null;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, contentId);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                content = new Content();
                content.setContentId(rs.getString("content_id"));
                content.setContentUserId(rs.getString("content_user_id"));
                content.setContentUserName(rs.getString("content_user_name"));
                content.setContentTypeId(rs.getString("content_user_name"));
                content.setContentTitle(rs.getString("content_title"));
                content.setDisplayImage(rs.getString("display_image"));
                content.setDescription(rs.getString("description"));
                content.setContentData(rs.getString("content_data"));
                content.setContentNumber(rs.getString("content_number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return content;
    }

    /**
     * 获取特定用户的所有博文，使用分页
     * 使用场合:用户获取自己所有博文时
     * @param userId
     * @param contentPageBean
     * @return
     */
    @Override
    public PageBean<Content> getUserAllContent(String userId, PageBean<Content> contentPageBean) {
        Connection con = ConnectionUtil.getMysqlConnection();
        String sql = "select *, count(content_id) as totalCount from content where content_user_id = ? and is_delete = '0' limit ?,?";
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        PageBean<Content> page = contentPageBean;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, contentPageBean.getStartNum().toString());
            preparedStatement.setString(3, contentPageBean.getPageSize().toString());
            rs = preparedStatement.executeQuery();
            page = getContentPageBean(rs, page);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(rs, preparedStatement, con);
        }
        return page;
    }

    /**
     * 获取特定用户的所有博文，使用分页
     * 使用场合:管理员获取所有用户博文
     * @param contentPageBean
     * @return
     */
    @Override
    public PageBean<Content> getAllContent(PageBean<Content> contentPageBean) {
        Connection con = ConnectionUtil.getMysqlConnection();
        String sql = "select *, count(content_id) as totalCount from content where is_delete = '0' limit ?,?";
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        PageBean<Content> page = contentPageBean;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(2, contentPageBean.getStartNum().toString());
            preparedStatement.setString(3, contentPageBean.getPageSize().toString());
            rs = preparedStatement.executeQuery();
            page = getContentPageBean(rs, page);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(rs, preparedStatement, con);
        }
        return page;
    }

    /**
     * 用户向content表中新添一篇博文
     * @param content
     */
    @Override
    public void insertContent(Content content) {
        Connection con = ConnectionUtil.getMysqlConnection();
        String sql = "insert into content (content_id, content_user_id, content_user_name, content_type_id, content_title, display_image, description," +
                " content_data,content_number, is_delete, created_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, now());";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, content.getContentId());
            preparedStatement.setString(2, content.getContentUserId());
            preparedStatement.setString(3, content.getContentUserName());
            preparedStatement.setString(4, content.getContentTypeId());
            preparedStatement.setString(5, content.getContentTitle());
            preparedStatement.setString(6, content.getDisplayImage());
            preparedStatement.setString(7, content.getDescription());
            preparedStatement.setString(8, content.getContentData());
            preparedStatement.setString(9, content.getContentNumber());
            preparedStatement.setString(10, content.getIsDelete());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(null, preparedStatement, con);
        }
    }

    /**
     * 用户/管理员删除对应编号的博文
     * @param contentId
     */
    @Override
    public void deleteContent(String contentId) {
        Connection con = ConnectionUtil.getMysqlConnection();
        String sql = "update content set is_delete = '1', update_time = now() where content_id = ?;";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, contentId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(null, preparedStatement, con);
        }
    }

    public PageBean<Content> getContentPageBean(ResultSet rs, PageBean<Content> page) throws SQLException {
        List<Content> list = new ArrayList<>();
        String totalCount = null;
        while (rs.next()) {
            Content content = new Content();
            content.setContentId(rs.getString("content_id"));
            content.setContentUserId(rs.getString("content_user_id"));
            content.setContentUserName(rs.getString("content_user_name"));
            content.setContentTypeId(rs.getString("content_type_id"));
            content.setContentTitle(rs.getString("content_title"));
            content.setDisplayImage(rs.getString("display_image"));
            content.setDescription(rs.getString("description"));
            content.setContentData(rs.getString("content_data"));
            content.setContentNumber(rs.getString("content_number"));
            list.add(content);
            totalCount = rs.getString("totalCount");
        }
        page.setTotalCount(Integer.valueOf(totalCount));
        page.setList(list);
        return page;
    }
}
