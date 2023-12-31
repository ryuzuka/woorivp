<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/import/taglib.jspf" %>
		<section id="container" class="container">
			<nav class="nav">
				<ol class="navArea"><li>HOME</li><li>What We Do</li></ol>
			</nav>
			<div class="content">
				<div class="visualArea">
					<div class="inner">
						<h1 class="pageTit">What We Do</h1>
						<p class="pageTxt">고객의 가능성과 함께하는 KTB네트워크입니다.</p>
					</div>
				</div>
				<div class="tabArea">
					<ul class="pageTab">
						<li class="on"><a href="/home/watwedo/overview.do" aria-selected="true">Overview</a></li>
						<li><a href="/home/watwedo/history.do">History</a></li>
						<li><a href="/home/watwedo/philosophy.do">Philosophy</a></li>
					</ul>
				</div>
				<div class="inner">
					<h2 class="hidden">Overview</h2>
					<h3 class="titDep2">회사개요</h3>	
					<ul class="infoList">
						<li>회사명<span class="data">KTB네트워크㈜</span></li>
						<li>자본금 / 자기자본<span class="data">400억원/1,162억원</span></li>
						<li>설립일자<span class="data">1981년</span></li>
						<li>매출액 / 영업이익<span class="data">256억원/109억원</span></li>
						<li>대표이사<span class="data">신진호</span></li>
						<li>홈페이지<span class="data">http://www.ktbnetwork.com/</span></li>
						<li>자본금<span class="data">KTB투자증권㈜(100%)</span></li>
						<li>대표전화<span class="data">031-628-6400</span></li>
					</ul>

					<h3 class="titDep2">연도별 운용펀드 자산규모 증감현황</h3>
					<div class="imgInfo"><img src="/static/home/kr/images/contents/img_chart.jpg" alt=""></div>
					<table class="tblH">
						<caption>연도별 운용펀드 자산규모 증감현황</caption>
						<colgroup><col style="width:16%"><col style="width:10.5%" span="8"></colgroup>
						<thead>
							<tr>
								<th scope="col">구분</th>
								<th scope="col">2011</th>
								<th scope="col">2012</th>
								<th scope="col">2013</th>
								<th scope="col">2014</th>
								<th scope="col">2015</th>
								<th scope="col">2016</th>
								<th scope="col">2017</th>
								<th scope="col">2018</th><!-- 0415 수정 -->
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>기말 AUM(약정액)</td>
								<td>750</td>
								<td>1,130</td>
								<td>2,680</td>
								<td>3,362</td>
								<td>3,062</td>
								<td>5,582</td>
								<td>6,432</td>
								<td>8,535</td><!-- 0415 수정 -->
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</section>
