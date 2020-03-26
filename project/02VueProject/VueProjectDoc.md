# Creator들을 위한 놀이터: Cre8or

![version](https://img.shields.io/badge/version-1.0.0-orange?)
![vue](https://img.shields.io/badge/vue-4.1.2-blue?logo=Vue.js)
![vuetify](https://img.shields.io/badge/vuetify-6.13.4-blue?logo=vuetify)
![java](https://img.shields.io/badge/java-1.8.0-orange?logo=java)
![spring](https://img.shields.io/badge/spring-3.9.7-yellow?logo=spring)
![spring-boot](https://img.shields.io/badge/springboot-3.9.7-yellow?logo=spring)
![html](https://img.shields.io/badge/html-html5-red?logo=html5)
![css](https://img.shields.io/badge/css-css3-red?logo=css3)
![javascript](https://img.shields.io/badge/javascript-es6-yellowgreen?logo=javascript)
![firebase](https://img.shields.io/badge/firebase-firebase-red?logo=firebase)
![mysql](https://img.shields.io/badge/mysql-5.7.29-yellowgreen?logo=mysql)
![aws](https://img.shields.io/badge/aws%20-rds-ff69b4?logo=Amazon)

---
## 00. 프로젝트를 둘러보기 전에...

[시연 영상](https://youtu.be/hYZudIsAwec)

- Chrome으로만 사용 가능합니다.
- TEST 계정: 회원가입을 이메일 인증 방식으로 바꿔서 기존 `test@test.com` 계정 사용이 불가능합니다. 간단하게 구글 계정 소셜 로그인을 통해 저희 Cre8or의 동료가 되어주세요.
- http, https 이슈
  - 저희 프로젝트는 Firebase에 Vue로 만든 프론트가, AWS에 스프링으로 만든 백엔드 서버가 올라가 있습니다. 저희는 프로젝트의 완성도를 높이기 위해, 이런 방식을 취했고, 다음 이슈가 발생하였습니다. 이슈 해결을 해야 저희 프로젝트의 산출물을 볼 수 있기 때문에 이슈 해결 과정을 설명해드리겠습니다.
  - 처음 저희 서비스에 접속하는 유저는 메인페이지 이후, 서버로부터 불러와야 하는 컨텐츠들이 보이지 않습니다. 프론트가 올라간 Firebase는 https만 지원하기 때문에 백엔드 서버가 올라간 aws와 소통하기 위해서는 http와 https 사이에 필요한 SSL 암호키가 필요합니다.
  - 저희는 저희 스스로 발급한 SSL을 사용했기 때문에, 브라우저에서는 해당 SSL을 신뢰할 수 없다는 경고와 함께 컨텐츠 로딩을 막았습니다. 서버로부터 불러온 컨텐츠들을 보기 위해서는 다음 과정을 따라해주시면 되겠습니다.
    - [홈페이지](https://cre8or-2a293.firebaseapp/home)에서 `F12`를 눌러 `console`창을 엽니다.
    - Failed to load resource로 시작하는 에러의 오른쪽부분에 있는 링크를 `Ctrl + 마우스클릭`을 하여 들어갑니다. 보이는 `고급` 버튼을 눌러서 하단의 `안전하지 않음`을 클릭합니다. 
    - 클릭하면 data object들이 보이고, 다시 브라우저를 열어 저희 서비스 URL로 접속하시면 정상적인 서비스 이용이 가능합니다.
- 이 모든 과정을 마친 후, 회원가입과 회원인증, 로그인을 진행하시면 됩니다.
- 간혹 회원인증 메일이 발송되지 않는 경우가 있습니다. 그럴 땐 저희 Cre8or 팀으로 문의 주시면 됩니다. 문의는 로그인 팝업창 하단의 링크를 통해 하실 수 있습니다.

## 01. About Us

- 이다경 : 한줄소개<br/>
- 김혜희 : 한줄소개<br/>
- 오석빈 : [한줄소개](https://github.com/hasihime/resume)<br/>
- 이은규 : 한줄소개<br/>
- 임우섭 : [한줄소개](https://github.com/WooseopIM)<br/>

## 02. 프로젝트 메인페이지 Preview

- URL: https://cre8or-2a293.firebaseapp.com/
  - 아무 곳이나 클릭/터치 하면 Cre8or 서비스 홈페이지로 이동
  - Cre8or 프로젝트의 대문
<img src="../../img/Project/02VueProject/welcome.png ">
- URL: https://cre8or-2a293.firebaseapp.com/home
  - Cre8or 서비스의 핵심인 키워드를 확인할 수 있는 곳
<img src="../../img/Project/02VueProject/title.png ">

## 03. 기술 스택

<img src="../../img/Project/02VueProject/tech_stack.png ">


## 04. 페이지별 상세 정보 <br/>

 <details><summary>펼치기</summary>
 <br>

 ### 4-0. 메인페이지 (path: '/')
 - 가장 첫 화면. 일명 Welcome 페이지
 - 아무 곳이나 클릭/터치하면 `/home` 경로로 이동<br/>
 - 메인페이지에만 상단의 Navbar와 하단의 footer가 없다.

### 4-1. 홈페이지 (path: '/home') <br/>

 - Carousel을 이용하여 일간/주간/월간 키워드를 보여줌<br/>
     - 남은시간 
     - 키워드 
     - 일간/주간/월간 정보 <br/>
 - 상단 Navbar / 하단 Footer<br/>
    1.	Navbar 구성 
       - Cre8or로고(메인페이지 이동)
       - 홈: 홈페이지 이동
       - 대쉬보드: 작품리스트를 볼 수 있는 `/dashboard`로 이동
       - 마이페이지: 로그인한 유저만 볼 수 있음
         - 내 프로필 카드
         - 내가 올린 Post(포트폴리오)
         - 내가 즐겨찾는 작가
         - 내가 좋아한 작품들을 표시해줌
       - 관리자: Admin 권한이 있는 계정에게만 표시. 
       - 키워드 검색: 키워드 검색 시 `/dashboard`에서 검색 결과를 볼 수 있음.
       - 모바일로 볼 경우, 터치 스크롤로 Navbar 좌우 이동 가능<br/>
    2.	Footer 구성
       -  About Us: Cre8or 프로젝트 팀원 소개 및 역할 설명
       - 이용약관: 개인정보 동의
       - 주소: Cre8or 서비스가 탄생한 곳<br/>
 - 우하단 Speed dial 기능
   - 비로그인시 로그인/회원가입 버튼 활성화
   - 로그인시 글쓰기, 로그아웃 버튼 활성화

### 4-2. 로그인 <br/>
- ID(이메일 형식), 패스워드를 통한 로그인 가능<br/>
    - 회원가입 시 해당 메일 주소로 인증 메일을 발송, 인증 받은 후 서비스 이용 가능 <br/>
 - 소셜 로그인기능 추가(Google, Facebook)<br/>
    - 소셜 로그인 시 회원이 아니면 자동 회원가입<br/>
 - 로그인 페이지에서도 회원가입 modal로 이동 가능<br/>
 - 패스워드 분실시, 이메일을 입력하면 패스워드 재설정 이메일을 발송.

### 4-3. About Us (path: '/aboutus') <br/>
 - Cre8or 프로젝트 팀원 별 자기소개.<br/>
    - 썸네일로 표시되다 햄버거 버튼 클릭시 상세보기 나옴

### 4-4. 대쉬보드 (path: '/dashboard') <br/>
- 오늘 날짜의 일간 키워드로 작성된 post를 보여줌.<br/>
    1. tab기능으로 일간,주간,월간 자유롭게 이동 가능<br/>
    2. 썸네일 이미지는 포스트가 그림인 경우 해당 그림의 미리보기화면이 나오며 그 외에는 기본 이미지 파일이 나온다.<br/>
    3. 대쉬보드는 반응형 웹 기능을 탑재하여 화면 사이즈에 맞게 포스트의 배치가 변경됨.<br/>
- 달력을 열었을 경우, 해당 일/주/월에 맞는 키워드를 표시. 키워드 클릭 시 해당 키워드에 대한 post가 표시됨.<br/>
    1. 달력은 해당일 이전의 키워드만 표시되며 이후의 키워드는 표시되지 않게 설정함.<br/>
- 포스트 작성은 Speed dial을 통해 어디서든지 작성이 가능하며 포스트 작성 버튼 클릭시 해당 기간에 속하는 일/주/월 키워드와 글/그림/음악/영상에 해당하는 카테고리를 선택할 수 있음. 그리고 제목과 내용 작성이 가능하며 파일을 첨부하면 파이어베이스 DB에 업로드를 한다.<br/>
- 각 포스트 카드를 클릭하면, Modal로 포스트를 상세 보기 가능. 상세페이지는 키워드에 맞는 내용을 보여주며 컨텐츠는 글, 그림, 음악, 영상으로 나타남. <br/>
    1. Modal 상단에 있는 Modal용 Navbar에는 해당 포스트를 작성한 유저의 닉네임과 닉네임 오른쪽에 클릭하면 노란색으로 바뀌는 별 표시가 있다. 별은 해당 유저를 즐겨찾기에 추가할 수 있는 버튼이고 Navbar의 오른쪽 끝에는 모달창을 닫을 수 있는 X버튼이 있다.
    2. 좋아요 버튼은 작품과 컨텐츠를 본 후 아래에서 확인할 수 있으며 좋아요/즐겨찾기 버튼을 클릭시 마이페이지에서 즐겨찾기한 작가와 좋아요한 포스트로 모아서 볼 수 있음<br/>
    3. 포스트를 작성한 사람이면 해당 포스트를 Modal창에서 자유롭게 수정/삭제 가능<br/>
4. 댓글 기능을 통해 로그인을 한 유저라면 댓글을 추가 및 삭제, 수정이 가능함

### 4-5. 마이페이지  (path: '/mypage')<br/>
- 마이페이지는 로그인을 한 유저만 접근이 가능하며, 악성 유저가 주소창에서 /mypage로 접근하려고 시도할 때, 로그인이 필요한 기능이라는 알림을 띄워준다.
- 왼쪽의 자신의 프로필 영역과 오른쪽의 포스트 관련 부분으로 나뉘어 있다. <br/>
    1.	웹화면에서는 프로필과 포스트 영역이 좌우로 배치되어 있지만 모바일 화면에서는 프로필 영역 아래에 포스트 영역이 배치된다. <br/>
 - 프로필 영역은 자신의 프로필사진, email, 한줄소개, 프로필 사진을 볼 수 있으며 비밀번호 변경과 회원정보 수정 및 탈퇴가 가능하다. <br/>
    1. 프로필 사진은 회원 가입시 기본 이미지로 설정되고, 마이페이지의 회원정보 수정을 통해 언제든지 변경이 가능함. <br/>
 - 포스트 영역은 나의 작품, 좋아하는 작가, 좋아하는 작품 3개의 탭으로 구성된다. <br/>
    1. 나의 작품: 지금까지 내가 작성한 모든 포스트를 볼 수 있다. <br/>
    2. 좋아하는 작가: 내가 즐겨찾기한 작가 목록을 볼 수 있으며, 작가를 클릭시 해당 작가의 페이지로 이동이 가능하다. 해당 작가 페이지에서는 해당 작가가 쓴 작품, 해당 작가가 좋아하는 다른 작가, 해당 작가가 좋아하는 작품들이 표시되도록 바뀐다. 
    3. 좋아하는 작품: 내가 좋아요를 누른 작품들을 표시한다.

### 4-6. 관리자  (path: '/admin'<br/>
- 관리자 페이지는 관리자로 권한을 부여받은 사람만 접근이 가능하며 게시글 관리와 회원관리를 할 수 있다.
- 마이페이지와 마찬가지로 악성 유저에 의한 url 접속을 막기 위해 Router Guard를 설정했으나, 프로젝트 시연 영상 녹화 및 프로젝트 검사에 용이하도록 '/admin'을 통한 접속도 가능하게끔 임시로 열어두었다.
     - 게시글 관리:
         - 작품페이지('/dashboard')에서와 마찬가지로 달력이 표기되는데 작품페이지와 다른 기능을 수행한다.
         - 모든 키워드(일간, 주간, 월간)가 있는 특정 날짜를 클릭하면 이에 대한 통계 차트를 볼 수 있다. 이 차트는 카테고리(글, 그림, 영상 등) 별로 포스트의 분포를 알 수 있다.
         - 일간, 주간, 월간에 해당하는 각각의 키워드 클릭 시 키워드 별 포스트 개수를 알 수 있으며 키워드를 수정하거나 삭제를 할 수 있도록 했다.
         - 만약 키워드가 없는 날짜를 클릭했다면, 즉시 키워드와 해당 키워드의 이미지를 업로드 할 수 있다.
     - 회원관리:
         - Cre8or 서비스를 이용하는 회원정보 확인과 회원 별 권한 설정이 가능하다. 
         - 회원은 Search 부분을 클릭시 이메일, 닉네임 등으로 검색을 통한 결과를 보여줄 수 있도록 구성했다.
         - 각 컬럼 별 오름차순, 내림차순 정렬이 가능하다.
         - 회원은 한 번에 5개, 10개, 15개, 전부(ALL) 표기하는 식으로 변경이 가능하다.
            은 한번에 5개,10개,15개,전부 표기하는 식으로 변경이 가능하다. <br/>

 </details>

## 05. Git flow

#### git flow
 <details><summary>펼치기</summary>
<img src="../../img/Project/02VueProject/git_branch/22.PNG">
<img src="../../img/Project/02VueProject/git_branch/21.PNG">
<img src="../../img/Project/02VueProject/git_branch/20.PNG">
<img src="../../img/Project/02VueProject/git_branch/19.PNG">
<img src="../../img/Project/02VueProject/git_branch/18.PNG">
<img src="../../img/Project/02VueProject/git_branch/17.PNG">
<img src="../../img/Project/02VueProject/git_branch/16.PNG">
<img src="../../img/Project/02VueProject/git_branch/15.PNG">
<img src="../../img/Project/02VueProject/git_branch/14.PNG">
<img src="../../img/Project/02VueProject/git_branch/13.PNG">
<img src="../../img/Project/02VueProject/git_branch/12.PNG">
<img src="../../img/Project/02VueProject/git_branch/11.PNG">
<img src="../../img/Project/02VueProject/git_branch/10.PNG">
<img src="../../img/Project/02VueProject/git_branch/09.PNG">
<img src="../../img/Project/02VueProject/git_branch/08.PNG">
<img src="../../img/Project/02VueProject/git_branch/07.PNG">
<img src="../../img/Project/02VueProject/git_branch/06.PNG">
<img src="../../img/Project/02VueProject/git_branch/05.PNG">
<img src="../../img/Project/02VueProject/git_branch/04.PNG">
<img src="../../img/Project/02VueProject/git_branch/03.PNG">
<img src="../../img/Project/02VueProject/git_branch/02.PNG">
<img src="../../img/Project/02VueProject/git_branch/01.PNG">
</details>


