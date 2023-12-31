<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/import/taglib.jspf" %>

		<section id="container" class="container">
			<nav class="nav">
				<ol class="navArea"><li>HOME</li><li>News</li></ol>
			</nav>
			<div class="content">
				<div class="visualArea">
					<div class="inner">
						<h1 class="pageTit">News</h1>
						<p class="pageTxt">KTB네트워크의 공지사항을 안내해드립니다.</p>
					</div>
				</div>
				<div class="tabArea">
					<ul class="pageTab">
						<li class="on"><a href="/home/info/news/list.do" aria-selected="true">News</a></li>
						<li><a href="/home/info/notice/list.do">공지사항</a></li>
						<li><a href="/home/info/announcement/list.do">경영공지</a></li>
						<li><a href="/home/info/ir.do">IR</a></li>
						<li><a href="/home/info/esg.do">ESG</a></li>
					</ul>
				</div>
				<div class="inner">
					<ul class="boardList noticeList">
						<c:if test="${vo.page eq '1' }">
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=1">
									<strong class="tit">제 11기 결산공고</strong>
									<div class="con"><span class="date">2019.03.08</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=2">
									<strong class="tit">액면분할에 따른 구주권 제출 및 채권자 이의 제출 공고</strong>
									<div class="con"><span class="date">2018.08.01</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=3">
									<strong class="tit">외부감사인 선임 공고</strong>
									<div class="con"><span class="date">2018.04.09</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=4">
									<strong class="tit">제 10기 결산공고</strong>
									<div class="con"><span class="date">2018.03.06</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=5">
									<strong class="tit">제 9기 결산공고</strong>
									<div class="con"><span class="date">2017.03.02</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=6">
									<strong class="tit">제 8기 결산공고</strong>
									<div class="con"><span class="date">2016.03.07</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=7">
									<strong class="tit">외부감사인 선임 공고</strong>
									<div class="con"><span class="date">2016.02.24</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=8">
									<strong class="tit">제 7기 결산공고</strong>
									<div class="con"><span class="date">2015.03.20</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=9">
									<strong class="tit">제 6기 결산공고</strong>
									<div class="con"><span class="date">2014.03.17</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=10">
									<strong class="tit">미크론정공(주) 주식 공매 공고</strong>
									<div class="con"><span class="date">2013.12.10</span></div>
								</a>
							</li>
						</c:if>

						<c:if test="${vo.page eq '2'}">
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=11">
									<strong class="tit">외부감사인 선임 공고</strong>
									<div class="con"><span class="date">2013.05.30</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=12">
									<strong class="tit">제 5기 결산공고</strong>
									<div class="con"><span class="date">2013.05.20</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=13">
									<strong class="tit">제 4기 결산공고</strong>
									<div class="con"><span class="date">2012.06.25</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=14">
									<strong class="tit">(주)다림비젼 주식 공매 공고</strong>
									<div class="con"><span class="date">2011.10.25</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=15">
									<strong class="tit">제 3기 결산공고</strong>
									<div class="con"><span class="date">2011.06.13</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=16">
									<strong class="tit">주권제출 공고</strong>
									<div class="con"><span class="date">2011.02.22</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=17">
									<strong class="tit">채권자 이의제출 공고</strong>
									<div class="con"><span class="date">2011.02.21</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=18">
									<strong class="tit">케이티비네트워크 상반기 가결산 공시</strong>
									<div class="con"><span class="date">2011.01.24</span></div>
								</a>
							</li>
							<li>
								<a href="/home/news/news/view.do?page=<c:out value="${vo.page}"/>&num=19">
									<strong class="tit">상호 및 공고방법 변경</strong>
									<div class="con"><span class="date">2010.10.29</span></div>
								</a>
							</li>
						</c:if>



					</ul>
					<div class="paginate">
						<a href="/home/news/news/list.do?page=1" class="arrow first">처음페이지로 이동</a>
						<a href="/home/news/news/list.do?page=1" class="arrow prev">이전페이지로 이동</a>
						<span class="num">
							<a href="/home/news/news/list.do?page=1" <c:if test="${vo.page eq '1'}">class="on"</c:if>>1</a>
							<a href="/home/news/news/list.do?page=2" <c:if test="${vo.page eq '2'}">class="on"</c:if>>2</a>
						</span>
						<a href="/home/news/news/list.do?page=2" class="arrow next">다음페이지로 이동</a>
						<a href="/home/news/news/list.do?page=2" class="arrow end">마지막페이지로 이동</a>
					</div>
				</div>
			</div>
		</section>
</form>
