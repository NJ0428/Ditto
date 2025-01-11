<h1>🛍️쇼핑몰 시스템 기술 스택 및 페이지 구성</h1>

<h2>기술 스택:</h2>
<ul>
    <li><strong>백엔드:</strong> Spring Boot</li>
    <li><strong>데이터베이스:</strong> MariaDB</li>
    <li><strong>프론트엔드:</strong> Thymeleaf (템플릿 엔진)</li>
</ul>

<h2>페이지 구성 및 주요 기능</h2>

<h3>1. 소비자 페이지 (Consumer Page)</h3>
<h4>주요 기능:</h4>
<ul>
    <li><strong>상품 목록 보기:</strong> 쇼핑몰에서 제공하는 상품을 목록 형태로 탐색 가능</li>
    <li><strong>상품 상세 페이지:</strong> 개별 상품의 정보(설명, 가격, 이미지 등)를 확인</li>
    <li><strong>장바구니 기능:</strong> 원하는 상품을 장바구니에 추가하고 관리</li>
    <li><strong>주문 및 결제:</strong> 장바구니에 담긴 상품을 주문 및 결제</li>
</ul>

<h4>기능 설명:</h4>
<p>
    소비자는 쇼핑몰의 주요 사용자로, Thymeleaf 템플릿 엔진을 사용하여 상품 정보를 동적으로 렌더링하여 페이지에 표시합니다.
</p>

<h3>2. 셀러 페이지 (Seller Page)</h3>
<h4>주요 기능:</h4>
<ul>
    <li><strong>상품 등록 및 수정:</strong> 셀러가 상품을 등록하거나 정보를 수정</li>
    <li><strong>상품 재고 관리:</strong> 상품별 재고 현황을 확인하고 조정</li>
    <li><strong>주문 및 판매 현황 조회:</strong> 주문된 상품의 상태를 확인하고 관리</li>
</ul>

<h4>기능 설명:</h4>
<p>
    셀러는 자신의 상품 정보를 관리할 수 있으며, MariaDB를 통해 상품 데이터가 저장됩니다.
    Spring Boot REST API를 통해 클라이언트와 서버 간의 데이터 통신을 처리합니다.
</p>

<h3>3. MD 페이지 (MD Page)</h3>
<h4>주요 기능:</h4>
<ul>
    <li><strong>상품 카테고리 및 프로모션 관리:</strong> 전체 상품 카테고리 구조 설정 및 수정</li>
    <li><strong>이벤트 및 배너 설정:</strong> 프로모션 이벤트 및 배너 설정</li>
    <li><strong>품질 및 가격 관리:</strong> 상품 품질과 가격을 조정 및 검토</li>
</ul>

<h4>기능 설명:</h4>
<p>
    MD(상품 기획자)는 전체 상품 구조와 프로모션 이벤트를 관리하며, 효율적인 UI를 통해 손쉽게 카테고리와 이벤트를 등록할 수 있습니다.
    Thymeleaf를 사용하여 페이지를 구성해 직관적인 관리 화면을 제공합니다.
</p>
