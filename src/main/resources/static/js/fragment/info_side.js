
function mainMenu(menuCode, menuUrl){

	location.href=`/memberMenu${menuUrl}?menuCode=${menuCode}`;
	
	
}

function subMenu(subMenuCode, subMenuUrl, menuCode){
	location.href=`/memberMenu${subMenuUrl}?menuCode=${menuCode}`;
	// subMenuCode=${subMenuCode} 
}

//내 정보 관리
function myInfo(){	
	//location.href="/member/myInfo";
	
	const table = document.querySelector('table');
	
	const select0 = table.querySelectorAll('td')[0];
	const select2 = table.querySelectorAll('td')[2];
	const select4 = table.querySelectorAll('td')[4];
	const select6 = table.querySelectorAll('td')[6];
	const select8 = table.querySelectorAll('td')[8];
	const select10 = table.querySelectorAll('td')[10];
	
	const stuInfo = table.querySelectorAll('td')[1];	
	const update = document.querySelector('.update');
	
	const stuInfo2 = table.querySelectorAll('td')[3];
	const update2 = document.querySelector('.update2');
	
	const stuInfo3 = table.querySelectorAll('td')[5];
	const update3 = document.querySelector('.update3');
	
	select0.classList.add('active');
	select2.classList.remove('active');
	select4.classList.remove('active');
	select6.classList.remove('active');
	select8.classList.remove('active');
	select10.classList.remove('active');
	
	stuInfo.textContent = '';
	stuInfo2.textContent = '';
	stuInfo3.textContent = '';
	
	let str = '';
	str += '<a th:href="@{/member/myInfo}" class="list-group-item active">MyInfo</a>';
	
	let str2 ='';
	str2 += '<a th:href="@{/member/changePwd}" class="list-group-item">비밀번호변경</a>';
	
	let str3 ='';
	
	update.insertAdjacentHTML('afterbegin', str);
	update2.insertAdjacentHTML('afterbegin', str2);
	update3.insertAdjacentHTML('afterbegin', str3);
	
	
}



//학적관리
function myStu(){	
	//location.href="/member/academicManage";
	
	const table = document.querySelector('table');
	
	const select0 = table.querySelectorAll('td')[0];
	const select2 = table.querySelectorAll('td')[2];
	const select4 = table.querySelectorAll('td')[4];
	const select6 = table.querySelectorAll('td')[6];
	const select8 = table.querySelectorAll('td')[8];
	const select10 = table.querySelectorAll('td')[10];
		
	const stuInfo = table.querySelectorAll('td')[1];	
	const update = document.querySelector('.update');
	
	
	const stuInfo2 = table.querySelectorAll('td')[3];
	const update2 = document.querySelector('.update2');
	
	const stuInfo3 = table.querySelectorAll('td')[5];
	const update3 = document.querySelector('.update3');

	select0.classList.remove('active');
	select2.classList.add('active');
	select4.classList.remove('active');
	select6.classList.remove('active');
	select8.classList.remove('active');
	select10.classList.remove('active');

	stuInfo.textContent = '';
	stuInfo2.textContent = '';
	stuInfo3.textContent = '';
	
	let str = '';
	str += '<a th:href="@{/member/academicManage}" class="list-group-item active">학생기본정보</a>';
	
	let str2 ='';
	let str3 ='';
	
	update.insertAdjacentHTML('afterbegin', str);
	update2.insertAdjacentHTML('afterbegin', str2);
	update3.insertAdjacentHTML('afterbegin', str3);
}

