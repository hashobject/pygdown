(ns pygdown.serializer
  (:import (org.pegdown.ast CodeNode ParaNode))
  (:gen-class :extends org.pegdown.ToHtmlSerializer
              :exposes {printer {:get printer}})
  (:require [pygmenter.core :as pygmenter]))


(defn -visit-CodeNode [this node]
  (println "enter code node" (.getText node))
  (let [code (.getText node)
        escaped-code (clojure.string/escape code {\" "\"" \< "<" \> ">" \& "&"})
        highlighted-code (pygmenter/pygmentize escaped-code)]
    (.print (.printer this) highlighted-code)))