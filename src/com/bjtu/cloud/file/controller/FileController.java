package com.bjtu.cloud.file.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.bjtu.cloud.file.entity.File;
import com.bjtu.cloud.file.service.FileService;

@Controller
@RequestMapping("file")
public class FileController {

	@Autowired
	private FileService fileService;

	/**
	 * @param userid
	 * @return
	 */
	@RequestMapping("list")
	public String list(Integer userid, Model model) {
		List<File> list = fileService.findFileListByUserId(userid);
		model.addAttribute("fileList", list);
		model.addAttribute("userid", userid);
		return "common/file/file";
	}

	@RequestMapping("findByName")
	public String findByName(String fname, Integer userid, Model model) {
		List<File> list = fileService.findFileListByNameAndUserId(fname, userid);
		model.addAttribute("userid", userid);
		model.addAttribute("fileList", list);
		model.addAttribute("fname", fname);
		return "common/file/file";
	}

	@RequestMapping("delete")
	public String delete(Integer userid, Integer fid, Model model) {
		fileService.delete(fid);
		// TODO 重复、、、重写
		List<File> list = fileService.findFileListByUserId(userid);
		model.addAttribute("fileList", list);
		model.addAttribute("userid", userid);
		return "common/file/file";

	}

	@RequestMapping("uploadPage")
	public String uploadPage(Integer userid, Model model) {
		model.addAttribute("userid", userid);
		return "common/file/upload";
	}

	@RequestMapping("upload")
	public String upload(HttpServletRequest request) throws IllegalStateException, IOException {
		long  startTime=System.currentTimeMillis();
		System.out.println(startTime);
		// 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 检查form中是否有enctype="multipart/form-data"
		if (multipartResolver.isMultipart(request)) {
			// 将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 获取multiRequest 中所有的文件名
			Iterator iter = multiRequest.getFileNames();

			while (iter.hasNext()) {
				// 一次遍历所有文件
				MultipartFile file = multiRequest.getFile(iter.next().toString());
				if (file != null) {
					String path = "E:/upload/" + file.getOriginalFilename();
					// 上传
					file.transferTo(new java.io.File(path));
				}

			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");
		return "";
	}

}
