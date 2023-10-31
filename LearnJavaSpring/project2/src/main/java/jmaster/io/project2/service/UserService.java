package jmaster.io.project2.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import jmaster.io.project2.dto.PageDTO;
import jmaster.io.project2.dto.UserDTO;
import jmaster.io.project2.dto.UserRoleDTO;
import jmaster.io.project2.entity.User;
import jmaster.io.project2.entity.UserRole;
import jmaster.io.project2.repo.UserRepo;
import jmaster.io.project2.repo.UserRoleRepo;

@Service
public class UserService {
	
	// -> Controller đóng vai trò là tiếp nhận và map các request.
	
	// -> Service này đóng vai trò là nơi xử lý If-Else logic nghiệp vụ.
	//            Cũng như là convert dữ liệu giữa 2 thằng DTO và Entity
	
    // ->Còn Lớp repository đóng vai trò là tương tác với database, dữ liệu.
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	UserRoleRepo userRoleRepo;
	
	
	// khi thao tác crud thì hay dùng thêm Transactional để đảm bảo thêm thành công.
    // Ví dụ khi trong hàm create có nhiều hàm, mà có hàm bị fail thì các hàm trước đó sẽ
    // rollback lại và ko update nữa.
	@Transactional   
	public void create(UserDTO userDTO) {
		
		User user = new User(); //convert từ thằng DTO sang Entity
		
		user.setName(userDTO.getName());
		user.setUsername(userDTO.getUsername());
		user.setPassword(userDTO.getPassword());
		user.setAvatar(userDTO.getAvatar());
		user.setBirthdate(userDTO.getBirthdate());
		
		userRepo.save(user);
		
		List<UserRoleDTO> userRoleDTOs = userDTO.getUserRoles();
		for(UserRoleDTO userRoleDTO : userRoleDTOs) {
			if(userRoleDTO.getRole() != null) {
				UserRole userRole = new UserRole();
				userRole.setUser(user);
				userRole.setRole(userRoleDTO.getRole());
				userRoleRepo.save(userRole);  
			}
		}
	}
	
	public PageDTO<UserDTO> searchByName(String name, int page, int size){
		Pageable pageable = PageRequest.of(page, size);
		
		Page<User> pageRS = userRepo.searchByName("%" + name + "%", pageable);
		
		PageDTO<UserDTO> pageDTO = new PageDTO<>();
		
		pageDTO.setTotalPages(pageRS.getTotalPages());
		pageDTO.setTotalElements(pageRS.getTotalElements());
		
		List<UserDTO> userDTOs = new ArrayList<>();
		for(User user : pageRS.getContent()) {
			userDTOs.add(new ModelMapper().map(user, UserDTO.class));
			//chuyển đổi đối tượng user thành đối tượng UserDTO 
			//và thêm đối tượng UserDTO đã được chuyển đổi vào danh sách userDTOs.
		}
		
		pageDTO.setContent(userDTOs);
		
		return pageDTO;
				
	}
	
	public  UserDTO getById(int id) {
		User user = userRepo.findById(id)
				.orElseThrow(NoResultException::new); // java8 lambda
		
		UserDTO userDTO = new UserDTO();
		// có thể sd modelmapper để tránh lặp lại các thao tác set/get này.
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		userDTO.setUsername(user.getUsername());
		userDTO.setAvatar(user.getAvatar());
		userDTO.setBirthdate(user.getBirthdate());
		userDTO.setCreatedAt(user.getCreatedAt());
		
		//nếu dùng modelmapper:
		//nó sẽ copy các thuộc tính của user sang cho UserDTO, ko cần mất công get/set
		
		//UserDTO userDTO = new ModelMapper().map(user, UserDTO.class);
		
		
		return userDTO;
	}
}
