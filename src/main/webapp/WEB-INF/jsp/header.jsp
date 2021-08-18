<nav class="navbar navbar-expand-md bg-dark navbar-dark fixed-top ">
    <a class="navbar-brand" href="/accueil">
	<img class="logo" src="/images/logo.png" height="autox" width="150px"></a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNav" aria-controls="navbarNav"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav mr-auto">
			<c:if test="${sessionScope.connected == null}">
				<li class="nav-item"><a class="navbar-brand " href="/connexion/login">Connexion</a>
				</li>
			</c:if>
			<c:if test="${sessionScope.connected  == null}">
				<li class="nav-item"><a class="navbar-brand" href="/connexion/signup">S'inscrire</a>
				</li>
			</c:if>
			<c:if test="${sessionScope.connected == true}">
				<li class="nav-item"><a class="navbar-brand" href="/api/borrowings/user">Mes emprunts</a></li>
			</c:if>
			<c:if test="${sessionScope.connected == true}">
            	<li class="nav-item"><a class="navbar-brand" href="/api/books">Nos livres</a></li>
            </c:if>
            <c:if test="${sessionScope.connected == true}">
			<li class="nav-item"><a href="/api/books/search"><img
					src="/images/loupe.png"></a></li>
			</c:if>
		</ul>
	</div>

</nav>