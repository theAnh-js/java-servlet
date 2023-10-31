package jmaster.io.project2.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import antlr.StringUtils;
import jmaster.io.project2.dto.PageDTO;
import jmaster.io.project2.dto.UserDTO;
import jmaster.io.project2.entity.User;
import jmaster.io.project2.repo.UserRepo;
import jmaster.io.project2.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepo userRepo;

	@Autowired
	UserService userService; // thay vì gọi thẳng qua thằng UserRepo thì ta sẽ gọi qua thằng này.

	@GetMapping("/new")
	public String add() {
		return "user/add.html";
	}

	@PostMapping("/new")
	public String add(@ModelAttribute UserDTO u) throws IllegalAccessException, IOException {

		System.out.println("line51");
		if (u.getFile() != null && !u.getFile().isEmpty()) {
			final String UPLOAD_FOLDER = "C:\\Users\\meiou\\OneDrive\\デスクトップ\\javaJMaster\\";

			String filename = u.getFile().getOriginalFilename();
			File newFile = new File(UPLOAD_FOLDER + filename);

			u.getFile().transferTo(newFile);

			u.setAvatar(filename); // save to db

		}

		// gọi qua service -> đây là mô hình 3 lớp: controller - service - repository
		// khi sử dụng mô hình này ta luôn phải gọi qua service để sử dụng thằng repo.
		userService.create(u);
		System.out.println("line67: " + u.getName() + u.getUsername());
		return "redirect:/user/search";// dung them / ở view khi bắt đầu, redirect thì đường ẫn ới ần âơâ
	}

	// /user/download?filename=abc.jpg
	@GetMapping("/download")
	public void download(@RequestParam("filename") String filename, HttpServletResponse response) throws IOException {

		final String UPLOAD_FOLDER = "C:\\Users\\meiou\\OneDrive\\デスクトップ\\javaJMaster\\";

		File file = new File(UPLOAD_FOLDER + filename);

		Files.copy(file.toPath(), response.getOutputStream());
	}
	// 20220310-A7402259_TP_V.jpg
	// http://localhost:8081/user/download/?filename=20220310-A7402259_TP_V.jpg

	@GetMapping("/delete") // ?id=1
	public String delete(@RequestParam("id") int id) {
		userRepo.deleteById(id);

		return "redirect:/user/search";
	}

	@GetMapping("/search")
	public String search( // để required = false thì khi gọi search không bắt buộc phải truyền tham số đó,
							// mặc định là true
							// Khi đó, nếu ta ko truyền thì nó sẽ mặc định là null,
							// Nên kiểu số nên để kiểu class(ví dụ: ko phải là int mà là Integer)
			@RequestParam(name = "id", required = false) Integer id,
			@RequestParam(name = "name", required = false) String name,

			@RequestParam(name = "start", required = false) @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm") Date start,
			@RequestParam(name = "end", required = false) @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm") Date end,

			@RequestParam(name = "size", required = false) Integer size,
			@RequestParam(name = "page", required = false) Integer page, Model model) {

		System.out.println("10555555555555555555555555555");
		size = size == null ? 10 : size;
		page = page == null ? 0 : page;
		name = name == null ? "" : name;
		System.out.println("10999999999999999999999999999");
		if (id != null) {
			List<User> users = userRepo.findAllById(Arrays.asList(id));

			model.addAttribute("totalPage", 1);
			model.addAttribute("count", users.size());
			model.addAttribute("userList", users);
		} else {
			System.out.println("1177777777777777777777");
			System.out.println("name: " + name);
			System.out.println(name + page + size + "11888888888888888888888888888");
			PageDTO<UserDTO> pageRS = userService.searchByName("%" + name + "%", page, size);
			System.out.println("119999999999999999");
			model.addAttribute("totalPage", pageRS.getTotalPages());
			System.out.println("1211111111111111111111");
			model.addAttribute("count", pageRS.getTotalElements());
			model.addAttribute("userList", pageRS.getContent());
		}

		System.out.println("1255555555555555555555555");
		// lưu lại dữ liệu set sang view
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		model.addAttribute("start", start);
		model.addAttribute("end", end);

		model.addAttribute("page", page);
		model.addAttribute("size", size);
		System.out.println("line132-------------------");
		return "user/search.html";

	}
}
