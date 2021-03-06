package expo.model;

import utils.Exportable;
import utils.Importable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * Candidatura class.
 *
 * @author by Nuno Bettencourt [nmb@isep.ipp.pt] on 29/05/16.
 */
public class CandidaturaExample /*implements Importable<CandidaturaExample>, Exportable */{
//	private static final String ROOT_ELEMENT_NAME = "candidatura";
//	private static final String DESCRIPTION_ELEMENT_NAME = "description";
//	private static final String KEYWORDS_ELEMENT_NAME = "keywords";
//	private final List<KeywordExample> keywordList = new ArrayList<>();
//	private String description = "";
//
//	/**
//	 * Constructor for CandidaturaExample
//	 *
//	 * @param description CandidaturaDescription
//	 * @param keywordList Keyword List
//	 */
//	public CandidaturaExample(String description, List<KeywordExample> keywordList) {
//		this.description = description;
//		this.keywordList.addAll(keywordList);
//	}
//
//	/**
//	 * Default public constructor.
//	 */
//	public CandidaturaExample() {
//
//	}
//
//	/**
//	 * Obtain Candidatura's description.
//	 *
//	 * @return Candidatura description
//	 */
//	private String getDescription() {
//		return description;
//	}
//
//	/**
//	 * Add a keyword to Candidatura.
//	 *
//	 * @param keyword Keyword to be added.
//	 */
//	public void addKeyword(KeywordExample keyword) {
//		getKeywordList().add(keyword);
//	}
//
//	/**
//	 * Obtain the list of existing keywords.
//	 *
//	 * @return A list of existing keywords.
//	 */
//	public List<KeywordExample> getKeywordList() {
//		return keywordList;
//
//	}
//
//	@Override
//	public Node exportContentToXMLNode() {
//		Node rootNode = null;
//
//		try {
//			DocumentBuilderFactory factory =
//					DocumentBuilderFactory.newInstance();
//			//Create document builder
//			DocumentBuilder builder = factory.newDocumentBuilder();
//
//			//Obtain a new document
//			Document document = builder.newDocument();
//
//			//Create root element
//			Element elementCandidatura = document.createElement(ROOT_ELEMENT_NAME);
//
//			//Create a sub-element
//			Element elementDescription = document.createElement(DESCRIPTION_ELEMENT_NAME);
//
//			//Set the sub-element value
//			elementDescription.setTextContent(getDescription());
//
//			//Add sub-element to root element
//			elementCandidatura.appendChild(elementDescription);
//
//			//Create a sub-element
//			Element elementKeywords = document.createElement(KEYWORDS_ELEMENT_NAME);
//			elementCandidatura.appendChild(elementKeywords);
//
//			//iterate over keywords
//			for (KeywordExample keyword : getKeywordList()
//					) {
//				Node keywordNode = keyword.exportContentToXMLNode();
//				elementKeywords.appendChild(document.importNode(keywordNode, true));
//			}
//
//			//Add root element to document
//			document.appendChild(elementCandidatura);
//
//			//It exports only the element representation to XMÇ, ommiting the XML header
//			rootNode = elementCandidatura;
//
//		} catch (ParserConfigurationException e) {
//			e.printStackTrace();
//			throw new RuntimeException(e);
//		}
//		return rootNode;
//	}
//
//	@Override
//	public CandidaturaExample importContentFromXMLNode(Node node) {
//		try {
//			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//
//			//Create document builder
//			DocumentBuilder builder = factory.newDocumentBuilder();
//
//			//Obtain a new document
//			Document document = builder.newDocument();
//			document.appendChild(document.importNode(node, true));
//
//			NodeList elementsCandidatura = document.getElementsByTagName(ROOT_ELEMENT_NAME);
//
//			Node elementCandidatura = elementsCandidatura.item(0);
//
//			//Get description
//			this.description = elementCandidatura.getFirstChild().getFirstChild().getNodeValue();
//
//			NodeList elementsKeywords = document.getElementsByTagName(KEYWORDS_ELEMENT_NAME);
//
//			NodeList keywords = elementsKeywords.item(0).getChildNodes();
//			for (int position = 0; position < keywords.getLength(); position++) {
//				Node keyword = keywords.item(position);
//				KeywordExample keywordExample = new KeywordExample();
//
//				keywordExample = keywordExample.importContentFromXMLNode(keyword);
//				addKeyword(keywordExample);
//			}
//		} catch (ParserConfigurationException e) {
//			e.printStackTrace();
//			throw new RuntimeException(e);
//		}
//
//		return this;
//	}
//
//	@Override
//	public boolean equals(Object o) {
//		if (this == o) {
//			return true;
//		}
//		if (!(o instanceof CandidaturaExample)) {
//			return false;
//		}
//
//		CandidaturaExample that = (CandidaturaExample) o;
//
//		if (!getDescription().equals(that.getDescription())) {
//			return false;
//		}
//		return getKeywordList().equals(that.getKeywordList());
//
//	}
//
//	@Override
//	public int hashCode() {
//		int result = getDescription().hashCode();
//		result = 31 * result + getKeywordList().hashCode();
//		return result;
//	}
}
