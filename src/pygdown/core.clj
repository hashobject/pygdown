(ns pygdown.core
  "Clojure library for markdown processing
  and html generating with syntax higlighting."
  (:import (org.pegdown PegDownProcessor LinkRenderer))
  (:import (org.pegdown.ast CodeNode RootNode)))


(defn to-html [markdown]
  "Method for generating HTML from Markdown.
   String input - string output"
  (let [processor (PegDownProcessor.)
        root-node (.parseMarkdown processor (char-array markdown))
        html (.toHtml (pygdown.serializer. (LinkRenderer.)) root-node)]
    html))
