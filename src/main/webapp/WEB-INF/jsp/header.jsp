<nav class="navbar navbar-expand-md bg-dark navbar-dark fixed-top ">
	<img class="logo" src="images/logo.png" height="autox" width="150px">
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNav" aria-controls="navbarNav"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav mr-auto">
			<c:if test="${sessionScope.currentUser == null}">
				<li class="nav-item"><a class="navbar-brand " href="connexion">Connexion</a>
				</li>
			</c:if>
			<c:if test="${sessionScope.currentUser == null}">
				<li class="nav-item"><a class="navbar-brand" href="Inscription">S'inscrire</a>
				</li>
			</c:if>
			<li class="nav-item"><a class="navbar-brand" href="accueil">Accueil</a>
			</li>
			<c:if test="${sessionScope.currentUser != null}">
				<li class="nav-item"><a class="navbar-brand" href="Account">Mon
						compte</a></li>
			</c:if>
			<li class="nav-item"><a href="Research"><img
					src="images/loupe.png"></a></li>
		</ul>
	</div>

</nav>