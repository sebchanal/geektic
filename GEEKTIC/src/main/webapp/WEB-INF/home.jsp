<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>
<title>Geektic</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<!--CSS-->
<link type="text/css" rel="stylesheet" href="css/styles.css" />
<link type="text/css" rel="stylesheet" href="css/checkbox-radio.css" />
<!--Fonts-->
<link href='http://fonts.googleapis.com/css?family=PT+Sans|Kreon'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Bubbler+One'
	rel='stylesheet' type='text/css' />
<!--JS-->
<script type="text/javascript" src="js/js.js"></script>
</head>

<body>
	<form action="/GEEKTIC/advancedSearch" method="POST">
		<div id="headerTop">
			<header>
				<div id="head">
					GeekTic
					<nav>
						<input name="pseudo" type="text" id="search" /> <a id="a_search"
							href="#" onclick="divshow()"><img class="advanced"
							alt="Recherche avanc�e" id="show"
							src="https://a.gfx.ms/is/invis.gif" /></a> <a id="a_search" href="#"
							onclick="divhide()"><img class="advanced"
							alt="Recherche avanc�e" id="hide"
							src="https://a.gfx.ms/is/invis.gif" /></a>
					</nav>
				</div>
			</header>
		</div>

		<div id="divAdvanced">
			<div id="headAdvanced">
				<table>
					<tr>
						<td>
							<ul id="ulAdvanced">
								<li id="title-search">Recherche avanc&eacute;e</li>
							</ul>
						</td>
					</tr>
					<tr>
						<td>
							<ul id="ulAdvanced">
								<li>Sexe :</li>
								<li><input type="radio" name="sexe" id="radio-male"
									value="false" /><label for="radio-male">Homme</label></li>
								<li><input type="radio" name="sexe" id="radio-female"
									value="true" /><label for="radio-female">Femme</label></li>
								<li><input type="radio" name="sexe"
									id="radio-indeterminate" value="tous" checked="checked" /><label
									for="radio-indeterminate">Tous</label></li>
							</ul>
						</td>
					</tr>
					<tr>
						<td>
							<ul id="ulAdvanced">
								<li>Centres d'int&eacute;r&ecirc;t :</li>
								<li><input type="checkbox" name="check" id="check-java"
									value="1" /><label for="check-java">Java</label></li>
								<li><input type="checkbox" name="check" id="check-php"
									value="4" /><label for="check-php">Php</label></li>
								<li><input type="checkbox" name="check" id="check-html"
									value="2" /><label for="check-html">Html 5</label></li>
								<li><input type="checkbox" name="check" id="check-vb" value="8"/><label
									for="check-vb">Vb.net</label></li>
								<li><input type="checkbox" name="check" id="check-csharp" value="6"/><label
									for="check-csharp">C#.net</label></li>
								<li><input type="checkbox" name="check" id="check-c++" value="7"/><label
									for="check-c++">C++</label></li>
								<li><input type="checkbox" name="check" id="check-js" value="5"/><label
									for="check-js">Java script</label></li>
								<li><input type="checkbox" name="check" id="check-css" value="3"/><label
									for="check-css">CSS 3</label></li>
							</ul>
						</td>
					</tr>
					<tr>
						<td colspan="3"><input type="submit" name="go" id="go"
							value="Rechercher" /></td>
					</tr>
				</table>
			</div>
		</div>
	</form>
</body>

</html>