//교과수업
function stuClass(){
	const table = document.querySelector('table');
	
	const select0 = table.querySelectorAll('td')[0];
	const select2 = table.querySelectorAll('td')[2];
	const select4 = table.querySelectorAll('td')[4];
	const select6 = table.querySelectorAll('td')[6];
	const select8 = table.querySelectorAll('td')[8];
	const select10 = table.querySelectorAll('td')[10];
	
	const stuInfo = table.querySelectorAll('td')[1];	
	const update = document.querySelector('.update');
	
	const stuInfo2 = table.querySelectorAll('td')[3];
	const update2 = document.querySelector('.update2');
	
	const stuInfo3 = table.querySelectorAll('td')[5];
	const update3 = document.querySelector('.update3');
	
	select0.classList.remove('active');
	select2.classList.remove('active');
	select4.classList.add('active');
	select6.classList.remove('active');
	select8.classList.remove('active');
	select10.classList.remove('active');
	
	stuInfo.textContent = '';
	stuInfo2.textContent = '';
	stuInfo3.textContent = '';
	
	let str = '';
	str += '<a href="#" class="list-group-item active">성적 조회</a>';
	
	let str2 ='';
	str2 += '<a href="#" class="list-group-item">수강 신청</a>';
	
	let str3 ='';
	str3 += '<a href="#" class="list-group-item">수업 평가</a>';
	
	update.insertAdjacentHTML('afterbegin', str);
	update2.insertAdjacentHTML('afterbegin', str2);
	update3.insertAdjacentHTML('afterbegin', str3);
}

// 게시판
function board(){
	const table = document.querySelector('table');
	
	const select0 = table.querySelectorAll('td')[0];
	const select2 = table.querySelectorAll('td')[2];
	const select4 = table.querySelectorAll('td')[4];
	const select6 = table.querySelectorAll('td')[6];
	const select8 = table.querySelectorAll('td')[8];
	const select10 = table.querySelectorAll('td')[10];
	
	select0.classList.remove('active');
	select2.classList.remove('active');
	select4.classList.remove('active');
	select6.classList.add('active');
	select8.classList.remove('active');
	select10.classList.remove('active');
	
	const stuInfo = table.querySelectorAll('td')[1];	
	const update = document.querySelector('.update');
	
	const stuInfo2 = table.querySelectorAll('td')[3];
	const update2 = document.querySelector('.update2');
	
	const stuInfo3 = table.querySelectorAll('td')[5];
	const update3 = document.querySelector('.update3');
	
	stuInfo.textContent = '';
	stuInfo2.textContent = '';
	stuInfo3.textContent = '';
	
	let str = '';
	str += '<a href="#" class="list-group-item active">정보 공유</a>';
	
	let str2 ='';
	str2 += '<a href="#" class="list-group-item">중고 나라</a>';
	
	let str3 ='<a href="#" class="list-group-item">나의 게시글 조회</a>';
	
	update.insertAdjacentHTML('afterbegin', str);
	update2.insertAdjacentHTML('afterbegin', str2);
	update3.insertAdjacentHTML('afterbegin', str3);
}

//캘린더
function calender(){
	const table = document.querySelector('table');
	
	const select0 = table.querySelectorAll('td')[0];
	const select2 = table.querySelectorAll('td')[2];
	const select4 = table.querySelectorAll('td')[4];
	const select6 = table.querySelectorAll('td')[6];
	const select8 = table.querySelectorAll('td')[8];
	const select10 = table.querySelectorAll('td')[10];
	
	const stuInfo = table.querySelectorAll('td')[1];	
	const update = document.querySelector('.update');
	
	const stuInfo2 = table.querySelectorAll('td')[3];
	const update2 = document.querySelector('.update2');
	
	const stuInfo3 = table.querySelectorAll('td')[5];
	const update3 = document.querySelector('.update3');
	
	select0.classList.remove('active');
	select2.classList.remove('active');
	select4.classList.remove('active');
	select6.classList.remove('active');
	select8.classList.add('active');
	select10.classList.remove('active');
	
	stuInfo.textContent = '';
	stuInfo2.textContent = '';
	stuInfo3.textContent = '';
	
	let str = '';
	str += '<a href="#" class="list-group-item active">강의 시간표</a>';
	
	let str2 ='';
	str2 += '<a href="#" class="list-group-item">스케쥴</a>';
	
	let str3 ='';
	
	update.insertAdjacentHTML('afterbegin', str);
	update2.insertAdjacentHTML('afterbegin', str2);
	update3.insertAdjacentHTML('afterbegin', str3);
}


