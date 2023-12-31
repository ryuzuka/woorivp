<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/import/taglib.jspf" %>
		<section id="container" class="container">
			<nav class="nav">
				<ol class="navArea"><li>HOME</li><li>WHO WE ARE</li></ol>
			</nav>
			<div class="content">
				<div class="visualArea">
					<div class="inner">
						<h1 class="pageTit">Who We Are</h1>
						<p class="pageTxt">성공적인 투자를 위해 KTB네트워크의 구성원들이 함께 합니다.</p>
					</div>
				</div>
				<div class="tabArea">
					<ul class="pageTab">
						<li class="sub on"><a href="/home/whoweare/korea.do" aria-selected="true">KOREA</a>
							<div class="subTab">
								<ul class="inner">
									<li class="on"><a href="#" aria-selected="true">Investment</a></li>
									<li><a href="#">Management</a></li>
								</ul>
							</div>
						</li>
						<li class="sub"><a href="/home/whoweare/china.do">CHINA</a>
							<div class="subTab">
								<ul class="inner">
									<li class="on"><a href="#" aria-selected="true">Investment</a></li>
									<li><a href="#">Management</a></li>
								</ul>
							</div>
						</li>
					</ul>
				</div>
				<!-- Investment -->
				<div class="inner tabCont on"><!-- 탭 활성화시 class="on" -->
					<h2 class="hidden">KOREA Investment</h2><!-- 탭 타이틀 -->		
					<div class="memberList">
						<ul>
							<li class="active">
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team01.jpg" alt="신진호"></div>
									<div class="right">
										<h3>신진호 <span class="pointColor">KOREA / 대표이사</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>서울대학교 화학공학과<br> 서울대학교 화학공학 대학원<br> 현대전자<br> KTB네트워크</dd>
											<dt>업무</dt>
											<dd>경영총괄</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team01_on.jpg" alt="신진호"></span>
									<!-- 
										활성화시 이미지, hover시 이미지  
										src="/static/home/kr/images/contents/thumb_team01_off.jpg" 
									-->
									<strong>신진호</strong> 대표이사
								</a>							
							</li>
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team02.jpg" alt="김창규"></div>
									<div class="right">
										<h3>김창규 <span class="pointColor">KOREA / 투자팀 / 부사장</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>연세대학교 경제학과<br>연세대학교 경제학 대학원<br>동남리스<br>KTB네트워크</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team02_off.jpg" alt="김창규"></span>
									<strong>김창규</strong> 부사장
								</a>							
							</li>
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team03.jpg" alt="이승호"></div>
									<div class="right">
										<h3>이승호 <span class="pointColor">KOREA / 투자팀 / 상무</span></h3><!-- 0411 수정 -->
										<dl>
											<dt>주요경력</dt>
											<dd>연세대학교 사학과<br>S.N.21<br>데이콤<br>KTB네트워크</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team03_off.jpg" alt="이승호"></span>
									<strong>이승호</strong> 상무<!-- 0411 수정 -->
								</a>							
							</li>
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team04.jpg" alt="임동현"></div>
									<div class="right">
										<h3>임동현 <span class="pointColor">KOREA / 투자팀 / 상무</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>고려대학교 경영학과<br>고려대학교 경영학 석사<br>수원대학교 경영학 박사<br>나라종금<br>삼정KPMG</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team04_off.jpg" alt="임동현"></span>
									<strong>임동현</strong> 상무
								</a>							
							</li>
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team05.jpg" alt="박선배"></div>
									<div class="right">
										<h3>박선배 <span class="pointColor">KOREA / 투자팀 / 상무</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>서울대학교 화학공학과<br>서울대학교 화학공학 대학원<br>쌍용정유<br>KTB네트워크</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team05_off.jpg" alt="박선배"></span>
									<strong>박선배</strong> 상무
								</a>							
							</li>							
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team06.jpg" alt="신태광"></div>
									<div class="right">
										<h3>신태광 <span class="pointColor">KOREA / 투자팀 / 상무</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>성균관대학교 기계설계학과<br>KTB네트워크</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team06_off.jpg" alt="신태광"></span>
									<strong>신태광</strong> 상무
								</a>							
							</li>
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team07.jpg" alt="김재한"></div>
									<div class="right">
										<h3>김재한 <span class="pointColor">KOREA / 투자팀 / 상무</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>서강대학교 사회학과<br>KTB네트워크</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team07_off.jpg" alt="김재한"></span>
									<strong>김재한</strong> 상무
								</a>							
							</li>
							<!-- 0411 수정 -->
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team09.jpg" alt="강문수"></div>
									<div class="right">
										<h3>강문수 <span class="pointColor">KOREA / 투자팀 / 이사</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>서울대학교 독어독문학과<br>딜로이트안진회계법인 FAS</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team09_off.jpg" alt="강문수"></span>
									<strong>강문수</strong> 이사
								</a>							
							</li>
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team08.jpg" alt="김은숙"></div>
									<div class="right">
										<h3>김은숙 <span class="pointColor">KOREA / 투자팀 / 팀장</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>삼성물산영상사업단<br>강제규필름</dd>
											<dt>업무</dt>
											<dd>콘텐츠 투자심사 및 인사총무</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team08_off.jpg" alt="김은숙"></span>
									<strong>김은숙</strong> 팀장
								</a>							
							</li>
							<!-- //0411 수정 -->
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team10.jpg" alt="경국현"></div>
									<div class="right">
										<h3>경국현 <span class="pointColor">KOREA / 투자팀 / 팀장</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>서울대학교 조선해양공학과<br>SKC&amp;C<br>NHN</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team10_off.jpg" alt="경국현"></span>
									<strong>경국현</strong> 팀장
								</a>							
							</li>
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team11.jpg" alt="장성엽"></div>
									<div class="right">
										<h3>장성엽 <span class="pointColor">KOREA / 투자팀 / 팀장</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>서울대학교 법학과<br>포워드벤처스(쿠팡)<br>NHN</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team11_off.jpg" alt="장성엽"></span>
									<strong>장성엽</strong> 팀장
								</a>							
							</li>
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team12.jpg" alt="천지웅"></div>
									<div class="right">
										<h3>천지웅 <span class="pointColor">KOREA / 투자팀 / 팀장</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>서울대학교 약학대 석사<br>종근당 중앙연구소<br>Daiichi Sankyo 임상개발</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team12_off.jpg" alt="천지웅"></span>
									<strong>천지웅</strong> 팀장
								</a>							
							</li>
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team13.jpg" alt="전경미"></div>
									<div class="right">
										<h3>전경미 <span class="pointColor">KOREA / 투자팀 / 팀장</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>CJ E&M</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team13_off.jpg" alt="전경미"></span>
									<strong>전경미</strong> 팀장
								</a>							
							</li>
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team14.jpg" alt="김혜성"></div>
									<div class="right">
										<h3>김혜성 <span class="pointColor">KOREA / 투자팀 / 심사역</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>시카고대학교 경제학과<br>Freenters 공동창업&amp;CEO<br>Sparklabs<br>EarlierCare 공동창업&amp;CSO</dd>
											<dt>업무</dt>
											<dd>회사 발굴&amp;심사 및 투자집행</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team14_off.jpg" alt="김혜성"></span>
									<strong>김혜성</strong> 심사역
								</a>							
							</li>
							<li>
								<div class="member">
									<div class="left"><img src="/static/home/kr/images/contents/img_team15.jpg" alt="김만식"></div>
									<div class="right">
										<h3>김만식 <span class="pointColor">KOREA / 투자팀 / 심사역</span></h3>
										<dl>
											<dt>주요경력</dt>
											<dd>서울대학교 약학대학교<br>한국에자이</dd>
											<dt>업무</dt>
											<dd>회사 발굴&amp;심사 및 투자집행</dd>
										</dl>
									</div>
								</div>	
								<a href="#" class="thumb">
									<span class="img"><img src="/static/home/kr/images/contents/thumb_team15_off.jpg" alt="김만식"></span>
									<strong>김만식</strong> 심사역
								</a>							
							</li>
						</ul>	
					</div>
				</div>
				<!-- //Investment -->
				<!-- Management -->
				<div class="inner tabCont">
					<h2 class="hidden">KOREA Management</h2><!-- 탭 타이틀 -->						
					<div class="memberList">
						<div class="memberWrap">							
							<div class="memberInner">							
								<h3 class="title">CEO</h3>	
								<ul>					
									<li class="active">
										<div class="member">
											<div class="left"><img src="/static/home/kr/images/contents/img_team01.jpg" alt="신진호"></div>
											<div class="right">
												<h3>신진호 <span class="pointColor">KOREA / 대표이사</span></h3>
												<dl>
													<dt>주요경력</dt>
													<dd>서울대학교 화학공학과<br> 서울대학교 화학공학 대학원<br> 현대전자<br> KTB네트워크</dd>
													<dt>업무</dt>
													<dd>경영총괄</dd>
												</dl>
											</div>
										</div>	
										<a href="#" class="thumb">
											<span class="img"><img src="/static/home/kr/images/contents/thumb_team01_on.jpg" alt="신진호"></span>
											<!-- 
												활성화시 이미지, hover시 이미지  
												src="/static/home/kr/images/contents/thumb_team01_off.jpg" 
											-->
											<strong>신진호</strong> 대표이사
										</a>							
									</li>
								</ul>
							</div>
							<div class="memberInner">
								<h3 class="title">Auditor</h3>	
								<ul>											
									<li>
										<div class="member">
											<div class="left"><img src="/static/home/kr/images/contents/img_team16.jpg" alt="장홍성"></div>
											<div class="right">
												<h3>장홍성 <span class="pointColor">KOREA / 상근감사 / 감사</span></h3>
												<dl>
													<dt>주요경력</dt>
													<dd>서울대 경제학과<br>KAIST 대학원 금융공학과<br>하나은행<br>하나대투증권<br>솔브레인저축은행</dd>
													<dt>업무</dt>
													<dd>감사</dd>
												</dl>
											</div>
										</div>	
										<a href="#" class="thumb">
											<span class="img"><img src="/static/home/kr/images/contents/thumb_team16_off.jpg" alt="장홍성"></span>
											<strong>장홍성</strong> 감사
										</a>							
									</li>
								</ul>							
							</div>						
						</div>	
						<div class="memberInner">
							<h3 class="title">Compliance</h3>	
							<ul>		
								<li>
									<div class="member">
										<div class="left"><img src="/static/home/kr/images/contents/img_team17.jpg" alt="금경환"></div>
										<div class="right">
											<h3>금경환 <span class="pointColor">KOREA / 관리팀 / 팀장</span></h3>
											<dl>
												<dt>주요경력</dt>
												<dd>서울대학교 사법학과<br>NHN엔터테인먼트㈜</dd>
												<dt>업무</dt>
												<dd>준법감시인</dd>
											</dl>
										</div>
									</div>	
									<a href="#" class="thumb">
										<span class="img"><img src="/static/home/kr/images/contents/thumb_team17_off.jpg" alt="금경환"></span>
										<strong>금경환</strong> 팀장
									</a>							
								</li>
								<li>
									<div class="member">
										<div class="left"><img src="/static/home/kr/images/contents/img_team18.jpg" alt="차승준"></div>
										<div class="right">
											<h3>차승준 <span class="pointColor">KOREA / 관리팀 / 대리 / 변호사</span></h3>
											<dl>
												<dt>주요경력</dt>
												<dd>KAIST 기계공학과<br>중앙대학교 법학전문대학원 석사</dd>
												<dt>업무</dt>
												<dd>Compliance 및 법률검토</dd>
											</dl>
										</div>
									</div>	
									<a href="#" class="thumb">
										<span class="img"><img src="/static/home/kr/images/contents/thumb_team18_off.jpg" alt="차승준"></span>
										<strong>차승준</strong> 대리 / 변호사
									</a>							
								</li>
							</ul>
						</div>
						<div class="memberInner">											
							<h3 class="title">Management</h3>	
							<ul>		
								<li>
									<div class="member">
										<div class="left"><img src="/static/home/kr/images/contents/img_team19.jpg" alt="정도"></div>
										<div class="right">
											<h3>정도 <span class="pointColor">KOREA / 관리팀 / 전무</span></h3>
											<dl>
												<dt>주요경력</dt>
												<dd>서울대학교 국제경제학과<br>㈜대우<br>KTB네트워크</dd>
												<dt>업무</dt>
												<dd>경영지원총괄</dd>
											</dl>
										</div>
									</div>	
									<a href="#" class="thumb">
										<span class="img"><img src="/static/home/kr/images/contents/thumb_team19_off.jpg" alt="정도"></span>
										<strong>정도</strong> 전무
									</a>							
								</li>
								<li>
									<div class="member">
										<div class="left"><img src="/static/home/kr/images/contents/img_team20.jpg" alt="이성기"></div>
										<div class="right">
											<h3>이성기 <span class="pointColor">KOREA / 관리팀 / 이사</span></h3>
											<dl>
												<dt>주요경력</dt>
												<dd>성균관대 회계학 학사<br>연세대 법무대학원<br>우리 프라이빗에퀴티<br>하나금융투자<br>KTB 프라이빗에쿼티</dd>
												<dt>업무</dt>
												<dd>펀드결성 및 관리</dd>
											</dl>
										</div>
									</div>	
									<a href="#" class="thumb">
										<span class="img"><img src="/static/home/kr/images/contents/thumb_team20_off.jpg" alt="이성기"></span>
										<strong>이성기</strong> 이사
									</a>							
								</li>
								<li>
									<div class="member">
										<div class="left"><img src="/static/home/kr/images/contents/img_team08.jpg" alt="김은숙"></div>
										<div class="right">
											<h3>김은숙 <span class="pointColor">KOREA / 관리팀 / 팀장</span></h3>
											<dl>
												<dt>주요경력</dt>
												<dd>삼성물산영상사업단<br>강제규필름</dd>
												<dt>업무</dt>
												<dd>콘텐츠 투자심사 및 인사총무</dd>
											</dl>
										</div>
									</div>	
									<a href="#" class="thumb">
										<span class="img"><img src="/static/home/kr/images/contents/thumb_team08_off.jpg" alt="김은숙"></span>
										<strong>김은숙</strong> 팀장
									</a>							
								</li>
								<li>
									<div class="member">
										<div class="left"><img src="/static/home/kr/images/contents/img_team22.jpg" alt="황문철"></div>
										<div class="right">
											<h3>황문철 <span class="pointColor">KOREA / 관리팀 / 팀장</span></h3>
											<dl>
												<dt>주요경력</dt>
												<dd>삼일회계법인<br>행복마루법률사무소&amp;컨설팅<br>KTB투자증권</dd>
												<dt>업무</dt>
												<dd>경영기획 및 관리</dd>
											</dl>
										</div>
									</div>	
									<a href="#" class="thumb">
										<span class="img"><img src="/static/home/kr/images/contents/thumb_team22_off.jpg" alt="황문철"></span>
										<strong>황문철</strong> 팀장
									</a>							
								</li>
								<li>
									<div class="member">
										<div class="left"><img src="/static/home/kr/images/contents/img_team23.jpg" alt="이지현"></div>
										<div class="right">
											<h3>이지현 <span class="pointColor">KOREA / 관리팀 / 팀장</span></h3>
											<dl>
												<dt>주요경력</dt>
												<dd>KTB네트워크<br>케이큐브벤처스</dd>
												<dt>업무</dt>
												<dd>회계</dd>
											</dl>
										</div>
									</div>	
									<a href="#" class="thumb">
										<span class="img"><img src="/static/home/kr/images/contents/thumb_team23_off.jpg" alt="이지현"></span>
										<strong>이지현</strong> 팀장
									</a>							
								</li>
								<li>
									<div class="member">
										<div class="left"><img src="/static/home/kr/images/contents/img_team24.jpg" alt="홍지원"></div>
										<div class="right">
											<h3>홍지원 <span class="pointColor">KOREA / 관리팀 / 팀장</span></h3>
											<dl>
												<dt>주요경력</dt>
												<dd>한양대학교 경영학과<br>(주)경농<br>(주)인터엠</dd>
												<dt>업무</dt>
												<dd>펀드결성 및 관리</dd>
											</dl>
										</div>
									</div>	
									<a href="#" class="thumb">
										<span class="img"><img src="/static/home/kr/images/contents/thumb_team24_off.jpg" alt="홍지원"></span>
										<strong>홍지원</strong> 팀장
									</a>							
								</li>
								<li>
									<div class="member">
										<div class="left"><img src="/static/home/kr/images/contents/img_team25.jpg" alt="고은비"></div>
										<div class="right">
											<h3>고은비 <span class="pointColor">KOREA / 관리팀 / 팀장</span></h3>
											<dl>
												<dt>주요경력</dt>
												<dd>HQ인베스트먼트</dd>
												<dt>업무</dt>
												<dd>펀드결성 및 관리</dd>
											</dl>
										</div>
									</div>	
									<a href="#" class="thumb">
										<span class="img"><img src="/static/home/kr/images/contents/thumb_team25_off.jpg" alt="고은비"></span>
										<strong>고은비</strong> 팀장
									</a>							
								</li>
								<li>
									<div class="member">
										<div class="left"><img src="/static/home/kr/images/contents/img_team26.jpg" alt="이신희"></div>
										<div class="right">
											<h3>이신희 <span class="pointColor">KOREA / 관리팀 / 주임</span></h3>
											<dl>
												<dt>주요경력</dt>
												<dd>KTB네트워크</dd>
												<dt>업무</dt>
												<dd>회계</dd>
											</dl>
										</div>
									</div>	
									<a href="#" class="thumb">
										<span class="img"><img src="/static/home/kr/images/contents/thumb_team26_off.jpg" alt="이신희"></span>
										<strong>이신희</strong> 주임
									</a>							
								</li>
								<li>
									<div class="member">
										<div class="left"><img src="/static/home/kr/images/contents/img_team27.jpg" alt="정가영"></div>
										<div class="right">
											<h3>정가영 <span class="pointColor">KOREA / 관리팀 / 사원</span></h3>
											<dl>
												<dt>주요경력</dt>
												<dd>이트너스</dd>
												<dt>업무</dt>
												<dd>펀드결성 및 관리</dd>
											</dl>
										</div>
									</div>	
									<a href="#" class="thumb">
										<span class="img"><img src="/static/home/kr/images/contents/thumb_team27_off.jpg" alt="정가영"></span>
										<strong>정가영</strong> 사원
									</a>							
								</li>
							</ul>
						</div>							
						<div class="memberInner">
							<h3 class="title">BI Center</h3>	
							<ul>			
								<li>
									<div class="member">
										<div class="left"><img src="/static/home/kr/images/contents/img_team04.jpg" alt="임동현"></div>
										<div class="right">
											<h3>임동현 <span class="pointColor">KOREA / 투자팀 / 상무</span></h3>
											<dl>
												<dt>주요경력</dt>
												<dd>고려대학교 경영학과<br>고려대학교 경영학 대학원<br>나라종금 <br>삼정KPMG</dd>
											</dl>
										</div>
									</div>	
									<a href="#" class="thumb">
										<span class="img"><img src="/static/home/kr/images/contents/thumb_team04_off.jpg" alt="임동현"></span>
										<strong>임동현</strong> 상무
									</a>							
								</li>
								<li>
									<div class="member">
										<div class="left"><img src="/static/home/kr/images/contents/img_team29.jpg" alt="이지은"></div>
										<div class="right">
											<h3>이지은 <span class="pointColor">KOREA / 관리팀 / 대리</span></h3>
											<dl>
												<dt>주요경력</dt>
												<dd>동서울대 BI센터(보육 매니저)</dd>
												<dt>업무</dt>
												<dd>BI센터 업무</dd>
											</dl>
										</div>
									</div>	
									<a href="#" class="thumb">
										<span class="img"><img src="/static/home/kr/images/contents/thumb_team29_off.jpg" alt="이지은"></span>
										<strong>이지은</strong> 대리
									</a>							
								</li>
							</ul>
						</div>
					</div>
				</div>
				<!-- //Management -->
			</div>
		</section>
