# SSAFY를 위한 화상 미팅 프로그램 WEFFY

## ✈ 개발 정보

> 개발 기간 : 2023.07.04 ~ 2023.08.13</br>  
> 개발 인원 : 5명

## 📑 목차

1.  [프로젝트 기획 배경](#프로젝트-기획-배경)
2.  [주요 기능 설명](#주요-기능-설명)
3. [기술 스택](#기술-스택)
4. [아키텍처](#아키텍처)
5. [ERD](#erd)
6. [기능 엿보기](#기능-엿보기)
7. [팀원 소개 및 역할](#팀원-소개-및-역할)
8. [회고](#회고)

## 📌프로젝트 기획 배경

> SSAFY교육에 한 차원 높은 가치를 더하는 첫 걸음 WEFFY

SSAFY 교육 과정 중에 다양한 외부 프로그램의 의존성이 높아진 것을 인지하게 되었습니다. 이에 국내 최고의 IT 교육기관의 명성에 걸맞게, 이런 의존성을 줄이기 위해 WEFFY를 개발하였습니다. 교수님과 교육생들의 직접적인 피드백을 설문조사로 받아, 그를 기반으로 SSAFY의 교육 품질을 향상시키려는 노력하였습니다.

주요 개발 목적은 아래와 같습니다.

1. **외부 의존도 축소**: 자체 비디오 회의 도구의 개발로 인해 주로 사용되던 WEBEX와 같은 외부 프로그램에 대한 의존도를 줄였습니다.
2. **피드백 기반 개발**: 교육생과 교수님들의 소중한 의견을 수렴하여 실질적인 문제점을 파악하고 해결 방안을 도입하였습니다.
3. **SSAFY 교육 환경 향상**: 외부 도구 사용으로 발생하던 비용을 절감하여, SSAFY 학생들에게 더욱 향상된 교육 환경을 제공하기 위해 노력하였습니다.

## 🔎주요 기능 설명

### 1️⃣ MatterMost 연동

- 사용자는 MatterMost 아이디와 비밀번호만으로 손쉽게 WEFFY에 가입 및 로그인이 가능합니다.
- MatterMost의 프로필 이미지와 닉네임을 그대로 가져와서, 별도의 프로필 설정 과정 없이 서비스를 시작할 수 있습니다.
- MatterMost 채널과의 연동을 통해, 미팅룸을 쉽게 개설할 수 있으며, 채널 헤더에 있는 WEFFY 링크를 클릭하면 바로 그룹 미팅에 참여할 수 있습니다.
- WEFFY채팅방에 올렸던 파일들은 Mattermost 채팅방과 연동되어 자동 업로드

### 2️⃣ 다중화면 공유 시스템

- 기존 WEBEX와 다르게 다중 화면 공유 시스템을 도입하여, 교육자와 교육생 간의 커뮤니케이션을 더욱 원활하게 만들어 줍니다.

### 3️⃣ 교육 효과 최대화를 위한 기능

- **일반 채팅과 질문 채팅의 분리**: 질문이 일반 채팅에 묻히지 않도록 채팅을 분리합니다.
- **채팅을 통한 파일 전송 기능** : 모든 확장자의 파일을 화상미팅 환경에서 전송할 수 있어, 더욱 원활한 수업 진행이 가능합니다.
- **파일 목록 모아보기** : 미팅 도중 업로드된 파일들을 한눈에 확인하고, 필요한 파일을 손쉽게 다운로드할 수 있습니다.

### 4️⃣ 스트리밍 기능을 통해 원활한 복습 환경 제공

- 수업 내용을 녹화함으로써, 각기 다른 학습 속도를 가진 수강생들도 빠짐없이 수업을 이해하고 복습할 수 있는 환경을 제공합니다.

## 🛠기술 스택

<table>
<tr>
 <td align="center">언어</td>
 <td>
  <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=ffffff"/>
  <img src="https://img.shields.io/badge/Java-orange?style=for-the-badge&logo=Java&logoColor=white"/>
	<img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"/>
	
 </td>
</tr>
<tr>
 <td align="center">프레임워크</td>
 <td>
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=ffffff"/>
	<img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=ffffff"/>  
</tr>
<tr>
 <td align="center">라이브러리</td>
 <td>
  
<img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=SpringBoot&logoColor=ffffff"/>
<img src="https://img.shields.io/badge/springsecurity-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=ffffff"/>
<img src="https://img.shields.io/badge/jwt-6DB33F?style=for-the-badge&logo=jwt&logoColor=ffffff"/>
<img src="https://img.shields.io/badge/MUI-007FFF?style=for-the-badge&logo=MUI&logoColor=ffffff"/>
<img src="https://img.shields.io/badge/Redux-764ABC?style=for-the-badge&logo=redux&logoColor=ffffff"/>  
<img src="https://img.shields.io/badge/Jest-C21325?style=for-the-badge&logo=Jest&logoColor=ffffff"/>  
<img src="https://img.shields.io/badge/Axios-5A29E4?style=for-the-badge&logo=Axios&logoColor=ffffff"/>  
<img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=#7952B3&logoColor=ffffff"/>  
<img src="https://img.shields.io/badge/jquery-0769AD?style=for-the-badge&logo=jquery&logoColor=ffffff"/>

</tr>
<tr>
 <td align="center">패키지 매니저</td>
 <td>
    <img src="https://img.shields.io/badge/npm-CB3837?style=for-the-badge&logo=npm&logoColor=white">
    <img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">

  </td>
</tr>
<tr>
 <td align="center">인프라</td>
 <td>
  <img src="https://img.shields.io/badge/MYSQL-4479A1?style=for-the-badge&logo=MYSQL&logoColor=ffffff"/>
  <img src="https://img.shields.io/badge/amazonaws-232F3E?style=for-the-badge&logo=amazonaws&logoColor=ffffff"/>
  <img src="https://img.shields.io/badge/amazons3-569A31?style=for-the-badge&logo=amazons3&logoColor=ffffff"/>
  <img src="https://img.shields.io/badge/amazonec2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=ffffff"/>
  <img src="https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=ffffff"/>
  <img src="https://img.shields.io/badge/jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=ffffff"/>
  
</tr>
<tr>
 <td align="center">포맷팅</td>
 <td>
  <img src="https://img.shields.io/badge/ESLint-4B32C3?style=for-the-badge&logo=ESLint&logoColor=ffffff"/> 
  <img src="https://img.shields.io/badge/Prettier-F7B93E?style=for-the-badge&logo=Prettier&logoColor=ffffff"/> 
  <img src="https://img.shields.io/badge/PostCSS-DD3A0A?style=for-the-badge&logo=PostCSS&logoColor=ffffff"/> 
  </td>
</tr>

<tr>
 <td align="center">협업툴</td>
 <td>
    <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white"/>
    <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=GitHub&logoColor=white"/> 
    <img src="https://img.shields.io/badge/Gitlab-FC6D26?style=for-the-badge&logo=Gitlab&logoColor=white"/> 
    <img src="https://img.shields.io/badge/Mattermost-0058CC?style=for-the-badge&logo=Mattermost&logoColor=white"/> 
    <img src="https://img.shields.io/badge/jira-0052CC?style=for-the-badge&logo=jira&logoColor=white"/>
 </td>
</tr>
<tr>
 <td align="center">기타</td>
 <td>
    <img src="https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=Figma&logoColor=white"/>
    <img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=Notion&logoColor=white"/> 
    <img src="https://img.shields.io/badge/swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=white"/>
 </td>
</tr>
</table>

## 🧱아키텍처

![아키텍처.png](images/아키텍처.png)

## 🗂ERD

![erd.png](images/erd.png)

## 👀기능 엿보기

### 🔒회원 가입 및 로그인

![회원가입_로그인.gif](images/회원가입_로그인.gif)

### 👨‍👩‍👦미팅룸 생성 후 mattermost 헤더 자동 등록

![미팅생성_채널헤더.gif](images/미팅생성_채널헤더.gif)

### 💻 화상 미팅 환경(다중 공유 화면)

![다중화면공유_넥네임변경_검색.gif](images/다중화면공유_넥네임변경_검색.gif)

<!-- ### 📃 최근 목록 조회 -->

### 🎞 스트리밍 기능

![스트리밍_SW_UCC.gif](images/스트리밍_SW_UCC.gif)

<!-- ### 🔗 파일 업로드 및 다운로드, 파일 목록 조회 -->

## 🧚‍♀️팀원 소개 및 역할

| 이름   | 기능 및 역할                                                                                                                                                                              |
| ------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 서은진 | 팀장, 프론트 엔드 (main화면, 프로필 설정, 질문/일반채팅, 파일 업로드/다운로드, 파일 목록 조회, 최근 미팅 참여 목록 조회, 내 미팅 리스트 조회, Openvidu를 활용해 연결된 기기 조회 및 설정) |
| 이연지 | 팀원, 프론트 엔드(로그인, 회원가입, 회의- 참가자 목록, 참가자 검색, 회의 참가자명변경, 회의화면 3가지 모드의 레이아웃 제작, Openvidu React 담당)                                          |
| 이서현 | 부팀장, 백엔드 (로그인, 회원가입, 파일 업로드, 다운로드, 미팅 내 질문 채팅, 퀴즈 생성, Mattermost 연동, 서버 배포 - Docker, K8s, MSA 아키텍처 구현)                                                                                                                                                                                    |
| 방진성 | 팀원, 백엔드 (Mattermost로 파일 전송, history 관리, Openvidu 회의 생성/참가/나가기, Dockerfile), 프론트엔드 (파일 목록 조회, Openvidu 회의 생성/참가/나가기, 회의 비활성화, 생성한 회의 목록 조회)                                                                                                                                                                                   |
| 정예진 | 팀원, 백엔드(회의 생성, 회의 참가, 회의 리스트, 회의 종료, 회의 조회, 회의 비활성화(삭제), 최근 회의 리스트 조회, 녹화 시작, 녹화 중지, 스트리밍 구현)                                                                                                                                                                                    |

## 💬 회고
WebRTC파트를 맡으면서 openvidu 라이브러리를 사용하였다. </br>
WebRTC는 실시간 음성, 비디오, 데이터 통신을 가능하게 하는 오픈 소스 프로젝트이다.
</br>Openvidu를 선택하게 된 이유는 다음과 같다.
</br>Openvidu는 WebRTC의 복잡성을 추상화하여 더 쉬운 API로 제공한다.
</br>Kurento Media Server기반으로, TLS와 SRTP(Secure WebRTC)를 사용하여 보안 연결을 제공한다.
</br>Openvidu를 통해 화면 공유, 녹화, 다중 카메라 지원 등과 같은 고급 기능을 제공한다.
</br>웹 및 모바일 플랫폼에서의 통합이 용이하다.
</br>이러한 이유로 Openvidu를 선택하였다.
</br>이번 프로젝트로 처음 서버 배포를 맡게 되었는데, ssl적용 관련해서 어려움을 갖게 되었다.
</br>let's encrypt를 통한 ssl 적용, 기본 포트는 443포트, 이중 Nginx 방식으로, 프론트와 연동되는 Nginx는 docker 컨테이너상에 두고,
</br>호스트 pc에 Nginx를 하나 더 두게 해서 ssl적용을 시키게 하는 방법을 배웠다. 
</br>이중 Nginx를 이용하면, 호스트 PC의 Nginx가 HTTPS를 관리하므로, 컨테이너를 자유롭게 재시작하거나 변경하는 것에 더 자유롭다.
</br>이 프로젝트를 통해 Docker, Docker-compose, Jenkins에 대해서 익숙해 질 수 있었다.
</br>MSA구조의 프로젝트를 처음 진행해보면서, 서비스의 end-point를 API형태로 외부에 노출하고 실질적인 세부 사항은 모두 추상화 시킴으로써, 보안성에 대해서 모든 서버에 적용할 수 있는 방법을 배웠다.
