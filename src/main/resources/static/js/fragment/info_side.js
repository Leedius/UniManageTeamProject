
function sc(){	
	
	const table = document.querySelector('table');
	
	const stuInfo = table.querySelectorAll('td')[1];
	
	const update = document.querySelector('.update');
	
	stuInfo.textContent = '';
	
	let str = '';
	str += '<ul><li>'
	str += '<a href="#" class="list-group-item active"> 학생기본정보</a>';
	str += '</li>';
	str += '<li><a href="#" class="list-group-item active"> 수정</a></li>';
	str += '</ul>';
	
	update.insertAdjacentHTML('afterbegin', str);
}