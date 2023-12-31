<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/import/taglib.jspf" %>

	<section class="container">
		<div class="contents">
			<div class="visualArea">
				<h1 class="pageTit">Who We Are</h1>
				<p role="text" class="pageTxt">성공적인 투자를 위해<br>KTB네트워크의 구성원들이 함께 합니다.</p>
			</div>
			<div class="personIntro">
				<div class="tabType1">
					<ul>
						<li><a href="/home/whoweare/korea.do">KOREA</a></li>
						<li class="on"><a href="/home/whoweare/china.do" aria-selected="true">CHINA</a></li>
					</ul>
				</div>
				<div class="tabType2 tabToggle">
					<ul>
						<li class="on"><a href="#tab01" aria-selected="true">Investment</a></li>
						<li><a href="#tab02">Management</a></li>
					</ul>
				</div>
				<!-- Investment -->
				<div id="tab01" class="tabCont" style="display:block">
					<h2 class="hidden">CHINA Investment</h2> <!-- 해당 탭 타이틀 -->
					<ul class="personList">
						<li>
							<a href="#personDeatail01" role="button">
								<span><img src="/static/mobile/kr/images/contents/img_china_invest_01.jpg" alt="홍원호 부사장 사진" /></span>
								<span>
									<em>홍원호</em>
									부사장(소장)
								</span>
							</a>
						</li>
						<li>
							<a href="#personDeatail02" role="button">
								<span><img src="/static/mobile/kr/images/contents/img_china_invest_02.jpg" alt="Amy Yeh 전무 사진" /></span>
								<span>
									<em>Amy Yeh</em>
									전무
								</span>
							</a>
						</li>
						<li>
							<a href="#personDeatail03" role="button">
								<span><img src="/static/mobile/kr/images/contents/img_china_invest_03.jpg" alt="현지훈 이사 사진" /></span>
								<span>
									<em>현지훈</em>
									이사
								</span>
							</a>
						</li>
						<li>
							<a href="#personDeatail04" role="button">
								<span><img src="/static/mobile/kr/images/contents/img_china_invest_04.jpg" alt="Grace 팀장 사진" /></span>
								<span>
									<em>Grace</em>
									팀장
								</span>
							</a>
						</li>
						<!-- 0415 수정 -->
						<li>
							<a href="#person_manageDeatail02" role="button">
								<span><img src="/static/mobile/kr/images/contents/img_china_manage_02.jpg" alt="Xu Tingting 팀장 사진" /></span>
								<span>
									<em>Xu Tingting</em>
									팀장
								</span>
							</a>
						</li>
						<!-- //0415 수정 -->
					</ul>
				</div>
				<!-- //Investment -->

				<!-- Management -->
				<div id="tab02" class="tabCont">
					<h2 class="hidden">CHINA Management</h2> <!-- 해당 탭 타이틀 -->
					<ul class="personList">
						<li>
							<a href="#person_manageDeatail01" role="button">
								<span><img src="/static/mobile/kr/images/contents/img_china_manage_01.jpg" alt="박연화 팀장 사진" /></span>
								<span>
									<em>박연화</em>
									팀장
								</span>
							</a>
						</li>
						<!-- 0415 수정 -->
						<!--<li>
							<a href="#person_manageDeatail02" role="button">
								<span><img src="/static/mobile/kr/images/contents/img_china_manage_02.jpg" alt="Xu Tingting 팀장 사진" /></span>
								<span>
									<em>Xu Tingting</em>
									팀장
								</span>
							</a>
						</li>-->
						<!-- //0415 수정 -->
					</ul>
				</div>
				<!-- //Management -->
				<div class="btnArea">
					<a href="http://ktbchina.com/index.html" target="_blank" class="btnL">중국 사이트 바로가기</a>
				</div>
			</div>
		</div><!-- //contents -->
	</section>

	<!-- 팀원소개 investment(L) -->
	<!-- 홍원호 부사장 -->
	<div class="fullLayer" id="personDeatail01">
		<h2 class="layerTit">Who We Are</h2>
		<div class="layerCont" tabindex="0">
			<div class="personDetail">
				<span><img src="/static/mobile/kr/images/contents/img_china_invest_pop01.jpg" alt="홍원호 부사장 사진" /></span>
				<div class="deatilCon">
					<dl>
						<dt class="name">홍원호</dt>
						<dd class="position">CHINA / 부사장(소장)</dd>
						<dt>주요경력</dt>
						<dd>
							<ul class="listDep1">
								<li>서강대학교 경영학과</li>
								<li>국민은행</li>
								<li>KTB네트워크</li>
							</ul>
						</dd>
					</dl>
				</div>
			</div>
		</div>
		<button type="button" class="layerClose">닫기</button>
	</div>
	<!-- //홍원호 부사장 -->
	<!-- Amy Yeh 전무 -->
	<div class="fullLayer" id="personDeatail02">
		<h2 class="layerTit">Who We Are</h2>
		<div class="layerCont" tabindex="0">
			<div class="personDetail">
				<span><img src="/static/mobile/kr/images/contents/img_china_invest_pop02.jpg" alt="Amy Yeh 전무 사진" /></span>
				<div class="deatilCon">
					<dl>
						<dt class="name">Amy Yeh</dt>
						<dd class="position">CHINA / 투자팀 / 전무</dd>
						<dt>주요경력</dt>
						<dd>
							<ul class="listDep1">
								<li>University of Maryland MBA</li>
								<li>Softbank China VC, PWC</li>
							</ul>
						</dd>
					</dl>
				</div>
			</div>
		</div>
		<button type="button" class="layerClose">닫기</button>
	</div>
	<!-- //Amy Yeh 전무 -->
	<!-- 현지훈 이사 -->
	<div class="fullLayer" id="personDeatail03">
		<h2 class="layerTit">Who We Are</h2>
		<div class="layerCont" tabindex="0">
			<div class="personDetail">
				<span><img src="/static/mobile/kr/images/contents/img_china_invest_pop03.jpg" alt="현지훈 이사 사진" /></span>
				<div class="deatilCon">
					<dl>
						<dt class="name">현지훈</dt>
						<dd class="position">CHINA / 투자팀 / 이사</dd>
						<dt>주요경력</dt>
						<dd>
							<ul class="listDep1">
								<li>연세대학교 경제학과</li>
								<li>IMM 인베스트먼트</li>
								<li>KTB네트워크</li>
							</ul>
						</dd>
					</dl>
				</div>
			</div>
		</div>
		<button type="button" class="layerClose">닫기</button>
	</div>
	<!-- //현지훈 이사 -->
	<!-- Grace 팀장 -->
	<div class="fullLayer" id="personDeatail04">
		<h2 class="layerTit">Who We Are</h2>
		<div class="layerCont" tabindex="0">
			<div class="personDetail">
				<span><img src="/static/mobile/kr/images/contents/img_china_invest_pop04.jpg" alt="Grace 팀장 사진" /></span>
				<div class="deatilCon">
					<dl>
						<dt class="name">Grace</dt>
						<dd class="position">CHINA / 투자팀 / 팀장</dd>
						<dt>주요경력</dt>
						<dd>
							<ul class="listDep1">
								<li>Fudan University 경제학과</li>
								<li>Deloitte Touche Tohmatsu</li>
								<li>Certified Public</li>
								<li>Accountants LLP</li>
							</ul>
						</dd>
						<dt>업무</dt>
						<dd>
							<ul class="listDep1">
								<li>투자심사 및 리서치</li>
							</ul>
						</dd>
					</dl>
				</div>
			</div>
		</div>
		<button type="button" class="layerClose">닫기</button>
	</div>
	<!-- //Grace 팀장 -->
	<!-- //팀원소개 investment(L) -->

	<!-- 팀원소개 management(L) -->
	<!-- 박연화 팀장 -->
	<div class="fullLayer" id="person_manageDeatail01">
		<h2 class="layerTit">Who We Are</h2>
		<div class="layerCont" tabindex="0">
			<div class="personDetail">
				<span><img src="/static/mobile/kr/images/contents/img_china_manage_pop01.jpg" alt="박연화 팀장 사진" /></span>
				<div class="deatilCon">
					<dl>
						<dt class="name">박연화</dt>
						<dd class="position">CHINA / 관리팀 / 팀장</dd>
						<dt>주요경력</dt>
						<dd>
							<ul class="listDep1">
								<li>상해사범대학교 부동산경영학과</li>
								<li>KTB투자증권</li>
								<li>한화종합화학 상해법인</li>
							</ul>
						</dd>
						<dt>업무</dt>
						<dd>
							<ul class="listDep1">
								<li>행정/재무관리</li>
							</ul>
						</dd>
					</dl>
				</div>
			</div>
		</div>
		<button type="button" class="layerClose">닫기</button>
	</div>
	<!-- //박연화 팀장 -->
	<!-- Xu Tingting 팀장 -->
	<div class="fullLayer" id="person_manageDeatail02">
		<h2 class="layerTit">Who We Are</h2>
		<div class="layerCont" tabindex="0">
			<div class="personDetail">
				<span><img src="/static/mobile/kr/images/contents/img_china_manage_pop02.jpg" alt="Xu Tingting 팀장 사진" /></span>
				<div class="deatilCon">
					<dl>
						<dt class="name">Xu Tingting</dt>
						<dd class="position">CHINA / 관리팀 / 팀장</dd>
						<dt>주요경력</dt>
						<dd>
							<ul class="listDep1">
								<li>경희대학교 한국어학과</li>
								<li>경희대학교 한국어학 대학원</li>
								<li>Art100 Gallery</li>
								<li>우리은행</li>
							</ul>
						</dd>
						<dt>업무</dt>
						<dd>
							<ul class="listDep1">
								<li>펀드 및 투자관리</li>
							</ul>
						</dd>
					</dl>
				</div>
			</div>
		</div>
		<button type="button" class="layerClose">닫기</button>
	</div>
	<!-- //Xu Tingting 팀장 -->
	<!-- //팀원소개 investment(L) -->
	
