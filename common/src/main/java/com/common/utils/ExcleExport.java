package com.common.utils;

import org.apache.poi.hssf.usermodel.*;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author：macadmin
 * @date：2016年1月14日 上午10:56:06
 * @version 1.0
 */
public class ExcleExport {

	private static HSSFWorkbook wb;

	/**
	 * 
	 * @param headr
	 *            标题
	 * @param data
	 *            数据源
	 * @param sheetName
	 *            sheet名称
	 * @param fileName
	 *            文件名
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	public static void exportExcle(String[] headr, List<Object[]> data, String sheetName, String fileName,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 处理中文文件名
		/*fileName = new String(fileName.getBytes("UTF-8"), "ISO8859-1");*/
		final String userAgent = request.getHeader("USER-AGENT");
		if(userAgent.indexOf("Chrome")>-1||userAgent.indexOf("Firefox")>-1){//火狐或谷歌
			fileName = new String(fileName.getBytes("UTF-8"), "ISO8859-1");
		}else{
			fileName = URLEncoder.encode(fileName,"UTF8");  
		}
		//sheetName = new String(sheetName.getBytes("UTF-8"), "ISO8859-1");

		// 指定下载的文件名
		response.setHeader("Content-Disposition", "attachment;filename=" + fileName + ".xls");
		response.setContentType("application/vnd.ms-excel");
		wb = new HSSFWorkbook();
		// 在excle中添加一个sheet页
		HSSFSheet sheet = wb.createSheet(sheetName);
		// 添加表头
		HSSFRow row = sheet.createRow(0);
		// 创建单元格并设置表头，设置表头居中
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 设置居中
		HSSFCell cell = null;
		int length = headr.length;// 考虑复用excle表头数据个数，单独申明出来
		for (int i = 0; i < length; i++) {
			cell = row.createCell(i);
			cell.setCellValue(headr[i]);
			cell.setCellStyle(style);
		}

		// 得到excle数据Map<String, Object> map : listData
		Object[] obj = null;
		for (int j = 0; j < data.size(); j++) {
			row = sheet.createRow(j + 1);
			obj = data.get(j);
			for (int i = 0; i < obj.length; i++) {
				cell = row.createCell(i);
				cell.setCellValue(obj[i] + "");
			}
		}
		wb.write(response.getOutputStream());// 文件写入
	}

}
