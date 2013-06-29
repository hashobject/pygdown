(ns pygdown.core
  (:import (org.pegdown PegDownProcessor LinkRenderer))
  (:import (org.pegdown.ast CodeNode RootNode)))




(defn to-html [markdown]
  (let [processor (PegDownProcessor.)
        root-node (.parseMarkdown processor (char-array markdown))
        html (.toHtml (pygdown.serializer. (LinkRenderer.)) root-node)]
    html))




;(char-array "###Header\ntext```(defn hello [] (println \"Hello world!\"))```")
(to-html "```(defn hello [] (println \"Hello world!\"))```")