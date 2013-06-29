(ns pygdown.serializer
  (:import (org.pegdown.ast CodeNode))
  (:gen-class :extends org.pegdown.ToHtmlSerializer
              :exposes {printer {:get printer}})
  (:require [pygmenter.core :as pygmenter]))


(defn -visit-CodeNode [this node]
  (let [code (.getText node)
        highlighted-code (pygmenter/pygmentize code)]
    (.print (.printer this) highlighted-code)))