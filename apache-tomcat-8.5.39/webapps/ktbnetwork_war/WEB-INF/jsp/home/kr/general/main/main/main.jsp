<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/import/taglib.jspf" %>
		<section id="container" class="container">
			<h1 class="hidden">네트워크 메인</h1>
			<article class="content">
				<div class="sectionWrap" style=""> 
					<!-- section1 -->
					<div class="section1" style="height:850px"><!-- 각 섹션은 브라우저 높이값 - header 높이 -80px 을 height로 설정 -->
						<h3 class="hidden">회사소개 메뉴 및 대표상품 안내</h3>
						<div class="inner">
							<div class="mainVisual">
								<div class="visualWrap">
									<ul class="swiper-wrapper" style="width:8400px"><!-- width값:li전부 더한 값 -->										
										<li class="swiper-slide">
											<a href="/home/watwedo/overview.do">
												<img src="/static/home/kr/images/main/main_visual1.png" alt="내일을 보는 금융 KTB 자산운용은 고객의 내일을 봅니다. 내일을 보는 투자를 통해 성공을 만들어 냅니다. 회사소개 바로가기">
											</a>
										</li>
										<li class="swiper-slide">
												<img src="/static/home/kr/images/main/main_visual2.png" alt="미래를 보는 KTB 성장가능성 있는 신생벤처기업 투자를 통해 미래의 가치를 만들어갑니다. 상품 바로가기">
										</li>
										<li class="swiper-slide">
												<img src="/static/home/kr/images/main/main_visual3.png" alt="함께 성장하는 KTB 설립 이후 38년간 IPO를 통해 277개의 기업(우회상장 포함)과 함께 하였습니다. 상품 바로가기">
										</li>
										<li class="swiper-slide">
												<img src="/static/home/kr/images/main/main_visual4.png" alt="세계로 향하는 네트워크 수십 년간 축적된 안목과 글로벌 네트워크를 통해 세계로 나아갑니다. 상품 바로가기">
										</li>
									</ul>
									<div class="paging">
										<div class="rolling_btn">
											<a href="#" class="btnPrev"><span>prev</span></a>
											<a href="#" class="btnStop"><span>stop</span></a><!-- 정지 버튼 눌러서 멈출 경우 <a href="#" class="btnPlay"><span>play</span></a> 로 변경 -->
											<!--<a href="#" class="btnPlay"><span>play</span></a>-->
											<a href="#" class="btnNext"><span>next</span></a>
										</div>	
										<span class="pageNum">
											<strong class="now">02</strong>	/ 05
										</span>
									</div>
								</div>
							</div>
						</div>
						<article class="newsArea">
							<div class="newsWrap">
								<h3>NEWS</h3>
								<section>
									<div class="newsBtn">
										<button type="button" class="before">이전 뉴스 보기</button>
										<button type="button" class="next">다음 뉴스 보기</button>
									</div>
									<ul><!-- 요건 1: 버튼 클릭 시 li margin-top 값 조절되어 상하 롤링 ,요건2 : a 태그 공백 포함 50자 말줄임처리 -->
										<li><a href="/home/news/news/view.do?num=1">제 11기 결산공고</a></li>
										<li><a href="/home/news/news/view.do?num=2">액면분할에 따른 구주권 제출 및 채권자 이의 제출 공고</a></li>
										<li><a href="/home/news/news/view.do?num=3">외부감사인 선임 공고</a></li>
									</ul>
								</section>
							</div>
						</article><!-- //newsArea -->
						<em class="scrollDown"><span class="hidden">scroll down</span></em>
					</div>
					<!-- //section1 -->

					<!-- section2 -->
					<div class="section2" style="height:770px">
						<div class="inner">
							<h3 class="sTit">펀드 현황을 확인하세요.<em>KTB네트워크의 성장과 함께 하세요.</em></h3>
							<ul class="tabArea">
								<li><a href="#tab01" aria-selected="true" class="on" style="font-size: 18px;">청산펀드 현황</a></li>
								<li><a href="#tab02" style="font-size: 18px;">운용펀드 현황</a></li>
							</ul>
							<div class="tabCon">
								<!-- 청산펀드 현황 -->
								<div id="tab01" class="list">
									<h4 class="hidden">청산펀드 현황</h4>
									<ul>
										<li>
											<dl>
												<dt class="name">펀드수</dt>
												<dd class="num">52</dd>
											</dl>
										</li>
										<li>
											<dl>
												<dt class="name">납입총액<span>(단위 : 억원)</span></dt>
												<dd class="num">12,642</dd>
											</dl>
										</li>
										<li>
											<dl>
												<dt class="name">분배총액<span>(단위 : 억원)</span></dt>
												<dd class="num">19,649</dd>
											</dl>
										</li>
										<li>
											<dl>
												<dt class="name">IRR<span>(단위 : %)</span></dt>
												<dd class="num">20.02</dd>
											</dl>
										</li>
									</ul>
									<span class="tooltip">
										<em>작성기준</em>
										<a href="#" class="tipOpen"><span>도움말</span></a><!-- 클릭 시 class="on" 추가 -->
										<span class="msg">
											<strong class="tit">작성기준</strong>
											<span class="txt">- 2018.12.31 현재<br>- 2000.01.01 이후 청산한 펀드 기준<br>- IRR : 성과보수 포함, 납입금액 가중평균 수익률</span>
											<a href="#" class="btnClose on"><span>닫기</span></a><!-- 클릭 시 <a class="tipOpen on"> 의 class="on" 삭제 -->
										</span>
									</span>
								</div>
								<!-- //청산펀드 현황 -->
								<!-- 운용펀드 현황 -->
								<div id="tab02" class="list" style="display:none;">
									<h4 class="hidden">운용펀드 현황</h4>
									<ul>
										<li>
											<dl>
												<dt class="name">펀드수</dt>
												<dd class="num">15</dd>
											</dl>
										</li>
										<li>
											<dl>
												<dt class="name">약정총액<span>(단위 : 억원)</span></dt>
												<dd class="num">8,535</dd>
											</dl>
										</li>
										<li>
											<dl>
												<dt class="name">투자총액<span>(단위 : 억원)</span></dt>
												<dd class="num">5,252</dd>
											</dl>
										</li>
										<li>
											<dl>
												<dt class="name">IRR(e)<span>(단위 : %)</span></dt>
												<dd class="num">16.91</dd>
											</dl>
										</li>
									</ul>
									<span class="tooltip">
										<em>작성기준</em>
										<a href="#" class="tipOpen"><span>도움말</span></a><!-- 클릭 시 class="on" 추가 -->
										<span class="msg">
											<strong class="tit">작성기준</strong>
											<span class="txt">- 2018.12.31 현재<br>- 청산중인 펀드 제외<br>- IRR(e) : 성과보수 포함, 납입금액 가중평균 수익률</span>
											<a href="#" class="btnClose on"><span>닫기</span></a><!-- 클릭 시 <a class="tipOpen on"> 의 class="on" 삭제 -->
										</span>
									</span>
								</div>
								<!-- //운용펀드 현황 -->
							</div><!-- //tabCon -->
						</div><!-- //fundProduct -->
					</div>
					<!-- //section2 -->

					<!-- section3 -->
					<div class="section3" style="height:850px">
						<div class="inner">
							<h3 class="sTit">운용철학을 소개합니다.<em>장기적이고 안정적인 운용성과를 추구합니다.</em></h3>
							<div class="imgArea"><img src="/static/home/kr/images/main/img_goal.png" alt="Compliance, Active Value Creation, Alignment of Interest"></div>
							<div class="conArea">
								<h4>운용철학</h4>
								<a href="/home/watwedo/philosophy.do" class="moreBtn">자세히보기</a>
								<ul>
									<li><strong>Alignment of Interest</strong>펀드 참여자 간의 이해관계 일치를 통한 공동의 목표 부여</li>
									<li><strong>Active Value Creation</strong>투자업체 지원 및 가치창출 활동을 통해 지속 가능한 성장도모, <br>투자업체 성공과 목표수익 달성</li>
									<li><strong>Compliance</strong>Compliance 체계 및 점검활동 통한 펀드 운용위험 통제, <br>Moral Hazard 예방</li>
								</ul>								
							</div>
						</div>
					</div>
					<!-- //section3 -->
					<div class="etcArea">
						<div class="inner">							
							<div class="member">
								<p>성공적인 투자를 위해 <br>KTB네트워크의 구성원들이<br>함께 합니다.</p>
								<a href="/home/whoweare/korea.do">Who We Are</a>
							</div>
							<div class="partners">
								<p><strong>Meet Our Partners</strong>가장 든든한 투자파트너가 되겠습니다.</p>
								<a href="/home/meetourpartners/all.do" class="moreBtn">자세히보기</a>
							</div>
						</div>
					</div>
				</div><!-- //sectionWrap -->
			</article><!-- //content -->						
		</section>