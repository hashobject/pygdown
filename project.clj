(defproject pygdown "0.1.3"
  :description "A Clojure library for markdown processing
  and html generating with syntax higlighting."
  :signing {:gpg-key "HashObject Ltd <team@hashobject.com>"}
  :url "https://github.com/hashobject/pygdown"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :aot [pygdown.serializer
        pygdown.core]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.pegdown/pegdown "1.4.0"]
                 [pygmenter "0.1.1"]])
