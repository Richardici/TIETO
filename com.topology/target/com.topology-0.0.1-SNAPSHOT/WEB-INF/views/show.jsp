<%@ include file="include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Topology of network</title>
	<link href="<c:url value="/web-resources/show.css" />" rel="stylesheet">
	<script src="https://unpkg.com/gojs/release/go.js"></script>
	<script>
	 function init() {
		    var $ = go.GraphObject.make;  // for conciseness in defining templates

		    var myDiagram =
		      $(go.Diagram, "myDiagramDiv",  // create a Diagram for the DIV HTML element
		        { // enable undo & redo
		          "undoManager.isEnabled": true
		        });

		    // define a simple Node template
		    myDiagram.nodeTemplate =
		      $(go.Node, "Auto",  // the Shape will go around the TextBlock
		        $(go.Shape, "RoundedRectangle",
		          { strokeWidth: 0, fill: "white" },  // default fill is white
		          // Shape.fill is bound to Node.data.color
		          new go.Binding("fill", "color")),
		        $(go.TextBlock,
		          { margin: 8 },  // some room around the text
		          // TextBlock.text is bound to Node.data.key
		          new go.Binding("text", "key"))
		      );

		    // but use the default Link template, by not setting Diagram.linkTemplate

		    // create the model data that will be represented by Nodes and Links
		 
			 
        		
			var nodeDataArray = [];
				<c:forEach var="r" items="${routers}">
				nodeDataArray.push({key: "${r.name}", color: "orange"});
				 <c:forEach var="ip" items="${r.localPc}">	
				 	nodeDataArray.push({key: "${ip}", color: "blue"});
				 </c:forEach>
				</c:forEach>		
			var linkDataArray = [];
			<c:forEach var="r" items="${routers}">
				<c:forEach var="line" items="${r.connectedTo}">
				linkDataArray.push({to: "${line}", from: "${r.name}"});
			</c:forEach>
			<c:forEach var="line" items="${r.localPc}">
				linkDataArray.push({to: "${r.name}", from: "${line}"});
				</c:forEach>
				</c:forEach>
		
			myDiagram.model = new go.GraphLinksModel(nodeDataArray, linkDataArray);	
		}
	</script>

<body onload="init()">
	<div class="content">	
	<div id="myDiagramDiv" style="width: 1000px; height: 600px; border: 1px solid black; margin: auto;"></div>
	</div>
</body>
</html>