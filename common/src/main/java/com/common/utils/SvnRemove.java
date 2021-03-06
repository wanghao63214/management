package com.common.utils;

import java.io.File;

/**
 * 删除指定目录.svn文件 * @author ardo *
 */
public class SvnRemove {
    /**
     * 删除项目中的.svn目录（目录中有文件需要递归删除）      * @param dirName  项目路径
     */
    public static void cleanSVNDir(String dirName) {
        try {
            File file = new File(dirName);
            if (file.isDirectory()) {
                File[] c_file = file.listFiles();
                for (int i = 0; i < c_file.length; i++) {
                    File s_file = c_file[i];
                    String fileName = s_file.getName();
                    if (s_file.isDirectory() && fileName.equals(".svn")) {
                        cleanSVNFile(s_file.getPath());
                        s_file.delete();
                    } else {
                        cleanSVNDir(s_file.getPath());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除SVN目录下的文件      * @param svnPath
     */
    public static void cleanSVNFile(String svnPath) {
        try {
            File file = new File(svnPath);
            if (file.isDirectory()) {
                File[] c_file = file.listFiles();
                for (int i = 0; i < c_file.length; i++) {
                    File s_file = c_file[i];
                    if (s_file.isDirectory()) {                          /*删除目录下的文件*/
                        cleanSVNFile(s_file.getPath());                          /*删除目录*/
                        s_file.delete();
                    } else {
                        s_file.delete();
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        cleanSVNDir("E:\\GitRep\\management");
    }
}
