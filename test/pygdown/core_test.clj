(ns pygdown.core-test
  (:use clojure.test
        pygdown.core))

(deftest serializer-test
  (testing "should return html"
    (is (= "<h3>Header</h3><p><div class=\"highlight\"><pre><span class=\"p\">(</span><span class=\"k\">def</span> <span class=\"nf\">x</span> <span class=\"mi\">1</span><span class=\"p\">)</span>\n</pre></div>\n</p>"
           (to-html "###Header\n```(def x 1)```")))))
